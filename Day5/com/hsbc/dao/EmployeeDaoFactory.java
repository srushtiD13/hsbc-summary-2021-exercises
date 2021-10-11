package com.hsbc.dao;

public class EmployeeDaoFactory {
	
	public static EmployeeDao getDaoObj()
	{
		EmployeeDao dao=new EmployeeDaoImpl(); 
		return dao;
	}
	

}
