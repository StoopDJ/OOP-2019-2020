package ie.tudublin;

import processing.core.PApplet;

public class Rect extends PApplet
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

        draw_rotating_rectangle(100, 100, 80);
        draw_rotating_rectangle(300, 100, 40);
        draw_rotating_rectangle(100, 300, 100);
        draw_rotating_rectangle(300, 300, 20);
        draw_rotating_rectangle(200, 200, 150);
      
        r = (float) (r + 0.02);
    }
        void draw_rotating_rectangle(float x, float y, float rect_size) {
            translate(x, y);
            rotate(r);
            rect(0, 0, rect_size, rect_size);
            resetMatrix();
          }
        
}

