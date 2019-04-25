import processing.core.PApplet;

public class Circle extends PApplet {

    PApplet pApplet;
    private float x, y, extent;
    private float r, g, b;
    private int alpha;
    boolean isAlpha;

    Circle(PApplet pApplet, float x, float y, float extent){
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.extent = extent;
        this.r = 0;
        this.g = 0;
        this.b = 0;
        this.isAlpha = false;
        this.alpha = 100;
    }

    void setColor(float red, float green, float blue){
        this.r = red;
        this.g = green;
        this.b = blue;
    }

    void setAlpha(int alpha){
        this.alpha = alpha;
    }

    void drawCircle(){

        if(!isAlpha){
            pApplet.fill(r, g, b);
        }else {
            pApplet.fill(r, g, b, alpha);
        }
        pApplet.noStroke();
        pApplet.smooth();
        pApplet.circle(x, y, extent);
    }
}
