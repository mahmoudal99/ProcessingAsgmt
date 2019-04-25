import processing.core.PApplet;

public class Windshield extends PApplet {

    PApplet pApplet;

    Windshield(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    void drawWindshield() {
        Circle centreCircle = new Circle(this.pApplet, 400, 350, 400);
        centreCircle.isAlpha = true;
        centreCircle.setAlpha(70);
        centreCircle.drawCircle();

        pApplet.noStroke();
        Circle leftCircle = new Circle(this.pApplet, 250, 420, 300);
        centreCircle.isAlpha = false;
        leftCircle.drawCircle();

        Circle rightCircle = new Circle(this.pApplet, 550, 420, 300);
        centreCircle.isAlpha = false;
        rightCircle.drawCircle();

        Circle rightEndCircle = new Circle(this.pApplet, 700, 450, 400);
        rightEndCircle.isAlpha = true;
        rightEndCircle.setAlpha(70);
        rightEndCircle.drawCircle();

        Circle leftEndCircle = new Circle(this.pApplet, 100, 450, 400);
        leftEndCircle.isAlpha = true;
        leftCircle.setAlpha(80);
        leftEndCircle.drawCircle();
    }
}
