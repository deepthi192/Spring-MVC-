package com.niit.Springmvc.dao;

import java.util.List;

import com.niit.Springmvc.model.Empmodel;

public interface EmpDAO 
{
	public List<Empmodel> getAllEmployees();
}