package com.cg.employee.dao;

import com.cg.employee.bean.ProjectBean;
import com.cg.employee.exception.ProjectException;

public interface IProjectDao {


	// assign project is missing
	
	public String addProject(ProjectBean project) throws ProjectException;
	public void removeProject(ProjectBean project) throws ProjectException;
	public ProjectBean viewProject(String projectId)throws ProjectException;
	
	
//	public List retrieveAll() throws ProjectException;
	
}
