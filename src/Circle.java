import processing.core.PApplet;

public class Circle extends PApplet {

    PApplet pApplet;
    private float x, y, extent;

    Circle(PApplet pApplet, float x, float y, float extent){
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.extent = extent;
    }

    public void drawCircle(){
        pApplet.fill(0);
        pApplet.noStroke();
        pApplet.smooth();
        pApplet.circle(x, y, extent);
    }
}
