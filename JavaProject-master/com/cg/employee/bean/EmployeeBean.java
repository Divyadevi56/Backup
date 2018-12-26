package com.cg.employee.bean;

public class EmployeeBean {

	
	private String empId;
	private String empName;
	private double salary;
	private String phoneNumber;
	private String address;
	private String designation;
	private ProjectBean projectInfo;
	
	
	
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
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public ProjectBean getProjectInfo() {
		return projectInfo;
	}
	public void setProjectInfo(ProjectBean projectInfo) {
		this.projectInfo = projectInfo;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", designation=" + designation + "]";
	}
	
	
	
	
}
