import processing.core.PApplet;

public class Star extends PApplet {

    private PApplet pApplet;
    private float x, y, z;

    Star(float x, float y, float z, PApplet pApplet){
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void drawStar(){
        pApplet.fill(0, 255, 2);
        float r = map(z, 0, 300, 100, 200);
        pApplet.line(100, 300, r, r);
    }
}