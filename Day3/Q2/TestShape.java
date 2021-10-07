package com.hsbc.shape;

public class TestShape {

	public static void main(String[] args) {
	System.out.println("__________Object of Circle_________");
	Circle circle =new Circle(10);
	FindArea.printArea(circle);

	System.out.println("__________Object of Sphere_________");
	Sphere sphere =new Sphere(10);
	FindArea.printArea(sphere);

	}

}
