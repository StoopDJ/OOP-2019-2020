package ie.tudublin;

public class Main
{

    public void helloArrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ArraysExample());
    }

    public void helloProcessing()
	{
		final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new HelloProcessing());
    }

    public void loops() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new Loops());
    }

    public void bugZap() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new BugZap());
    }
<<<<<<< HEAD

    public void airSeaBattle() {
        final String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new AirSeaBattle());
=======
    
    public void sound1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound1());
    }

    public void sound2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound2());
    }

    public void airSeaBattle()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AirSeaBattle());
>>>>>>> 3f21efb1b5a9d3d0cbafcc1d042aa89f314fd196
    }

<<<<<<< HEAD
    public void dogsCats() {
=======
    public void soundMandala()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundMandala());
    }
    
    public void dogsCats()
    {
>>>>>>> b8af229bd5b2fdd3e3f403bbf3333675f3821094
        // Polymorphism means
        // The type is a superclass, the instance is a subclass

        // This is not polymorphism
       // final Cat topcat = new Cat("Topcat");

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

    public static void main(String[] arg){
        Main main = new Main();
		main.sound2();        
    }
}
