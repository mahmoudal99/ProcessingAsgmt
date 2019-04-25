import processing.core.PApplet;
import processing.core.PImage;

public class Map extends PApplet {

    PApplet pApplet;

    Map(PApplet pApplet){
        this.pApplet = pApplet;
    }

    void drawMap(){
        int alphaVal = 70;
        pApplet.fill(220,220,220, alphaVal);
        pApplet.rect(250, 480, 300, 100, 7);

        PImage mapImage = pApplet.loadImage("images/map2.png");
        pApplet.image(mapImage,300, 480, 100, 100);

        mapImage = pApplet.loadImage("images/map.png");
        pApplet.image(mapImage,400, 480, 100, 100);

        pApplet.textSize(16);
        pApplet.fill(0, 0, 0);
        pApplet.text("Map", 260, 500);
    }
}
