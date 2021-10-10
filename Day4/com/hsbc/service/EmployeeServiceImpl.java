package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoFactory;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao=null;//creating object of DAO
	
	
	public EmployeeServiceImpl() {
		dao=EmployeeDaoFactory.getDaoObj();
	
	}

	@Override
	public void save(Employee employee) {
		dao.save(employee);

	}

	@Override
	public Employee fetchEmployeeById(int id) {
		
		return dao.fetchEmployeeById(id);
	}

	@Override
	public Employee[] finadAllEmployees() {
		
		return dao.finadAllEmployees();
	}

	@Override
	public void updateEmployeeName(int id, String name) {
		dao.updateEmployeeName(id, name);

	}

	@Override
	public void updateEmployeeSalary(int id, double salary) {
		dao.updateEmployeeSalary(id, salary);

	}

}
