import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

public void setup()
{
  size(600,600);
strokeWeight(5);
background(0,80,260);

}
	int x1=0;
  int y1=150; 
  int x2=0;
  int y2=150;
public void draw()
{
	stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
	x1=0;
	while (x2<600)
	{
		x2=x1+(int)(Math.random()*9);
		y2=y1+(int)(Math.random()*18)-9;
		line (x1, y1, x2, y2);
		x1=x2;
		y1=y2;
	}

}

public void mousePressed()
{
 x1=0;
 y1=150; 
 x2=0;
 y2=150;
background(0,80,260);
}

//get one while loop=see instruction
//	x2=0+(int)(Math.random()*9);
//	y2=150+(int)(Math.random()*18-9);	
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
