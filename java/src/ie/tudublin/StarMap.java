package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
    // Arraylist can grow and shrink
    // Generic
    ArrayList<Star> stars = new ArrayList<Star>(); 

    public void settings()
    {
        size(800, 800);

    }
    

    public void drawGrid()
    {
        for(int i = -5 ; i <=5 ; i ++)
		{
            float gap = width * 0.1f;
            float halfGap = gap / 2.0f;
            colorMode(RGB);
            stroke(255, 0, 255);
            textAlign(CENTER, CENTER);
			float x = map(i, -5, 5, gap, width -gap);				
			line(x, gap, x, height - gap);
			line(gap, x, width - gap, x);
            fill(255);
			text(i, x, halfGap);
			text(i, halfGap, x);
			
		}

    }

    public void setup()
    {
        loadData();
        printStars();
    }

    public void loadData()
    {
        Table t = loadTable("HabHYG15ly.csv", "header");
        for(TableRow tr:t.rows())
        {
            Star s = new Star(tr);
            stars.add(s);
        }
    }

    public void printStars()
    {
        for(Star s:stars)
        {
            println(s);
        }
    }

    public void draw()
    {
        background(0);
        drawGrid();

    }

}
