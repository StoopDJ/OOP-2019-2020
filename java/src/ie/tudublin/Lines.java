package ie.tudublin;

import processing.core.PApplet;

public class Lines extends PApplet
{	
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
	{fill(0, 10);
        noStroke();
        rect(0, 0, width, height);
        
        stroke(random(255), 255, 255);
        float x = random(width);
        line(x, 0, x, height);

	}
	
	
}



