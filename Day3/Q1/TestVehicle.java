package com.hsbc.interfaces;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("_________Bike_________");
		System.out.println("**KTM instance**");
		Ktm ktm=new Ktm();
		VehicleUI.printVehicle(ktm);
		
		System.out.println("**Royal Enfield instance**");
		RoyalEnfield re=new RoyalEnfield();
		VehicleUI.printVehicle(re);
		
		System.out.println("_________Car_________");
		System.out.println("**Alto instance**");
		Alto alto=new Alto();
		VehicleUI.printVehicle(alto);
		
		System.out.println("**Skoda instance**");
		Skoda skoda=new Skoda();
		VehicleUI.printVehicle(skoda);
		
		System.out.println("**BMW instance**");
		Bmw bmw=new Bmw();
		VehicleUI.printVehicle(bmw);

	}

}
