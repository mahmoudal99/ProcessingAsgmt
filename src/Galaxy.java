import processing.core.PApplet;

public class Galaxy extends PApplet {
    public void settings() {
        size(800, 600);
    }

    public void setup() {
        SpaceshipBase spaceshipBase = new SpaceshipBase(this);
        spaceshipBase.drawRect();
    }

    public void draw() {
        background(0);
        setup();
    }
}
