package com.example.employeeconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeconsumer.client.EmployeeClient;
import com.example.employeeconsumer.model.Employee;

@RestController
public class EmployeeController {
/*	@Autowired
	private EmployeeClient employeeClient;

	@RequestMapping(value="/employees/{employeeId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("employeeId") String empId){
		return employeeClient.get(Integer.valueOf(empId));
	}
	*/
}
