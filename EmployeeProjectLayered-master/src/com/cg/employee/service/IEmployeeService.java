package com.cg.employee.service;

import java.util.List;

import com.cg.employee.bean.EmployeeBean;
import com.cg.employee.exception.EmployeeException;

public interface IEmployeeService {

	public String addEmployee(EmployeeBean employee) throws EmployeeException;
	public void removeEmployee(EmployeeBean emplBean) throws EmployeeException;
	public EmployeeBean viewEmployeeDetails(String empId) throws EmployeeException;

	
	//public List retrieveAll() throws EmployeeException;
	
}
