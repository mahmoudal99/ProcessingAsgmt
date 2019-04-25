import processing.core.PApplet;

public class PlanetScreen extends PApplet {

    PApplet pApplet;

    PlanetScreen(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    void drawPlanetScren(String[] planets) {

        pApplet.fill(255, 255, 255, 80);
        pApplet.stroke(200, 0, 0);
        pApplet.rect(650, 250, 120, 140, 7);

        int yLine = 260;
        int planetNameCounter = 0;

        while (yLine < 380) {
            pApplet.line(650, yLine + 10, 770, yLine + 10);
            pApplet.textSize(13);
            pApplet.fill(10, 255, 0);
            pApplet.text(planets[planetNameCounter], 670, yLine + 5);
            yLine += 30;

            if (planetNameCounter >= 4) {
                planetNameCounter = 0;
            }
            planetNameCounter++;
        }
    }
}
