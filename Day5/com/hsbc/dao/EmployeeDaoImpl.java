package com.hsbc.dao;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Employee[] empArray=new Employee[10];//static becoz we want it to be act like DB
	private static int counter=0;
	
	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		
		
		for(int i=0;i<counter;i++)
		{
			if(empArray[i].getId()==employee.getId())
			{
				throw new EmployeeAlreadyExistsException("Employee with id= "+employee.getId()+" already exists.");
			}
		}
		empArray[counter]=employee;
		counter++;

	}

	@Override
	public Employee fetchEmployeeById(int id) {
		for (int i=0;i<counter;i++)
		{
			if(empArray[i].getId()==id)
			{
				return empArray[i];
			}
			
		}
		return null;
	}

	@Override
	public Employee[] finadAllEmployees() {
		if(counter==0)
		{
			return null;
		}
		Employee[] temp=new Employee[counter];
		for(int i=0;i<counter;i++)
		{
			temp[i]=empArray[i];
		}
		return temp;
	}


	public void updateEmployee(int id, Employee employee) {
		
		for (int i=0;i<counter;i++)
		{
			if(empArray[i].getId()==id)
			{
				empArray[i]=employee;
				break;
			}
			
		}
	}

}
