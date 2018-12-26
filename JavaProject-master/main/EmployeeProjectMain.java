package main;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import service.ServiceImpl;
import service.ServiceInterface;

public class EmployeeProjectMain {
	
	public static void main(String[] args){
		
		
				ServiceImpl s1 = new ServiceImpl();	
					
		boolean condition = true;
		do {
		
// -----------------------Displaying menu and taking option from user------------------------------
			
		System.out.println("\nAvailable Services : ");
		System.out.println("1. Add Employees. ");
		System.out.println("2. Assign Project.");
		System.out.println("3. Remove Project.");
		System.out.println("4. Find Details of Employee.");
		System.out.println("Choose a option from above or other to exit");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
//------------------------------------------MENU OVER---------------------------------------------

		switch (option) {
		case 1:
			
			s1.addEmployee();
			
			
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
			
		default:
			condition=false;
			break;
		}
		
		}while(condition);
		
		
		
	}
	
}
