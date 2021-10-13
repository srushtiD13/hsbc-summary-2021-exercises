package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoFactory;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao=null;//creating object of DAO
	
	
	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao=dao;
	
	}

	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		dao.save(employee);

	}

	@Override
	public Employee fetchEmployeeById(int id)throws EmployeeNotFoundException {
		
		if(dao.fetchEmployeeById(id)==null)
		{
			throw new EmployeeNotFoundException("No employee found with id: "+id);
		}
		return dao.fetchEmployeeById(id);
	}

	@Override
	public Object[] finadAllEmployees() {
		
		return dao.finadAllEmployees();
	}

	@Override
	public void updateEmployeeName(int id, String name) throws EmployeeNotFoundException {
		
		Employee emp=dao.fetchEmployeeById(id);
		if(emp==null)
		{
			throw new EmployeeNotFoundException("No employee found with id: "+id);
		}
		emp.setName(name);
		dao.updateEmployee(id, emp);

	}

	@Override
	public void updateEmployeeSalary(int id, double salary) throws EmployeeNotFoundException {
		Employee emp=dao.fetchEmployeeById(id);
		if(emp==null)
		{
			throw new EmployeeNotFoundException("No employee found with id: "+id);
		}
		emp.setSalary(salary);
		dao.updateEmployee(id, emp);
	}

}
