package com.niit.Springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Springmvc.model.Empmodel;

@Repository
public class EmpDAOImpl implements EmpDAO {

	public List<Empmodel> getAllEmployees() 
	{
		List<Empmodel> employees = new ArrayList<Empmodel>();
		
		Empmodel em1 = new Empmodel();
		em1.setId(01);
		em1.setFirstName("Monica");
		em1.setLastName("Geller");
		employees.add(em1);
		
		Empmodel em2 = new Empmodel();
		em2.setId(02);
		em2.setFirstName("Chandler");
		em2.setLastName("Bing");
		employees.add(em2);
		
		Empmodel em3 = new Empmodel();
		em3.setId(03);
		em3.setFirstName("Ross");
		em3.setLastName("Geller");
		employees.add(em3);
		
		Empmodel em4 = new Empmodel();
		em4.setId(04);
		em4.setFirstName("Pheobe");
		em4.setLastName("Buffay");
		employees.add(em4);
		
		Empmodel em5 = new Empmodel();
		em5.setId(05);
		em5.setFirstName("Joey");
		em5.setLastName("Tribbiani");
		employees.add(em5);
		
		Empmodel em6 = new Empmodel();
		em6.setId(06);
		em6.setFirstName("Rachel");
		em6.setLastName("Greene");
		employees.add(em6);
		return employees;
	}
}