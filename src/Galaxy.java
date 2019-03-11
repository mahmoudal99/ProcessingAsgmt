import processing.core.PApplet;

public class Galaxy extends PApplet {
    public void settings() {
        size(800, 600);
    }

    public void setup() {
        SpaceshipBase spaceshipBase = new SpaceshipBase(this);
        spaceshipBase.drawRect();

        Arc arc1 = new Arc(this, 400, 350, 200, 200, radians(180), radians(360));
        arc1.drawArc();
        Arc arc2 = new Arc(this, 550, 380, 160, 160, radians(210), radians(390));
        arc2.drawArc();
        Arc arc3 = new Arc(this,250, 380, 160, 160, radians(150), radians(330));
        arc3.drawArc();

    }

    public void draw() {
        background(255);
        setup();
    }
}
