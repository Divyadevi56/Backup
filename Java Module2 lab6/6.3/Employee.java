package com.cg.eis.bean;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Employee {

	private static int id;
	private static String name;
	private static double salary;
	private static String designation;
	private static String insuranceScheme;
	
	public void getEmployeeDetailsFromUser() throws EmployeeException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your EmployeeID: ");
		int idTemp=scanner.nextInt();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String nameTemp = scanner1.nextLine();
		System.out.println("Enter your Salary: ");
		double salaryTemp = scanner.nextDouble();
		
		if(salaryTemp<3000) {
			throw new EmployeeException();
		}
		id=idTemp;
		name=nameTemp;
		salary=salaryTemp;
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter your Designation: ");
		Employee.designation = scanner2.nextLine();
		
		
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		Employee.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Employee.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		Employee.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		Employee.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		Employee.insuranceScheme = insuranceScheme;
	}


	@Override
	public String toString() {
		return "Employee [EmpID=" + getId() + ", EmpName=" + getName() + ", Salary=" + getSalary()
				+ ", Designation=" + getDesignation() + ",InsuranceScheme=" + getInsuranceScheme() + "]";
	}
	
	
	
	
	
	
	
	
}
