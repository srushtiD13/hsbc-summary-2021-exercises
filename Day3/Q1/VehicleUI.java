package com.hsbc.interfaces;

public class VehicleUI {
	public static void printVehicle(Vehicle v)//upcasting
	{
		v.wheels();
		System.out.println(v.getMileage());
		System.out.println(v.getPrice());
	}
}
