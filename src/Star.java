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
        pApplet.fill(255);
        pApplet.noStroke();

        // I use the z value to increase the star size between a range from 0 to 16.
        float r = map(z, 0, pApplet.width/2, 16, 0);
        pApplet.ellipse(x, y, r, r);

    }

}