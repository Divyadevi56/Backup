package com.cg.eis.service;

public class Service implements EmployeeService{

	private double salary;
	private String designation;
	private  String insuranceScheme;
	
	
	
	public Service(double salary, String designation) {
		super();
		this.salary = salary;
		this.designation = designation;
	}




	public String getInsuranceScheme() {
		return insuranceScheme;
	}



	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}



	@Override
	public String employeeService() {
		// TODO Auto-generated method stub
		if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("System Associate"))
		{
			setInsuranceScheme("Scheme C");
		}
		else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer"))
		{
			setInsuranceScheme("Scheme B");
		}
		else if(salary>=40000 && designation.equalsIgnoreCase("Manager")) {
			setInsuranceScheme("Scheme A");
		}
		else if(salary<5000 && designation.equalsIgnoreCase("Clerk")) {
			setInsuranceScheme("No Scheme");
		}
//		else {
//			return "Invalid Combination of Salary and Designation\n";
//		}
		
		return getInsuranceScheme();
//		System.out.println(salary);
//		System.out.println(designation);
//		System.out.println(insuranceScheme);
	}
	


}
