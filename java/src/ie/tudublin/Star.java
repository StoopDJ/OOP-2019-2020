package ie.tudublin;

import processing.core.PApplet;

public class Star extends PApplet
{	

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
      
        background(0);
        noStroke();
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{
        

        //background(0);
        fill(0, 50);
        rect(0, 0, width, height);

        fill(255);
        ellipse(random(width), random(height), 3, 3);
    }   
        
}
