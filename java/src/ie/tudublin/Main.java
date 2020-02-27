package ie.tudublin;

import java.time.format.TextStyle;

public class Main
{

    public void helloProcessing()
	{
		final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new HelloProcessing());
    }

    public void SMOKE()
	{
		final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new SMOKE());
    }

    public void Wave()
	{
		final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Wave());
    }


    public void loops() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Loops());
    }

    public void pixels() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new pixels());
    }

    public void Drawing() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Drawing());
    }

    public void Circle() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Circle());
    }

    
    public void ACID() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new ACID());
    }

    public void Rain() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Rain());
    }

    public void Flashing() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new flashing());
    }

    public void Rect() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Rect());
    }

    public void Bright() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Bright());
    }
    public void SRect() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new SRect());
    }

    public void Star() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Star());
    }
    
    public void Lines() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Lines());
    }

    public void Flip() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Flip());
    }

    public void Blue() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Blue());
    }

    public void Middle() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Middle());
    }
    
    public void Magic() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Magic());
    }


    public void bugZap() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new BugZap());
    }

    public void airSeaBattle() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new AirSeaBattle());
    }

    public void dogsCats() {
        // Polymorphism means
        // The type is a superclass, the instance is a subclass

        // This is polymorphism!
        Animal mino = new Cat("Mino");
        // A vitual method!
        // Dynamic binding
        mino.speak();
        // This wont compile!!
        // System.out.println(mino.getNumLives());
        // This is an example of a cast
        System.out.println(((Cat) mino).getNumLives());

        mino = new Dog("Misty"); // This will compile!
        // topcat = new Dog("Tara"); // This wont compile!

        Animal a = new Cat("a");
        final Animal b = new Cat("b");

        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);

        // c c will get printed out because
        // a & b are object references

    }

    public static void main(final String[] arg) {
        final Main main = new Main();
        main.Magic();      
    }
}
