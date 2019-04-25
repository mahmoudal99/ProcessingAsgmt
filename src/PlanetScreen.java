import processing.core.PApplet;

public class PlanetScreen extends PApplet {

    PApplet pApplet;

    PlanetScreen(PApplet pApplet){
        this.pApplet = pApplet;
    }

    void drawHandScanner(String[] planets){

        pApplet.noFill();
        pApplet.stroke(200, 0, 0);
        pApplet.rect(130, 450, 80, 100, 7);

//        int xLine = 140;
        int yLine = 460;
//        while (xLine <= 200){
//            pApplet.line(xLine, 450, xLine, 550);
//            xLine += 10;
//        }

        while (yLine < 550){
            pApplet.line(130, yLine, 210, yLine);
            pApplet.textSize(10);
            pApplet.fill(255, 2, 0);
            pApplet.text(planets[0], 130, yLine);
            yLine += 10;
        }
    }
}
