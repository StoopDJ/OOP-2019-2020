package ie.tudublin;

import processing.core.PApplet;

public class Bright extends PApplet
{	
    
    float z = 0;
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
        noStroke();
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{float x = 0;
        while (x < width) {
      
          float y = 0;
          while(y < height) {
            float co = 255 * noise(x/500, y/500, z);
            fill(co, 255, 255);
            ellipse(20 + x, 20 + y, 60, 60);
            y = y + 40;
          }    
          
          x = x + 40;
        }
        
        z = (float) (z + 0.02);
    } 
}
