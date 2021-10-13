package com.hsbc.view_controller;

import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoFactory;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceFactory;
import com.hsbc.service.EmployeeServiceImpl;

public class ViewController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice to use Database: 1. Array  2. ArrayList  3. TreeSet");
		int option=Integer.parseInt(sc.next());
		
		EmployeeDao empDao=EmployeeDaoFactory.getDaoObj(option);//getting option to select DB
		EmployeeService service=EmployeeServiceFactory.getServiceObj(empDao);//creating obj for accessing services
		int choice=0;
		do{
			System.out.println("Enter your choice: ");
			System.out.println("1. Save Employee  2. Fetch Employee by Id  3. Get list of all Employees  4. Update Name  5. Update Salary  0. EXIT");
			choice=Integer.parseInt(sc.next());
			
			switch (choice)
			{
				case 1:
					Employee emp=new Employee();
					System.out.println("__________Enter the Employee Details__________");
					System.out.println("Enter id: ");
					emp.setId(Integer.parseInt(sc.next()));
					System.out.println("Enter name: ");
					emp.setName(sc.next());
					System.out.println("Enter Salary: ");
					emp.setSalary(Float.parseFloat(sc.next()));
				try {
					service.save(emp);
					System.out.println("Employee Details saved successfully!!");
				} catch (EmployeeAlreadyExistsException e2) {
					// TODO Auto-generated catch block
					System.err.println("EXCEPTION: "+e2.getMessage());
				}
					
					System.out.println("#########################################");
					break;
					
				case 2:
					System.out.println("Enter ID to fetch employee: ");
				try {
					Employee empId=service.fetchEmployeeById(Integer.parseInt(sc.next()));
					System.out.println(empId);
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (EmployeeNotFoundException e1) {
					System.err.println("EXCEPTION: "+e1.getMessage());
					
					
				}
					System.out.println("#########################################");
					break;
					
				case 3:
					Object[] array=service.finadAllEmployees();
					if(array==null)
					{
						System.out.println("Database is EMPTY!");
						break;
					}
					for(Object e:array)
					{
						System.out.println(e);
					}
					
					System.out.println("#########################################");
					break;
					
				case 4:
					System.out.println("Enter id of employee to be updated: ");
					int id=Integer.parseInt(sc.next());
					System.out.println("Enter name to be updated: ");
				try {
					service.updateEmployeeName(id, sc.next());
					
				} catch (EmployeeNotFoundException e1) {
					System.err.println("EXCEPTION: "+e1.getMessage());
				}
					System.out.println("#########################################");
					break;
					
				case 5:
					System.out.println("Enter id of employee to be updated: ");
					int idS=Integer.parseInt(sc.next());
					System.out.println("Enter SALARY to be updated: ");
				try {
					service.updateEmployeeSalary(idS, Float.parseFloat(sc.next()));
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (EmployeeNotFoundException e1) {
					System.err.println("EXCEPTION: "+e1.getMessage());
				}
					System.out.println("#########################################");
					break;
					
			}
						
			
		}while(choice!=0);
		System.out.println("EXITED");
		System.exit(0);
		
		sc.close();
	}
	
		
}
