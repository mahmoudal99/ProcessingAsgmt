import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;
import java.io.FileInputStream;

public class Galaxy extends PApplet {

    private Star[] stars = new Star[2];
    private PGraphics mask;
    private PImage image, image2;
    private PImage background;
    private Weapons weapons = new Weapons(this);
    private float[] xCoordinate = new float[6];
    private float[] yCoordinate = new float[6];

    private float[] xEnemyCoordinate = new float[6];
    private float[] yEnemyCoordinate = new float[6];

    int x = 0;
    int y = 0;
    int xCounter = 0;
    int yCounter = 0;

    boolean startShooting = false;


    public void settings(){
        size(800, 600);
    }

    public void setup() {

//        frameRate(60);
        Spaceship spaceshipBase = new Spaceship(this);
        spaceshipBase.drawRect();

        Planet planet = new Planet(this, 650, 160, 160, 160);
        planet.drawPlanet();
        image = loadImage("images/planet.png");
        image(image, 570, 80, 160, 160);

        Planet planet2 = new Planet(this, 140, 70, 100, 100);
        planet2.drawPlanet();
        image2 = loadImage("images/planet2.png");
        image(image2, 90, 20, 100, 100);

        weapons.drawWeapons();

    }

    int seconds = 0;

    public void mousePressed() {

        System.out.println(mouseX + " " + mouseY);

        if(mouseX > 40 && mouseX < 80 && mouseY > 440 && mouseY < 480){
            weapons.chosenWeapon(1);
        }else if(mouseX > 40 && mouseX < 80 && mouseY > 380 && mouseY < 420){
            weapons.chosenWeapon(0);
        }else if(mouseX > 40 && mouseX < 80 && mouseY > 500 && mouseY < 540){
            weapons.chosenWeapon(2);
        }else if(mouseX > 335 && mouseX < 365 && mouseY > 315 && mouseY < 345){
            startShooting = true;
        }

//        startShooting = false;
//        delay(10000);
    }

    public void draw() {
        background(255);

        background = loadImage("images/background_p.jpg");
        background(background);
        setup();

        for (int i = 0; i < 2; i++){
            float x = random(800);
            float y = random(500);
            float z = random(width/2);
            stars[i] = new Star(x, y, z, this);
        }

        animateRadar();
        animateEnemy();

        if(startShooting){
            weapons.animateLaser(true);
        }
        weapons.animateLaser(false);
        startShooting = false;
    }



    private void animateRadar(){
        // Radar Coordinates
        xCoordinate = new float[]{620, 640, 700, 750, 780, 760, 700, 640};
        yCoordinate = new float[]{500, 450, 420, 440, 500, 555, 580,  550};

        x++;
        y++;

        if(x == 8){
            x = 0;
            y = 0;
        }
        stroke(0, 255, 0);
        line(700, 500, xCoordinate[x], yCoordinate[y]);
    }

    private void animateEnemy(){
        xEnemyCoordinate = new float[]{670, 675, 680, 685, 685, 685};
        yEnemyCoordinate = new float[]{475, 470, 475, 465, 455, 450};

        xCounter++;
        yCounter++;

        if(xCounter == 6){
            xCounter = 0;
            yCounter = 0;
        }

        Circle enemyLocation = new Circle(this, xEnemyCoordinate[xCounter], yEnemyCoordinate[yCounter], 10);
        enemyLocation.setColor(200,0,0);
        enemyLocation.drawCircle();
    }

}

