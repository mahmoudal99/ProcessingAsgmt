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
        pApplet.fill(0,0,150, alphaVal);
        pApplet.rect(35, 365, 50, 190, 7);

        weaponImg = pApplet.loadImage("images/war.png");
        pApplet.image(weaponImg,40, 380, 40, 40);

        weaponImg = pApplet.loadImage("images/bomb.png");
        pApplet.image(weaponImg,40, 440, 40, 40);

        weaponImg = pApplet.loadImage("images/shield.png");
        pApplet.image(weaponImg,40, 500, 40, 40);
    }
}
