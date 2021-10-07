package com.hsbc.shape;

public class Sphere implements Shape {

	private double radius;
	
	

	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	@Override
	public String getArea(double radius) {
		
		return "Area of SPHERE is: "+4*Math.PI*radius*radius;
	}

}
