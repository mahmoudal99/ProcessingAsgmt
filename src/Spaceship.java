import processing.core.PApplet;

public class Spaceship extends PApplet {

    PApplet pApplet;

    Spaceship(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawRect(){

        pApplet.fill(0);
        pApplet.rect(0, 350, 800, 250);

        Windshield windshield = new Windshield(pApplet);
        windshield.drawWindshield();

        Dashboard dashboard = new Dashboard(pApplet);
        dashboard.drawDashboard();

    }
}
