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

    public void audioBands()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AudioBands());
    }

    public void airSeaBattle()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AirSeaBattle());
    }


    public void soundMandala()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundMandala());
    }

    public static void main(String[] arg){
        Main main = new Main();
		main.sound2();        
    }
}
