import processing.core.PApplet;

public class Lever extends PApplet {

    PApplet pApplet;

    public Lever(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawLever(){
        // Lever Speed
        pApplet.fill(220,220,220);
        pApplet.rect(335, 380, 5, 50, 4);
        pApplet.fill(220,220,220);
        pApplet.rect(355, 380, 5, 50, 4);
        pApplet.fill(220,220,220);
        pApplet.rect(335, 425, 25, 5, 4);
        pApplet.fill(220,220,220);
        pApplet.rect(335, 380, 25, 5, 4);

        // Lever
        pApplet.fill(220,220,220);
        pApplet.rect(345, 365, 5, 40, 4);
        pApplet.fill(220,220,220);
        pApplet.rect(335, 365, 25, 5, 4);
    }
}

