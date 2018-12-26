package com.cg.employee.dao;

import com.cg.employee.bean.EmployeeBean;
import com.cg.employee.exception.EmployeeException;

public interface IEmployeeDao {

	public String addEmployee(EmployeeBean employee) throws EmployeeException;
	public void removeEmployee(EmployeeBean emplBean) throws EmployeeException;
	public EmployeeBean viewEmployeeDetails(String empId) throws EmployeeException;

	
	//public List retrieveAll() throws EmployeeException;
	
}
