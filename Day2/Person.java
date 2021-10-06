package com.hsbc.classwork;

public class Person {
	
	String name;
	String gender;
	String emailId;
	long phone;
	
	
	public Person(String name, String gender, String emailId, long phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
		this.phone = phone;
	}


	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}


	public Person(String name, String gender, String emailId) {
		super();
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
	}
	
	
	
	

}
