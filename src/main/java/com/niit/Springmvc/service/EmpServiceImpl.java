package com.niit.Springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Springmvc.dao.EmpDAO;
import com.niit.Springmvc.model.Empmodel;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO dao;
	
	public List<Empmodel> getAllEmployees() 
	{
		return dao.getAllEmployees();
	}
}
