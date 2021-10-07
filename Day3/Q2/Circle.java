package com.hsbc.shape;

public class Circle implements Shape {
	private double radius;
	
	

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}


	@Override
	public String getArea(double radius) {
		
		return "Area of CIRCLE is: "+Math.PI*radius*radius;
	}

}
