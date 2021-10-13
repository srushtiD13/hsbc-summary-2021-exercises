package com.hsbc.dao;

public class EmployeeDaoFactory {
	
	public static EmployeeDao getDaoObj(int option)
	{
		if (option==1) return new EmployeeDaoImpl();
		if (option==2) return new EmployeeDaoArrayListImpl();
		if (option==3) return new EmployeeDaoTreeSetImpl();
		
		return new EmployeeDaoImpl();
		
	}
	

}
