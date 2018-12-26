package com.cg.eis.pl;


import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class EmployeeServiceMain {
	

	public static void main(String[] args) {
		boolean condition = true;
		do {
		System.out.println("\nAvailable Services : ");
		System.out.println("1. Enter Employee Details ");
		System.out.println("2. Find Your Insurance Scheme");
		System.out.println("3. Display Details of Employee");
		System.out.println("Choose a option from above");
		
		
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		Employee employee = new Employee();
		switch (option) {
		case 1:
			
			employee.getEmployeeDetailsFromUser();
	
			break;
		case 2:
			System.out.println("Enter your Salary: ");
			double salary1 = scanner.nextDouble();
			System.out.println("Enter your Designation: ");
			Scanner scanner1 = new Scanner(System.in);
			String designation1 = scanner1.nextLine();
			Service service = new Service(salary1, designation1);
			System.out.println("Your Insurance scheme is: "+service.employeeService()); 
			break;
		case 3:
			if(employee.getId()==0){
			//Employee employee1 = new Employee();
				//System.out.println(employee1);
				employee.getEmployeeDetailsFromUser();
			}
			Service service1 = new Service(employee.getSalary(), employee.getDesignation());
			employee.setInsuranceScheme(service1.employeeService()); 
			System.out.println(employee);
			
			break;
			
		default:
			condition=false;
			break;
		}
		
		}while(condition);
		
	}
	
}
