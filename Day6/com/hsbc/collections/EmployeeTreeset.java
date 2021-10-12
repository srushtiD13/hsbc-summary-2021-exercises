package com.hsbc.collections;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;

public class EmployeeTreeset {
	public static void main(String[] args) {
		Set<Employee> employees=new TreeSet<Employee>();
		employees.add(new Employee(102, "Alex", 20000, "Finance"));
		employees.add(new Employee(109, "Charles", 40000, "Finance"));
		employees.add(new Employee(100, "Bruce", 50000, "Sales"));
		employees.add(new Employee(80, "Meera", 99000, "Marketing"));
		
		for (Employee e:employees)
		{
			System.out.println(e);
		}
	}
}
