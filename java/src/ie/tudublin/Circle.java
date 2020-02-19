package ie.tudublin;

import processing.core.PApplet;

public class Circle extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{
		background(255);			
		
		//noFill();

		fill(random(0,250));

 	 	translate(width / 2, height / 2); // move origin to middle of canvas
 		draw_fractal(500);
	}
	
	public void draw_fractal(float r) {
		ellipse(0, 0, r, r);  // draw origin circle
		//colorMode(HSB);
	  
		if (r < 100)          // don't draw circles smaller than 100x100
		  return;
	  
		stroke(255, 0, 0);    // red circles
		pushMatrix();         // save the origin, we're about to change it
		translate(0, -r / 4); // move the origin straight down to the 1/4 mark
		draw_fractal(r / 2);  // restart the process at half the scale
		popMatrix();
	  
		stroke(0, 0, 255);    // blue circles
		pushMatrix();
		translate(0, r / 4);
		draw_fractal(r / 2);
		popMatrix();
	  
		stroke(0, 255, 0);    // green circles
		pushMatrix();
		translate(r / 4, 0);
		draw_fractal(r / 2);
		popMatrix();
	  
		stroke(0);            // black circles
		pushMatrix();
		translate(-r / 4, 0);
		draw_fractal(r / 2);
		popMatrix();
	  }
}
