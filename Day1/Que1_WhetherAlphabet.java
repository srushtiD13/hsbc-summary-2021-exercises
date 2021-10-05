package com.hsbc.excercise;

import java.util.Scanner;

public class Que1_WhetherAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char: ");
		char c= sc.next().charAt(0);
		checkIfAlphabet(c);
		sc.close();

	}
	
	public static void checkIfAlphabet(char c)
	{
		
		if ((c<='Z' && c>='A')||(c<='z' && c>='a'))
		{
			System.out.println("Given char "+c+" is an alphabet");
		}
		else System.out.println("Given char "+c+" is NOT an alphabet");
	}

}
