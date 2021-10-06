package com.hsbc.classwork;

public class Person {
	
	String name;
	String gender;
	String emailId;
	long phone;
	
	//using this() we can reduce redundant code. super() will call constr of super class
	public Person(String name, String gender, String emailId, long phone) {
		
		//this.name = name;
		//this.gender = gender;
		//this.emailId = emailId;
		this(name,gender,emailId);//it will call coonstr having args string,string,string
		this.phone = phone;
	}


	public Person(String name, String gender) {
		
		this.name = name;
		this.gender = gender;
	}


	public Person(String name, String gender, String emailId) {
	
		//this.name = name;
		//this.gender = gender;
		this(name,gender);
		this.emailId = emailId;
	}
	
	
	
	

}
