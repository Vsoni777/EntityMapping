package com.bean;

public class Employee {
	private int empid;
	private String emp_name;
	private double salary;
	private Address edd;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String emp_name, double salary, Address edd) {
		super();
		this.empid = empid;
		this.emp_name = emp_name;
		this.salary = salary;
		this.edd = edd;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getEdd() {
		return edd;
	}

	public void setEdd(Address edd) {
		this.edd = edd;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emp_name=" + emp_name + ", salary=" + salary + ", edd=" + edd + "]";
	}
	
	
}
