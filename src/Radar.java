import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class Radar extends PApplet {

    PApplet pApplet;


    public Radar(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawRadar(){



        Circle circle = new Circle(pApplet, 700, 500, 160);
        circle.isAlpha = true;
        circle.setAlpha(50);
        circle.setColor(0, 0, 180);
        circle.drawCircle();

        // Target Tracker
        Arc aimArcOuter = new Arc(pApplet,700, 500, 160, 160, radians(180), radians(540));
        aimArcOuter.noFill = true;
        aimArcOuter.setStrokeColor(81, 9, 1);
        aimArcOuter.setStrokeWeight(10);
        aimArcOuter.drawArc();

        Arc aimArcInner = new Arc(pApplet,700, 500, 130, 130, radians(180), radians(540));
        aimArcInner.noFill = true;
        aimArcInner.setStrokeColor(81, 9, 1);
        aimArcInner.drawArc();

        Arc aimArcCentreOuter = new Arc(pApplet,700, 500, 90, 90, radians(180), radians(540));
        aimArcCentreOuter.noFill = true;
        aimArcCentreOuter.setStrokeColor(81, 9, 1);
        aimArcCentreOuter.setStrokeWeight(5);
        aimArcCentreOuter.drawArc();

        Arc aimArcCentreInner = new Arc(pApplet,700, 500, 40, 40, radians(180), radians(540));
        aimArcCentreInner.noFill = true;
        aimArcCentreInner.setStrokeColor(81, 9, 1);
        aimArcCentreInner.setStrokeWeight(5);
        aimArcCentreInner.drawArc();

////        pApplet.strokeWeight(1);
//        pApplet.line(700, 500, 620, 500);
//        pApplet.line(700, 500, 640, 450);
////
//        pApplet.line(700, 500, 700, 420);
//        pApplet.line(700, 500, 750, 440);
////
//        pApplet.line(700, 500, 780, 500);
//        pApplet.line(700, 500, 760, 555);
//
//        pApplet.line(700, 500, 640, 550);
////        pApplet.line(700, 500, 700, 580);




        Circle enemyLocation = new Circle(pApplet, 670, 475, 10);
        enemyLocation.setColor(0,0,128);
        enemyLocation.drawCircle();
    }
}
