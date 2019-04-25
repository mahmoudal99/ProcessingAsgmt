import processing.core.PApplet;
import processing.core.PImage;

public class Weapons extends PApplet {

    PApplet pApplet;
    private PImage weaponImg;
    private int choice;

    private String[] images = new String[3];

    Weapons(PApplet pApplet) {
        this.pApplet = pApplet;
        images[0] = "images/war.png";
        images[1] = "images/bomb.png";
        images[2] = "images/shield.png";
        this.choice = 0;
    }

    void drawWeapons() {

        int alphaVal = 70;
        pApplet.fill(220, 220, 220, alphaVal);
        pApplet.rect(35, 365, 50, 190, 7);

        weaponImg = pApplet.loadImage("images/war.png");
        pApplet.image(weaponImg, 40, 380, 40, 40);

        weaponImg = pApplet.loadImage("images/bomb.png");
        pApplet.image(weaponImg, 40, 440, 40, 40);

        weaponImg = pApplet.loadImage("images/shield.png");
        pApplet.image(weaponImg, 40, 500, 40, 40);


        // Chosen Weapon Image
        Arc chosenWeapon = new Arc(pApplet, 430, 380, 80, 80, radians(180), radians(540));
        chosenWeapon.setStrokeColor(0, 0, 200);
        chosenWeapon.setNoFill();
        chosenWeapon.setColor(37, 40, 55);
        chosenWeapon.drawArc();

        Arc chosenWeaponOuterArc1 = new Arc(pApplet, 430, 380, 90, 90, radians(180), radians(270));
        chosenWeaponOuterArc1.setStrokeColor(0, 0, 200);
        chosenWeaponOuterArc1.setNoFill();
        chosenWeaponOuterArc1.setColor(37, 40, 55);
        chosenWeaponOuterArc1.drawArc();

        Arc chosenWeaponOuterArc2 = new Arc(pApplet, 430, 380, 90, 90, radians(90), radians(160));
        chosenWeaponOuterArc2.setStrokeColor(0, 0, 200);
        chosenWeaponOuterArc2.setNoFill();
        chosenWeaponOuterArc2.setColor(37, 40, 55);
        chosenWeaponOuterArc2.drawArc();

        weaponImg = pApplet.loadImage(images[choice]);
        pApplet.image(weaponImg, 405, 355, 50, 50);

        Circle shootButton = new Circle(pApplet, 350, 330, 35);
        shootButton.setColor(81, 9, 1);
        shootButton.drawCircle();

        Arc shootArc1 = new Arc(pApplet, 350, 330, 30, 30, radians(190), radians(260));
        shootArc1.setStrokeColor(220, 220, 220);
        shootArc1.setNoFill();
        shootArc1.setColor(220, 220, 220);
        shootArc1.drawArc();

        Arc shootArc2 = new Arc(pApplet, 350, 330, 30, 30, radians(280), radians(350));
        shootArc2.setStrokeColor(220, 220, 220);
        shootArc2.setNoFill();
        shootArc2.setColor(220, 220, 220);
        shootArc2.drawArc();

        Arc shootArc3 = new Arc(pApplet, 350, 330, 30, 30, radians(370), radians(440));
        shootArc3.setStrokeColor(220, 220, 220);
        shootArc3.setNoFill();
        shootArc3.setColor(220, 220, 220);
        shootArc3.drawArc();

        Arc shootArc4 = new Arc(pApplet, 350, 330, 30, 30, radians(460), radians(530));
        shootArc4.setStrokeColor(220, 220, 220);
        shootArc4.setNoFill();
        shootArc4.setColor(220, 220, 220);
        shootArc4.drawArc();

        Circle centreShootButton = new Circle(pApplet, 350, 330, 10);
        centreShootButton.setColor(220, 220, 220);
        centreShootButton.drawCircle();

    }

    void chosenWeapon(int i) {
        if (i == 0) {
            choice = 0;
        } else if (i == 1) {
            choice = 1;
        } else {
            choice = 2;
        }
    }

    void animateLaser(boolean start) {
        float[] xLaserCoordinates = new float[]{100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350};
        float[] yLaserCoordinates = new float[]{300, 275, 250, 225, 200, 175, 150, 125, 100, 75, 50};

        float[] xSecondLaserCoordinates = new float[]{650, 685, 650, 625, 600, 575, 550, 525, 500, 475, 450};
        float[] ySecondLaserCoordinates = new float[]{300, 275, 250, 225, 200, 175, 150, 125, 100, 75, 50};

        int xLaserCounter = 0;
        int yLaserCounter = 0;

        if (start) {
            while (xLaserCounter < 10) {
                xLaserCounter++;
                yLaserCounter++;

                weaponImg = pApplet.loadImage("images/laser.png");
                pApplet.image(weaponImg, xLaserCoordinates[xLaserCounter] - 30, yLaserCoordinates[yLaserCounter] - 20, 40, 40);

                weaponImg = pApplet.loadImage("images/second_laser.png");
                pApplet.image(weaponImg, xSecondLaserCoordinates[xLaserCounter] - 40, ySecondLaserCoordinates[yLaserCounter] - 30, 40, 40);
            }
        }
    }
}
