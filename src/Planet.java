import processing.core.PApplet;

public class Planet extends PApplet {

    PApplet pApplet;
    private float x, y, width, height;

    Planet(PApplet pApplet, float x, float y, float width, float height){
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawPlanet(){
        //Planet
        pApplet.fill(200, 90, 90);
        pApplet.ellipse(x, y, width, height);

    }
}
