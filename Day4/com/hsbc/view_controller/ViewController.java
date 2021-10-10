package com.hsbc.view_controller;

import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class ViewController {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		EmployeeService service=new EmployeeServiceImpl();//creating obj for accessing services
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
					service.save(emp);
					System.out.println("Employee Details saved successfully!!");
					System.out.println("#########################################");
					break;
					
				case 2:
					System.out.println("Enter ID to fetch employee: ");
					if(service.fetchEmployeeById(Integer.parseInt(sc.next()))==null)
					{
						System.out.println("No Employee of such id");
						break;
					}
					System.out.println(service.fetchEmployeeById(Integer.parseInt(sc.next())));
					System.out.println("#########################################");
					break;
					
				case 3:
					Employee[] array=service.finadAllEmployees();
					if(array==null)
					{
						System.out.println("Database is EMPTY!");
						break;
					}
					for(Employee e:array)
					{
						System.out.println(e);
					}
					
					System.out.println("#########################################");
					break;
					
				case 4:
					System.out.println("Enter id of employee to be updated: ");
					int id=Integer.parseInt(sc.next());
					if(service.fetchEmployeeById(id)==null)
					{
						System.out.println("No Employee of such id");
						break;
					}
					System.out.println("Enter name to be updated: ");
					service.updateEmployeeName(id, sc.next());
					System.out.println("#########################################");
					break;
					
				case 5:
					System.out.println("Enter id of employee to be updated: ");
					int idS=Integer.parseInt(sc.next());
					if(service.fetchEmployeeById(idS)==null)
					{
						System.out.println("No Employee of such id");
						break;
					}
					System.out.println("Enter SALARY to be updated: ");
					service.updateEmployeeSalary(idS, Float.parseFloat(sc.next()));
					System.out.println("#########################################");
					break;
					
			}
						
			
		}while(choice!=0);
		System.out.println("EXITED");
		
		sc.close();
	}
	
		
}
