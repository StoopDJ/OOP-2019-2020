package ie.tudublin;

import processing.core.PApplet;

public class Wave extends PApplet
{	
    float a = 0;
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
		noFill();
		smooth();
		colorMode(HSB);
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{

		float x = map(sin(a)*sin((float) (a * 0.8)), -1, 1, 0, width);
        float y = map(sin((float) (a * 1.1 + 1.5)) * sin((float) (a * 3.1)), -1, 1, 0, height);
        float co = map(sin((float) (a * 0.03)), -1, 1, 0, 100);
        float sz = map(sin((float) (a*1.7))*sin((float) (a*2.3)), -1, 1, 5, 30);
        float bri = map(sin((float) (a * 1.3)) * sin((float) (a * 4.1)), -1, 1, 10, 60);

        fill(co,50, bri);
        ellipse(x, y, sz, sz);

        a = (float) (a + 0.03);
    }
	
	
}
