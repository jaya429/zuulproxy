package com.example.employeeconsumer.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.employeeconsumer.model.Employee;
@Service
public class EmployeeCallback implements EmployeeService{

	@Override
	public ResponseEntity<Employee> getEmployee(String empId) {
		return new ResponseEntity<Employee>(new Employee(),HttpStatus.OK);
	}

}
