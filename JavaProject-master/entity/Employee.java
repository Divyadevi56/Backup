package entity;

import validation.Validation;

public class Employee {
	
//---------------------------Declaration of employee variable-----------------------------------

	private String empId;
	private String empName;
	private double Salary;
	
	private String projectId;
	private String projectName;
	private String location;
	
	
		
//----------------------------- declaration ends----------------------------------------------
	
	
//----------------------- getter setter for employee stars------------------------------
		
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
			this.empId = empId;	
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
//---------------------------------- getter setter  for employee ends -------------------------------
	
	
	
}
