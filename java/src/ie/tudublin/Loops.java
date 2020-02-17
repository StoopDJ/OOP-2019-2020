package ie.tudublin;

import processing.core.PApplet;



public class Loops extends PApplet
{	
	int OFF_MAX = 300;

	public void settings()
	{
		size(500, 500);
		
		
	}

	public void setup() 
	{
	
				
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

			background(0);
			translate(width / 2, height /2, 0);

			for(int xo = -OFF_MAX; xo <= OFF_MAX; xo += 50 ){
				
				pushMatrix();
				translate(xo, 0,0);
				box(30);
				popMatrix();
			}
		}


			
			
}
