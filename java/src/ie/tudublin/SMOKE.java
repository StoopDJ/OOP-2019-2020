package ie.tudublin;

import processing.core.PApplet;

public class SMOKE extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
		noFill();
		smooth();
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{
		if (random(100) > 50) {
			stroke(255);
		  } else {
			stroke(255);
		  }
		  float r = random(100);
		  ellipse(200, 200, r, r);
		  copy(0, 0, width, height, -3, -2, width + 5, height + 3);
	}
	
	
}