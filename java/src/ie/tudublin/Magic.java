package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;


public class Magic extends PApplet
{

    int Csize =300;
    float angle, angle1, angle2;

    Minim minim;
    AudioSample as;
    
    int frameSize = 1024;

    int sampleRate = 44100;
    

    float lerpedw = 0;
    float average = 0;
    float offs = 0;

	public void settings()
	{
        //size(1024, 550);
        fullScreen();
	}

	public void setup() 
	{
        rectMode(CENTER);
        noStroke();
        background(255);
        angle1 = random(PI);
        angle2 = random(PI);

        minim = new Minim(this);
        as = minim.loadSample("Visuals.mp3", frameSize);

		colorMode(HSB);
    
    }
    
   

	public void draw()
	{

        angle1 += 0.0013;
        angle2 += 0.0002;

        angle = angle1 + angle2;

        translate(width/2, height/2);
        rotate(angle2-angle1);

        scale(1.5f* map(100, 0, height,0, 10));

        float cy = height / 2;
		float sum = 0;
		for(int i = 0 ; i < as.bufferSize() ; i ++)
		{
			stroke(
				map(i, 0, as.bufferSize(), 0, 255)
				, 255
				, 255
			);
			sum += abs(as.left.get(i));
        }
        
       average = sum / as.bufferSize();
        
        for(int j=0; j<2; j++)
        {
            pushMatrix();
            for(int i=0; i<70; i++)
            {
                rotate((-1+2*j)*angle/2);
                scale((float) 0.95);
                float a = (float) (i * PI / 40. + angle1 * 2 * i);
                fill(255 + 140 *sin(a), 355-140 * sin(a + TAU/3), 255 + 140 * sin(a - TAU/3));
                float dia = 30 + 20 * sin(3*angle2) + 25 * sin((float) (i * HALF_PI / 40.));
                f(dia,i);         
            }
            popMatrix();
        }
    }
    public void f(float r, int i)
    {
        float rx = 15 * cos(TAU * 1/70), ry =15 * sin(TAU * 1/70);
        if(random(1) <0.5 * (1 + cos(1)))rect (Csize +rx,0 +ry,r,r);
        else 
        if(random(1) <0.5 * (1 + cos(1)))rect (-Csize +rx,0 +ry,r,r);
        else 
        if(random(1) <0.5 * (1 + cos(1)))rect (0 +rx,Csize +ry,r,r);
        else 
        if(random(1) <0.5 * (1 + cos(1)))rect (0 +rx,-Csize +ry,r,r);

    }

}
