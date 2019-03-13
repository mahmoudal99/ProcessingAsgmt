import processing.core.PApplet;
<<<<<<< HEAD

public class Galaxy extends PApplet {
    public void settings() {
=======
import processing.core.PGraphics;
import processing.core.PImage;

public class Galaxy extends PApplet{

    Star[] stars = new Star[2];
    PGraphics mask;
    PImage image, image2;
    PImage background;

    public void settings(){
>>>>>>> background
        size(800, 600);
    }

    public void setup() {
<<<<<<< HEAD
        Spaceship spaceshipBase = new Spaceship(this);
        spaceshipBase.drawRect();
=======

        Planet planet = new Planet(this, 650, 160, 160, 160);
        planet.drawPlanet();
        image = loadImage("images/planet.png");
        image(image, 570, 80, 160, 160);

        Planet planet2 = new Planet(this, 140, 70, 100, 100);
        planet2.drawPlanet();
        image2 = loadImage("images/planet2.png");
        image(image2, 90, 20, 100, 100);
>>>>>>> background

    }

    public void draw() {
<<<<<<< HEAD
        background(255);
        setup();
    }
}
=======
        background = loadImage("images/background_p.jpg");
        background(background);
        setup();

        for (int i = 0; i < 2; i++){
            float x = random(800);
            float y = random(500);
            float z = random(width/2);
            stars[i] = new Star(x, y, z, this);
        }

        stars[0].drawStar();
        stars[1].drawStar();
    }
}
>>>>>>> background
