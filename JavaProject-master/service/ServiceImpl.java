package service;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import validation.Validation;

public class ServiceImpl implements ServiceInterface{


	
// ------------------------CREATING LISTS TO SAVE DETAILS--------------------------------
					
					
					ArrayList<String> arrEmpId = new ArrayList<>();
					ArrayList<String> arrEmpName = new ArrayList<>();
					ArrayList<Double> arrEmpSalary = new ArrayList<>();
					ArrayList<String> arrProjectId = new ArrayList<>();
					ArrayList<String> arrProjectName = new ArrayList<>();
					ArrayList<String> arrLocation = new ArrayList<>();
					
//----------------------------DONE CREATING LISTS------------------------------------------
					

	@Override
	public void addEmployee() {
		
		
		Employee employee = new Employee();
		Validation validate = new Validation();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter EmployeeID: ");
		String id = scanner.nextLine();
		
		if(validate.empNameValidation(id)) {
			employee.setEmpId(id);
		}
		else {
			return;
		}
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String nameTemp = scanner1.nextLine();
		System.out.println("Enter your Salary: ");
		double salaryTemp = scanner.nextDouble();
		
		
		
	}


	@Override
	public void addproject() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void assignProject() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeProject() {
		// TODO Auto-generated method stub
		
	}	
}
