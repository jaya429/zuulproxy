package com.example.employeeconsumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.employeeconsumer.model.Employee;

@FeignClient(name="gateway",fallback=EmployeeFallBack.class)
public interface EmployeeService {

	@RequestMapping(value="/api/employee-producer/employees/{empId}",method=RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") String empId);
		
}
