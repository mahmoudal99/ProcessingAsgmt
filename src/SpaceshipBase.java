import processing.core.PApplet;

public class SpaceshipBase extends PApplet {

    PApplet pApplet;

    SpaceshipBase(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawRect(){

        pApplet.fill(0);
        pApplet.rect(0, 350, 800, 250);


        Circle centreCircle = new Circle(this.pApplet,400, 350, 350);
        centreCircle.drawCircle();

        Circle leftCircle = new Circle(this.pApplet,250, 420, 300);
        leftCircle.drawCircle();

        Circle rightCircle = new Circle(this.pApplet,550, 420, 300);
        rightCircle.drawCircle();
    }
}
