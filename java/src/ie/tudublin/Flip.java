package ie.tudublin;

import processing.core.PApplet;

public class Flip extends PApplet
{	
    float r = 0;
    float backR;
    float backG;
    float backB;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{

        backR = random(0, 100);
        backG = random(0, 100);
        backB = random(0, 100);
        
        background(backR, backG, backB);
        rectMode(CENTER);
        
        noStroke();
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


        fill(backR, backG, backB, 50);
        rect(width/2, height/2, width, height);
        
        fill(255);
        translate(mouseX, mouseY);
        rotate(r);
        rect(0, 0, 100, 100);
        
        r = (float) (r + 0.05);
    }   
        
}

