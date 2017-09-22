package com.example.employeeproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeproducer.model.Employee;
import com.example.employeeproducer.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;
	
	public Employee get(Integer id){
		return empRepository.get(id);
		
	}
	
	public void add(Employee emp){
		empRepository.add(emp);
	}
	
	public void delete(Employee emp){
		empRepository.delete(emp);
	}
	
	public void update(Employee emp){
		empRepository.update(emp);
	}
}
