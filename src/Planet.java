import processing.core.PApplet;

public class Planet extends PApplet {

    PApplet pApplet;

    Planet(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawPlanet(){
        //Planet
        pApplet.fill(200, 90, 90);
        pApplet.ellipse(650, 160, 160, 160);
    }
}
