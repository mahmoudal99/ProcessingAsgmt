import processing.core.PApplet;

public class Arc extends PApplet {

    PApplet pApplet;
    private float x, y, width, height, start, stop;
    float r, g, b, strokeR, strokeG, strokeB, strokeWeight;
    public boolean noFill;

    Arc(PApplet pApplet, float x, float y, float width, float height, float start, float stop){
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.start = start;
        this.stop = stop;
        this.width = width;
        this.height = height;

        this.r = 0;
        this.g = 0;
        this.b = 0;
        this.strokeWeight = 1;

        this.strokeR = 0;
        this.strokeG = 0;
        this.strokeB = 0;

        this.noFill = false;

    }

    public void setColor(float red, float green, float blue){
        this.r = red;
        this.g = green;
        this.b = blue;
    }

    public void setStrokeColor(float red, float green, float blue){
        this.strokeR = red;
        this.strokeG = green;
        this.strokeB = blue;
    }

    public void setStrokeWeight(float weight){
        strokeWeight = weight;
    }


    public void drawArc(){

        if(noFill){
            pApplet.noFill();
        }else {
            pApplet.fill(r, g, b);
        }
        pApplet.stroke(strokeR,strokeG,strokeB);
        pApplet.strokeWeight(strokeWeight);
        pApplet.arc(x, y, width, height, start, stop);
    }
}
