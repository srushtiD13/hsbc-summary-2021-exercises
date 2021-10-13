package com.hsbc.service;



public class EmployeeServiceFactory {
	public static EmployeeService getServiceObj()
	{
		EmployeeService dao=new EmployeeServiceImpl(); 
		return dao;
	}

}
