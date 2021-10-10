package com.hsbc.service;

import com.hsbc.beans.Employee;

public interface EmployeeService {
	public void save(Employee employee);
	public Employee fetchEmployeeById(int id);
	public Employee[] finadAllEmployees();
	public void updateEmployeeName(int id,String name);
	public void updateEmployeeSalary(int id,double salary);
}
