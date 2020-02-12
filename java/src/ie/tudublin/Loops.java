package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	
	}

	public void setup() 
	{
		background(255);
		
	}

	
	public void keyPressed()
	{

	}	


	/*
	public void draw()
	{	
		background(0);
		
		stroke(255);

		line(10, 10, 100, 10);
		line(10, 20, 100, 20);
		line(10, 30, 100, 30);
		line(10, 40, 100, 40);

		for(int y =0; y<=40; y +=10)
		{
			line(200, y, 300, y);
		}

		int yy=10;
		while(yy <=40)
		{
			line(300, yy, 400, yy);
			yy++;
		}
		*/
		
		public void draw() {
			//int x = 0;
			int x=0;
			stroke(0);
			// x is available! Since it is declared within the draw() block of code, it is available here. 
			// Notice, however, that it is not available inside draw() above where it is declared. 
			// Also, it is available inside the while block of code because while is inside of draw().
			while (x < width) {
			  stroke(0);
			  line(x,0,x,height);
			  x += 15;
			} 
		}	
}
