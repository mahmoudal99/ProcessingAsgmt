import processing.core.PApplet;

public class Spaceship extends PApplet {

    PApplet pApplet;

    Spaceship(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    void drawRect() {

        // Turrets
        pApplet.strokeWeight(3);
        pApplet.stroke(0, 0, 0);
        pApplet.beginShape();
        pApplet.vertex(70, 310);
        pApplet.vertex(115, 330);
        pApplet.vertex(75, 430);
        pApplet.vertex(20, 400);
        pApplet.endShape(CLOSE);

        pApplet.beginShape();
        pApplet.vertex(125, 275);
        pApplet.vertex(145, 280);
        pApplet.vertex(100, 324);
        pApplet.vertex(85, 317);
        pApplet.endShape(CLOSE);

        pApplet.beginShape();
        pApplet.vertex(730, 310);
        pApplet.vertex(685, 330);
        pApplet.vertex(725, 430);
        pApplet.vertex(780, 400);
        pApplet.endShape(CLOSE);

        pApplet.beginShape();
        pApplet.vertex(675, 275);
        pApplet.vertex(655, 280);
        pApplet.vertex(700, 324);
        pApplet.vertex(715, 317);
        pApplet.endShape(CLOSE);

        pApplet.noStroke();
        pApplet.fill(0);
        pApplet.rect(0, 350, 800, 250);

        Windshield windshield = new Windshield(pApplet);
        windshield.drawWindshield();

        Dashboard dashboard = new Dashboard(pApplet);
        dashboard.drawDashboard();
    }
}
