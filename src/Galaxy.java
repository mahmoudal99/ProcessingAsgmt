import processing.core.PApplet;
import processing.core.PImage;

public class Galaxy extends PApplet {
    public void settings() {
        size(800, 600);
    }

    PImage spaceShipImage;

    public void setup() {
        SpaceshipBase spaceshipBase = new SpaceshipBase(this);
        spaceshipBase.drawRect();

        Dashboard dashboard = new Dashboard(this);
        dashboard.drawDashboard();

    }

    public void draw() {
        background(255);
        setup();
    }
}
