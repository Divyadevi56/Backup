package com.cg.eis.exception;



public class EmployeeException extends Exception {
	
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(ANSI_RED+"ERROR!!! Entered Salary is less than 3000"+ANSI_RESET);
	}

	
}
