package com.hsbc.beans;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private String department;
	private double salary;
	
	

	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", department=");
		builder.append(department);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}


//compareTo method
	public int compareTo(Employee o) {
		if(this.id>o.id)
		{
			return 1;
		}
		if(this.id<o.id)
		{
			return -1;
		}
		if(this.id==o.id)
		{
			return 0;
		}
		
		return 0;
	}

}
