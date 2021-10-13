package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;

public class EmployeeDaoTreeSetImpl implements EmployeeDao {
	private static Set<Employee> employees=new TreeSet<Employee>();

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
	public Object[] finadAllEmployees() {
		
		Object[] empArr=employees.toArray();
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
