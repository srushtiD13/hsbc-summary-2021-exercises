package com.hsbc.service;

import com.hsbc.dao.EmployeeDao;

public class EmployeeServiceFactory {
	public static EmployeeService getServiceObj(EmployeeDao dao)
	{
		EmployeeService service=new EmployeeServiceImpl(dao); 
		return service;
	}

}
