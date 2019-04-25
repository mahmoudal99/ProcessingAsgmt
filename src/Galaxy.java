import processing.core.PApplet;
import processing.core.PImage;


public class Galaxy extends PApplet {

    private Weapons weapons = new Weapons(this);

    private int x = 0;
    private int y = 0;
    private int xCounter = 0;
    private int yCounter = 0;
    private int yIndex = 0;

    private boolean startShooting = false;


    public void settings() {
        size(800, 600);
    }

    public void setup() {

        frameRate(24);

        Spaceship spaceshipBase = new Spaceship(this);
        spaceshipBase.drawRect();

        Planet planet = new Planet(this, 650, 160, 160, 160);
        planet.drawPlanet();

        PImage planetImage = loadImage("images/planet.png");
        image(planetImage, 570, 80, 160, 160);

        Planet planet2 = new Planet(this, 140, 70, 100, 100);
        planet2.drawPlanet();

        PImage planetImage2 = loadImage("images/planet2.png");
        image(planetImage2, 90, 20, 100, 100);

        weapons.drawWeapons();

        HandScanner handScanner = new HandScanner(this);
        handScanner.drawHandScanner();
    }

    public void mousePressed() {

        if (mouseX > 40 && mouseX < 80 && mouseY > 440 && mouseY < 480) {
            weapons.chosenWeapon(1);
        } else if (mouseX > 40 && mouseX < 80 && mouseY > 380 && mouseY < 420) {
            weapons.chosenWeapon(0);
        } else if (mouseX > 40 && mouseX < 80 && mouseY > 500 && mouseY < 540) {
            weapons.chosenWeapon(2);
        } else if (mouseX > 335 && mouseX < 365 && mouseY > 315 && mouseY < 345) {
            startShooting = true;
        }
    }

    public void draw() {
        background(255);

        PImage background = loadImage("images/background_p.jpg");
        background(background);
        setup();

        animateRadar();
        animateEnemy();
        animateHandScanner();

        if (startShooting) {
            weapons.animateLaser(true);
        }
        weapons.animateLaser(false);
        startShooting = false;
    }

    private void animateHandScanner() {

        float[] yIndexs = new float[]{460, 470, 480, 490, 500, 510, 520, 530, 540};

        yIndex++;

        if (yIndex == 9) {
            yIndex = 0;
        }

        stroke(0, 255, 0);
        line(130, yIndexs[yIndex], 210, yIndexs[yIndex]);
    }

    private void animateRadar() {
        // Radar Coordinates
        float[] xCoordinate = new float[]{620, 640, 700, 750, 780, 760, 700, 640};
        float[] yCoordinate = new float[]{500, 450, 420, 440, 500, 555, 580, 550};

        x++;
        y++;

        if (x == 8) {
            x = 0;
            y = 0;
        }
        stroke(0, 255, 0);
        line(700, 500, xCoordinate[x], yCoordinate[y]);
    }

    private void animateEnemy() {
        float[] xEnemyCoordinate = new float[]{670, 675, 680, 685, 685, 685};
        float[] yEnemyCoordinate = new float[]{475, 470, 475, 465, 455, 450};

        xCounter++;
        yCounter++;

        if (xCounter == 6) {
            xCounter = 0;
            yCounter = 0;
        }

        Circle enemyLocation = new Circle(this, xEnemyCoordinate[xCounter], yEnemyCoordinate[yCounter], 10);
        enemyLocation.setColor(200, 0, 0);
        enemyLocation.drawCircle();
    }

}

