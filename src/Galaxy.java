import processing.core.PApplet;

public class Galaxy extends PApplet {
    public void settings() {
        size(800, 600);
    }

    public void setup() {
        Spaceship spaceshipBase = new Spaceship(this);
        spaceshipBase.drawRect();

    }

    public void draw() {
        background(255);
        setup();
    }
}
