import java.awt.Rectangle;

import java.lang.Math;

import java.awt.Point;

public class Box
{
public static void main(String[] args)
{
	Rectangle box = new Rectangle(35, 50, 100, 200);
	Point point = new Point();
	point.setLocation(box.getX(), box.getY()+((int)((Math.random()*6) + 20)));
	System.out.print("x coordinate: " + point.getX() + "\ny coordinate: " + point.getY());
	//box.translate(0,((int)((Math.random()*6) + 20)));	
	//box.setLocation(35,50 + ((int)((Math.random()*6) + 20)));	
	//System.out.print("x coordinate: " + box.getX() + "\ny coordinate: " + box.getY());
	}
}