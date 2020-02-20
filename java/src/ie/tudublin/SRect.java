package ie.tudublin;

import processing.core.PApplet;

public class SRect extends PApplet
{	
    float r = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
        background(255);
        noStroke();
        fill(0);
        rectMode(CENTER);
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
        
        translate(100, 100);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();
        
        translate(300, 100);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();
        
        translate(100, 300);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();
        
        translate(300, 300);
        rotate(r);
        rect(0, 0, 80, 80);
        resetMatrix();
        
        r = (float) (r + 0.02);
    }
        
}

