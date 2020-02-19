package ie.tudublin;

import java.beans.VetoableChangeSupport;
import java.util.Arrays; 
import java.util.Collections;

import javafx.scene.chart.ValueAxis;
import processing.core.PApplet;

public class ArraysExample extends PApplet
{	

	//float[] rainFall = new float[12]; 
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i ++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}
		}
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex]);
		
		int maxIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] > rainFall[maxIndex])
			{
				maxIndex = i;
			}
		}
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex]);

		// You can also calculate the minimum and max of an arry this way:
		// Note the array is of type Float not float
		// Float are objects float is a primitive type
		Float[] floatArray = {10.0f, 5.0f, 20.0f};
		float min = Collections.min(Arrays.asList(floatArray)); 
        float max = Collections.max(Arrays.asList(floatArray));
	}

	void drawBarChart()
	{
		int cushion = 60;
		int cushionx = 20; 
		float w = width / (float) rainFall.length;
		float cGap = 255 / (float) rainFall.length;
		stroke(255);
		colorMode(HSB);


		line(cushion, cushion, cushion, width - cushion);
		line(cushion, height - cushion, width - cushion, height - cushion);

		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			float x = map(i,  0, rainFall.length-1, cushion, width-cushion);
			stroke(255);
			line(x, height-cushion + 3, x, height-cushion -3);
			stroke(255);
			text(months[i], x, width - cushionx);
			
		}

		for(int f = 0 ; f < rainFall.length+1 ; f ++)
		{
			float y = map(f,  0, rainFall.length, width-cushion, cushion);
			stroke(255);

			line(cushion-3, y, cushion+3,y);

			stroke(255);
			text(f * 10, cushionx, y);

		}

	}

	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	public void draw()
	{	
		background(0);		
		colorMode(HSB);	

		drawBarChart();
	}
}
