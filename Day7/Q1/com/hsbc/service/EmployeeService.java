package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	public void save(Employee employee)throws EmployeeAlreadyExistsException;
	public Employee fetchEmployeeById(int id) throws EmployeeNotFoundException;
	public Object[] finadAllEmployees();
	public void updateEmployeeName(int id,String name)throws EmployeeNotFoundException;
	public void updateEmployeeSalary(int id,double salary)throws EmployeeNotFoundException;
}
