package com.hsbc.shape;

public class FindArea {
	public static void printArea(Shape shape)//upcasted to make loosely coupled
	{
		if(shape instanceof Circle)
		{
			Circle circle=(Circle)shape;//downcasted to circle to access radius
			System.out.println(circle.getArea(circle.getRadius()));
			
		}
		if(shape instanceof Sphere)
		{
			Sphere sphere=(Sphere)shape;
			System.out.println(sphere.getArea(sphere.getRadius()));
			
		}
	}
}
