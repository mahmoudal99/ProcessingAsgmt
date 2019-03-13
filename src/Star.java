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
        // I use the z value to increase the star size between a range from 0 to 16.
        float r = map(z, 0, pApplet.width/2, 9, 0);
        pApplet.line(100, 50, 0, 0);

        return;
    }

}