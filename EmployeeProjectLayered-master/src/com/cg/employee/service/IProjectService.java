package com.cg.employee.service;

import java.util.List;

import com.cg.employee.bean.ProjectBean;
import com.cg.employee.exception.ProjectException;

public interface IProjectService {

	// assign project is missing
	
	public String addProject(ProjectBean project) throws ProjectException;
	public void removeProject(ProjectBean project) throws ProjectException;
	public ProjectBean viewProject(String projectId)throws ProjectException;
	
	
//	public List retrieveAll() throws ProjectException;
}
