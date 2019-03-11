import processing.core.PApplet;

public class Planet extends PApplet {

    PApplet pApplet;

    Planet(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawPlanet(){
        //Planet
        pApplet.fill(200, 90, 90);
        pApplet.ellipse(100, 100, 200, 200);
    }
}
