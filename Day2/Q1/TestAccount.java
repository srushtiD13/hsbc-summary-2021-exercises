package com.hsbc.exercise;

public class TestAccount {

	public static void main(String[] args) {
		//creating objs of savings and current acc
		
		Savings accSaving=new Savings(33443344,50000,"MAHB9087",10000);
		
		Current accCurrent=new Current(55665566,890000,"MAHB9099","Alex");
		
		test(accCurrent);
		test(accSaving);

	}
	
	public static void test(Account acc)
	{
		System.out.println(acc.display());
	}

}
