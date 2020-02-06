package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{	
	public void settings()
	{
		size(500, 500);
    }
    public void setup() {
    }


    
    int x = 0; // 4 bytes
	
	public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
	}
}


public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
    }	
    
    if ((frameCount % 60) == 0)
{
    // Do something
}