import processing.core.PApplet;

public class Windshield extends PApplet {

    PApplet pApplet;

    public Windshield(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawWindshield(){
        Circle centreCircle = new Circle(this.pApplet,400, 350, 350);
        centreCircle.isAlpha = true;
        centreCircle.setAlpha(70);
        centreCircle.drawCircle();

        Circle leftCircle = new Circle(this.pApplet,250, 420, 300);
        centreCircle.isAlpha = false;
        leftCircle.drawCircle();

        Circle rightCircle = new Circle(this.pApplet,550, 420, 300);
        centreCircle.isAlpha = false;
        rightCircle.drawCircle();

        Circle rightEndCircle = new Circle(this.pApplet,700, 450, 300);
        rightEndCircle.isAlpha = false;
        rightEndCircle.drawCircle();

        Circle leftEndCircle = new Circle(this.pApplet,100, 450, 300);
        leftEndCircle.isAlpha = false;
        leftEndCircle.drawCircle();
    }
}
