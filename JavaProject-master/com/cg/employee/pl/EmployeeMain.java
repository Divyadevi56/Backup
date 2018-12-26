package com.cg.employee.pl;

import java.util.Scanner;

import com.cg.donor.exception.DonorException;
import com.cg.donor.service.DonorServiceImpl;
import com.cg.employee.bean.EmployeeBean;
import com.cg.employee.bean.ProjectBean;
import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeServiceImpl;
import com.cg.employee.service.IEmployeeService;

public class EmployeeMain {
	
	static Scanner sc = new Scanner(System.in);
	static IEmployeeService iEmployeeService = null;
	static EmployeeServiceImpl employeeServiceImpl = null;
	
	public static void main(String[] args) {
		
		EmployeeBean employeeBean =null;
		ProjectBean projectBean = null;
		
		String empId = null;
		int option=0;	
		while(true) {
			
		}
			System.out.println();
			System.out.println();
			System.out.println(" Employee Project Assignment Services ");
			System.out.println("_____________________________________");
			
			System.out.println("1. Add Employee ");
			System.out.println("2. Add Project ");
			System.out.println("3. View Employee Details");
			System.out.println("4. Retrieve All Details");
			System.out.println("5. Exit");
			System.out.println("__________________________________________________");
			System.out.println("Select an Option");
		
			
			try 
			{
				option = sc.nextInt();
				switch (option) {
				case 1:
					while(employeeBean==null) {
						employeeBean = populateEmployeeBean();
					}
					try
					{
						iEmployeeService = new EmployeeServiceImpl();
						empId = iEmployeeService.addEmployee(employeeBean);
						
						System.out.println("Employee details has been successfully registered");
						System.out.println("Employee Id is : "+empId);
						
					}
					catch(EmployeeException employeeException) {
						System.err.println("ERROR: "+employeeException.getMessage());
					}
					finally {
						empId=null;
						employeeBean=null;
						iEmployeeService=null;
					}
					break;
		
		
		
	}
	
}
