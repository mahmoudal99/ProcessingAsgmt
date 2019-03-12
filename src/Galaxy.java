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

        Arc arc1 = new Arc(this, 400, 350, 200, 200, radians(180), radians(360));
        arc1.drawArc();
        Arc rightArc = new Arc(this, 550, 380, 160, 160, radians(210), radians(390));
        rightArc.drawArc();
        Arc leftArc = new Arc(this,250, 380, 160, 160, radians(150), radians(330));
        leftArc.drawArc();

        Circle leftDashBoardCircle = new Circle(this, 550, 380, 150);
        leftDashBoardCircle.drawCircle();
        Circle rightDashBoardCircle = new Circle(this, 250, 380, 150);
        rightDashBoardCircle.drawCircle();
        Circle centreDashBoardCircle = new Circle(this, 400, 350, 180);
        centreDashBoardCircle.drawCircle();

        fill(16, 17, 21);
        rect(300, 300, 200, 200);

        Circle centreButton = new Circle(this, 400, 280, 20);
        centreButton.setColor(81, 9, 1);
        centreButton.drawCircle();

        Circle leftButton = new Circle(this, 360, 287, 20);
        leftButton.setColor(81, 9, 1);
        leftButton.drawCircle();

        Circle rightButton = new Circle(this, 440, 287, 20);
        rightButton.setColor(81, 9, 1);
        rightButton.drawCircle();

        spaceShipImage = loadImage("images/spaceship.png");
        image(spaceShipImage,210, 350, 64, 64);

    }

    public void draw() {
        background(255);
        setup();
    }
}
