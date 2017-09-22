package com.example.employeeproducer.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.employeeproducer.model.Employee;

@Repository
public class EmployeeRepository {

	private static Map<Integer,Employee> employees = new HashMap<Integer,Employee>();
	
	static{
		Employee emp = new Employee("jaya", 1, "Nellore");
		Employee emp1 = new Employee("krishna", 2, "Nellore");
		employees.put(emp.getNo(),emp);
		employees.put(emp1.getNo(), emp1);
	}
	
	public Employee get(Integer id){
		return employees.get(id);
		
	}
	
	public void add(Employee emp){
		employees.put(emp.getNo(), emp);
	}
	
	public void delete(Employee emp){
		employees.remove(emp.getNo());
	}
	
	public void update(Employee emp){
		employees.put(emp.getNo(), emp);
	}
}
