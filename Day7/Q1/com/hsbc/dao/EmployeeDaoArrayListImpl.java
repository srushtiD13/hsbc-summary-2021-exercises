package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;

public class EmployeeDaoArrayListImpl implements EmployeeDao {
	private static List<Employee> employees=new ArrayList<Employee>();

	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		
		if(employees.size()!=0)
		{
			for(Employee e:employees)
			{
				if(e.getId()==employee.getId())
				{
					throw new EmployeeAlreadyExistsException("Employee with id= "+employee.getId()+" already exists.");
				}
			}
		}
		employees.add(employee);
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		for (Employee e:employees)
		{
			if(e.getId()==id)
			{
				return e;
			}
			
		}
		return null;
	}

	@Override
	public Employee[] finadAllEmployees() {
		
		//Object[] employeesArray=employees.toArray();
		Employee[] empArr=new Employee[employees.size()];
		for(int i=0;i<employees.size();i++)
		{
			empArr[i]=employees.get(i);
		}
		return empArr;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {

		for (Employee e:employees)
		{
			if(e.getId()==id)
			{
				e=employee;
				break;
			}
			
		}
	}


	

}
