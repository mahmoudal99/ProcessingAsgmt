import processing.core.PApplet;

public class Spaceship extends PApplet {

    PApplet pApplet;

    Spaceship(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    void drawRect() {

        Turrets turrets = new Turrets(pApplet);
        turrets.drawTurrets();

        Windshield windshield = new Windshield(pApplet);
        windshield.drawWindshield();

        Dashboard dashboard = new Dashboard(pApplet);
        dashboard.drawDashboard();
    }
}
