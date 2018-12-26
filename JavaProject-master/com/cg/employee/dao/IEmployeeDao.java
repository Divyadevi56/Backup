package com.cg.employee.dao;

import com.cg.employee.bean.EmployeeBean;
import com.cg.employee.bean.ProjectBean;
import com.cg.employee.exception.EmployeeException;
import com.cg.employee.exception.ProjectException;

public interface IEmployeeDao {

	public String addEmployee(EmployeeBean employee) throws EmployeeException;
	public void removeEmployee(EmployeeBean emplBean) throws EmployeeException;
	public EmployeeBean viewEmployeeDetails(String empId) throws EmployeeException;

	public String addProject(ProjectBean project) throws ProjectException;
	public void removeProject(ProjectBean project) throws ProjectException;
	public ProjectBean viewProject(String projectId)throws ProjectException;
	
	//public List retrieveAll() throws EmployeeException;
	
}
