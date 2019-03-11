import processing.core.PApplet;

public class SpaceshipBase extends PApplet {

    PApplet pApplet;

    SpaceshipBase(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawRect(){
        pApplet.fill(255,160,122);
        pApplet.rect(0, 350, 800, 250);

        pApplet.fill(255,160,122);
        pApplet.noStroke();
        pApplet.smooth();
        pApplet.circle(400, 350, 350);

        pApplet.fill(255,160,122);
        pApplet.smooth();
        pApplet.circle(250, 425, 300);

        pApplet.fill(255,160,122);
        pApplet.smooth();
        pApplet.circle(550, 425, 300);
    }
}
