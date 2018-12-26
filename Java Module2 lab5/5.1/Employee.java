package com.cg.eis.bean;

import java.util.Scanner;

public class Employee {

	private static int id;
	private static String name;
	private static double salary;
	private static String designation;
	private static String insuranceScheme;
	
	public void getEmployeeDetailsFromUser() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your EmployeeID: ");
		this.id=scanner.nextInt();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		this.name = scanner1.nextLine();
		System.out.println("Enter your Salary: ");
		this.salary = scanner.nextDouble();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter your Designation: ");
		this.designation = scanner2.nextLine();
		
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}


	@Override
	public String toString() {
		return "Employee [EmpID=" + getId() + ", EmpName=" + getName() + ", Salary=" + getSalary()
				+ ", Designation=" + getDesignation() + ",InsuranceScheme=" + getInsuranceScheme() + "]";
	}
	
	
	
	
	
	
	
	
}
