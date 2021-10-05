package com.hsbc.excercise;

import java.util.Scanner;

public class Que3_StaticMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower range: ");
		int lower=Integer.parseInt(sc.nextLine());
		System.out.println("Enter upper range: ");
		int upper=Integer.parseInt(sc.nextLine());
		
		if(lower>upper)
		{
			System.out.println("lower should be less than upper hence swapping them");
			int swap=lower;
			lower=upper;
			upper=swap;
			
		}
		
		System.out.println("Even numbers in range: ");
		printEven(lower,upper);
		
		System.out.println("Odd numbers in range: ");
		printOdd(lower,upper);
		
		sc.close();
		

	}
	
	public static void printEven(int a,int b)
	{
		int firstEven;
		if (a%2==0)
		{
			firstEven=a;
		}
		else 
			{
			firstEven=a+1;
			}
		
	
		while(firstEven<b)
		{
			System.out.println(firstEven);
			firstEven=firstEven+2;
		}
	}
	
	public static void printOdd(int a,int b)
	{
		int firstOdd;
		if (a%2==0)
		{
			firstOdd=a+1;
		}
		else 
			{
			firstOdd=a;
			}
		
	
		while(firstOdd<b)
		{
			System.out.println(firstOdd);
			firstOdd=firstOdd+2;
		}
	}
	

}
