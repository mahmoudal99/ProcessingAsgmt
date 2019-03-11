import processing.core.PApplet;

public class Arc extends PApplet {

    PApplet pApplet;
    private float x, y, width, height, start, stop;

    Arc(PApplet pApplet, float x, float y, float width, float height, float start, float stop){
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.start = start;
        this.stop = stop;
        this.width = width;
        this.height = height;
    }

    public void drawArc(){
        pApplet.fill(37,40,55);
        pApplet.arc(x, y, width, height, start, stop);
    }
}
