package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.beans.Employee;
import com.hsbc.dao.util.DBConnection;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistsException {
		try {
			Connection connection=DBConnection.getConnection();
			
			String insertQuery="insert into employee(name,id,salary) values(?,?,?)";
			PreparedStatement ps=connection.prepareStatement(insertQuery);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getId());
			ps.setDouble(3, employee.getSalary());
			
			ps.executeUpdate();
			ps.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee emp=null;
		try {
			Connection connection=DBConnection.getConnection();
			String selectQuery="select * from employee where id=?";
			PreparedStatement ps=connection.prepareStatement(selectQuery);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			//got resultset in rs, now get individual vlues
			
			
			
			while(rs.next())
			{
				emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
			}
			
			ps.close();
			connection.close();
			rs.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public Object[] finadAllEmployees() {
		List<Employee> employeeList=new ArrayList<Employee>();
		Employee[] EmpArray=null;
		Employee emp=null;
		try {
			Connection connection=DBConnection.getConnection();
			String selectQuery="select * from employee";
			PreparedStatement ps=connection.prepareStatement(selectQuery);
			ResultSet rs=ps.executeQuery();
			//got resultset in rs, now get individual vlues
			
			while(rs.next())
			{
				emp=new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				employeeList.add(emp);
			}
			
			EmpArray=employeeList.toArray(new Employee[employeeList.size()]);
			
			ps.close();
			connection.close();
			rs.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return EmpArray;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		try {
			Connection connection=DBConnection.getConnection();
			String updateQuery="update employee set name=?,salary=? where id=?";
			PreparedStatement ps=connection.prepareStatement(updateQuery);
			ps.setString(1, employee.getName());
			ps.setDouble(2, employee.getSalary());
			ps.setInt(3, id);
			ps.executeUpdate();
			ps.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
