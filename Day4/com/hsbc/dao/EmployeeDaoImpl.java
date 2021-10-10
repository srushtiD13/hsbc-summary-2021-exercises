package com.hsbc.dao;

import com.hsbc.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Employee[] empArray=new Employee[10];//static becoz we want it to be act like DB
	private static int counter=0;
	@Override
	public void save(Employee employee) {
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

	@Override
	public void updateEmployeeName(int id, String name) {
		for (int i=0;i<counter;i++)
		{
			if(empArray[i].getId()==id)
			{
				empArray[i].setName(name);
				
				break;
			}
			
		}
		
	}

	@Override
	public void updateEmployeeSalary(int id, double salary) {
		for (int i=0;i<counter;i++)
		{
			if(empArray[i].getId()==id)
			{
				empArray[i].setSalary(salary);
				break;
			}
			
		}
		
	}

}
