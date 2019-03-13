import processing.core.PApplet;
import processing.core.PImage;

public class Weapons extends PApplet {

    PApplet pApplet;
    PImage weaponImg;

    public Weapons(PApplet pApplet){
        this.pApplet = pApplet;
    }

    public void drawWeapons(){

        int alphaVal = 70;
        pApplet.fill(220,220,220, alphaVal);
        pApplet.rect(35, 365, 50, 190, 7);

        weaponImg = pApplet.loadImage("images/war.png");
        pApplet.image(weaponImg,40, 380, 40, 40);

        weaponImg = pApplet.loadImage("images/bomb.png");
        pApplet.image(weaponImg,40, 440, 40, 40);

        weaponImg = pApplet.loadImage("images/shield.png");
        pApplet.image(weaponImg,40, 500, 40, 40);


        // Chosen Weapon Image

        Arc chosenWeapon = new Arc(pApplet, 430, 380, 80, 80, radians(180), radians(540));
        chosenWeapon.setStrokeColor(0, 0, 200);
        chosenWeapon.setNoFill(true);
        chosenWeapon.setColor(37,40,55);
        chosenWeapon.drawArc();

        Arc chosenWeaponOuterArc1 = new Arc(pApplet, 430, 380, 90, 90, radians(180), radians(270));
        chosenWeaponOuterArc1.setStrokeColor(0, 0, 200);
        chosenWeaponOuterArc1.setNoFill(true);
        chosenWeaponOuterArc1.setColor(37,40,55);
        chosenWeaponOuterArc1.drawArc();

        Arc chosenWeaponOuterArc2 = new Arc(pApplet, 430, 380, 90, 90, radians(90), radians(160));
        chosenWeaponOuterArc2.setStrokeColor(0, 0, 200);
        chosenWeaponOuterArc2.setNoFill(true);
        chosenWeaponOuterArc2.setColor(37,40,55);
        chosenWeaponOuterArc2.drawArc();

        weaponImg = pApplet.loadImage("images/bomb.png");
        pApplet.image(weaponImg,405, 355, 50, 50);

        Circle shootButton = new Circle(pApplet, 350, 330, 35);
        shootButton.setColor(81, 9, 1);
        shootButton.drawCircle();

        Arc shootArc1 = new Arc(pApplet, 350, 330, 30, 30, radians(190), radians(260));
        shootArc1.setStrokeColor(220,220,220);
        shootArc1.setNoFill(true);
        shootArc1.setColor(220,220,220);
        shootArc1.drawArc();

        Arc shootArc2 = new Arc(pApplet, 350, 330, 30, 30, radians(280), radians(350));
        shootArc2.setStrokeColor(220,220,220);
        shootArc2.setNoFill(true);
        shootArc2.setColor(220,220,220);
        shootArc2.drawArc();

        Arc shootArc3 = new Arc(pApplet, 350, 330, 30, 30, radians(370), radians(440));
        shootArc3.setStrokeColor(220,220,220);
        shootArc3.setNoFill(true);
        shootArc3.setColor(220,220,220);
        shootArc3.drawArc();

        Arc shootArc4 = new Arc(pApplet, 350, 330, 30, 30, radians(460), radians(530));
        shootArc4.setStrokeColor(220,220,220);
        shootArc4.setNoFill(true);
        shootArc4.setColor(220,220,220);
        shootArc4.drawArc();

        Circle centreShootButton = new Circle(pApplet, 350, 330, 10);
        centreShootButton.setColor(220,220,220);
        centreShootButton.drawCircle();
    }
}
