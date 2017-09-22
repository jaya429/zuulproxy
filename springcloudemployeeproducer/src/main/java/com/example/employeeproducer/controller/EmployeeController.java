package com.example.employeeproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeproducer.model.Employee;
import com.example.employeeproducer.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="/employees/{employeeId}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("employeeId") String empId){
		return employeeService.get(Integer.valueOf(empId));
	}
	
	@RequestMapping(value="/employes",method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE})
	public void add(@RequestBody Employee employee){
		employeeService.add(employee);
	}
}
