import processing.core.PApplet;

public class Main extends PApplet{
    public void start()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Galaxy());
    }


    public static void main(String[] args)
    {
        Main main = new Main();
        main.start();
    }
}
