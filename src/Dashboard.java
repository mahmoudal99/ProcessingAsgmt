import processing.core.PApplet;
import processing.core.PImage;

public class Dashboard extends PApplet {

    PApplet pApplet;
    PImage spaceShipImage;

    public Dashboard(PApplet pApplet){

        this.pApplet = pApplet;



    }

    public void drawDashboard(){
        Arc arc1 = new Arc(pApplet, 400, 350, 200, 200, radians(180), radians(360));
        arc1.setColor(37,40,55);
        arc1.drawArc();
        Arc rightArc = new Arc(pApplet, 550, 380, 160, 160, radians(210), radians(390));
        rightArc.setColor(37,40,55);
        rightArc.drawArc();
        Arc leftArc = new Arc(pApplet,250, 380, 160, 160, radians(150), radians(330));
        leftArc.setColor(37,40,55);
        leftArc.drawArc();

        Circle leftDashBoardCircle = new Circle(pApplet, 550, 380, 150);
        leftDashBoardCircle.drawCircle();
        Circle rightDashBoardCircle = new Circle(pApplet, 250, 380, 150);
        rightDashBoardCircle.drawCircle();
        Circle centreDashBoardCircle = new Circle(pApplet, 400, 350, 180);
        centreDashBoardCircle.drawCircle();

        pApplet.fill(16, 17, 21);
        pApplet.rect(300, 300, 200, 150);

        Circle centreButton = new Circle(pApplet, 400, 280, 20);
        centreButton.setColor(81, 9, 1);
        centreButton.drawCircle();

        Circle leftButton = new Circle(pApplet, 360, 287, 20);
        leftButton.setColor(81, 9, 1);
        leftButton.drawCircle();

        Circle rightButton = new Circle(pApplet, 440, 287, 20);
        rightButton.setColor(81, 9, 1);
        rightButton.drawCircle();

        spaceShipImage = pApplet.loadImage("images/spaceship.png");
        pApplet.image(spaceShipImage,210, 350, 64, 64);

        Arc borderlineArc = new Arc(pApplet,240, 380, 100, 100, radians(180), radians(440));
        borderlineArc.noFill = true;
        borderlineArc.setStrokeColor(81, 9, 1);
        borderlineArc.drawArc();

        spaceShipImage = pApplet.loadImage("images/alien_planet.png");
        pApplet.image(spaceShipImage,530, 350, 70, 70);

        Arc leftBorderlineArc = new Arc(pApplet,560, 380, 100, 100, radians(180), radians(540));
        leftBorderlineArc.noFill = true;
        leftBorderlineArc.setStrokeColor(81, 9, 1);
        leftBorderlineArc.drawArc();

        Circle shipControlLeftButton = new Circle(pApplet, 200, 400, 20);
        shipControlLeftButton.setColor(124,252,0);
        shipControlLeftButton.drawCircle();

        Circle shipControlRightButton = new Circle(pApplet, 225, 425, 20);
        shipControlRightButton.setColor(124,252,0);
        shipControlRightButton.drawCircle();
    }
}


























