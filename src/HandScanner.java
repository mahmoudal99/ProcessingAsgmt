import processing.core.PApplet;

public class HandScanner extends PApplet {

    PApplet pApplet;

    HandScanner(PApplet pApplet){
        this.pApplet = pApplet;
    }

    void drawHandScanner(){
        pApplet.noFill();
        pApplet.stroke(200, 0, 0);
        pApplet.rect(130, 450, 80, 100, 7);

        int xLine = 140;
        int yLine = 460;
        while (xLine <= 200){
            pApplet.line(xLine, 450, xLine, 550);
            xLine += 10;
        }

        while (yLine < 550){
            pApplet.line(130, yLine, 210, yLine);
            yLine += 10;
        }
    }
}
