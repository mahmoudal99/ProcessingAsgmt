import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

public class Galaxy extends PApplet {

    private Star[] stars = new Star[2];
    private PGraphics mask;
    private PImage image, image2;
    private PImage background;
    private Weapons weapons = new Weapons(this);

    public void settings(){
        size(800, 600);
    }

    public void setup() {

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

    public void mousePressed() {
        if(mouseX > 40 && mouseX < 80 && mouseY > 440 && mouseY < 480){
            weapons.chosenWeapon(1);
        }else if(mouseX > 40 && mouseX < 80 && mouseY > 380 && mouseY < 420){
            weapons.chosenWeapon(0);
        }else if(mouseX > 40 && mouseX < 80 && mouseY > 500 && mouseY < 540){
            weapons.chosenWeapon(2);
        }
    }

    float[] xx = new float[6];
    float[] yy = new float[6];


    int x = 0;
    int y = 0;

    public void draw() {
        background(255);
        setup();

        background = loadImage("images/background_p.jpg");
        background(background);
        setup();

        for (int i = 0; i < 2; i++){
            float x = random(800);
            float y = random(500);
            float z = random(width/2);
            stars[i] = new Star(x, y, z, this);
        }

//        xx = new float[]{620, 640, 700, 750, 700, 640, 780, 760};
//        yy = new float[]{500, 450, 420, 440, 580, 550,500, 555};

        // Radar Tracker
        xx = new float[]{620, 640, 700, 750, 780, 760, 700, 640};
        yy = new float[]{500, 450, 420, 440, 500, 555, 580,  550};

        System.out.println(x);
        x++;
        y++;

        if(x == 8){
            x = 0;
            y = 0;
        }
        stroke(0, 255, 0);
        line(700, 500, xx[x], yy[y]);

//        stars[0].drawStar();
//        stars[1].drawStar();
    }

}

