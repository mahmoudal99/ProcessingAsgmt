import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

public class Galaxy extends PApplet{

    Star[] stars = new Star[2];
    PGraphics mask;
    PImage image;
    PImage background;

    public void settings(){
        size(800, 600);
    }

    public void setup() {

        Planet planet = new Planet(this);
        planet.drawPlanet();
        image = loadImage("images/planet.png");
        image(image, 600, 0, 400, 400);

        fill(124,252,0);
        rect(0, 300, 800, 500);


        for (int i = 0; i < 2; i++){
            float x = random(600);
            float y = random(300);

            float z = random(width/2);
            float pz = z;

            stars[i] = new Star(x, y, z, this);
        }

        stars[0].drawStar();
        stars[1].drawStar();

    }

    public void draw() {
        background = loadImage("images/background_p.jpg");
        background(background);
        setup();
    }
}