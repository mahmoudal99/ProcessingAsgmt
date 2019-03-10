import processing.core.PApplet;

public class Star extends PApplet{

    private PApplet pApplet;
    private float x, y, z, pz;

    Star(float x, float y, float z, float pz){
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pz = pz;
    }

    public void drawStar(){
        pApplet.fill(255);
        pApplet.noStroke();

        // with theese "map", I get the new star positions
        // the division x / z get a number between 0 and a very high number,
        // we map this number (proportionally to a range of 0 - 1), inside a range of 0 - width/2.
        // In this way we are sure the new coordinates "sx" and "sy" move faster at each frame
        // and which they finish their travel outside of the canvas (they finish when "z" is less than a).

        float sx = map(x / z, 0, 1, 0, pApplet.width/2);
        float sy = map(y / z, 0, 1, 0, pApplet.height/2);;

        // I use the z value to increase the star size between a range from 0 to 16.
        float r = map(z, 0, pApplet.width/2, 16, 0);
        pApplet.ellipse(sx, sy, r, r);

        // Here i use the "pz" valute to get the previous position of the stars,
        // so I can draw a line from the previous position to the new (current) one.
        float px = map(x / pz, 0, 1, 0, pApplet.width/2);
        float py = map(y / pz, 0, 1, 0, pApplet.height/2);

        pApplet.stroke(255);
        pApplet.line(px, py, sx, sy);
    }
}
