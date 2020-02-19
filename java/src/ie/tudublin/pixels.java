package ie.tudublin;

import processing.core.PApplet;

public class pixels extends PApplet
{	

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
		//noFill();
		//smooth();
        colorMode(HSB);
        stroke(255,0,255);
        background(255);
        smooth();
        strokeWeight(3);
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{   
        loadPixels();

        for(int i = 0; i < pixels.length; i++) {
          pixels[i] = color(random(255));
        }
        
        updatePixels();
    }
}
