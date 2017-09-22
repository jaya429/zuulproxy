package com.example.employeeconsumer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.employeeconsumer.model.Employee;

@Service
@RefreshScope
public class EmployeeClient {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private LoadBalancerClient loadBalancer;	
	
	@Autowired
	private EmployeeService employeeService;
	
	@Value("${app.name}")
	private String applicationName;
	
	@Value("${app.author}")
	private String author;
	
	//Using DiscoveryClient
	/*public Employee get(Integer id){
		List<ServiceInstance> instance = discoveryClient.getInstances("employee-producer");
		ServiceInstance info = instance.get(0);
		RestTemplate restTemplate = new RestTemplate();
		Employee emp = restTemplate.getForObject(info.getUri()+"/employees/1", Employee.class);
		System.out.println(emp);
		return emp;
		
	}*/
	
	/*@HystrixCommand(fallbackMethod = "getEmployeeFallback",
            commandProperties = {@HystrixProperty(name="execution.timeout.enabled", value="false")})
	public Employee get(Integer id){
		ServiceInstance instance = loadBalancer.choose("employee-producer");
		RestTemplate restTemplate = new RestTemplate();
		Employee emp = restTemplate.getForObject(instance.getUri()+"/employees/1", Employee.class);
		//code to throw any runtime exception
		emp=null;
		emp.getAddress();
		return emp;
	}*/
	
	public Employee getEmplyee(Integer empId){
		System.out.println("Application Name"+applicationName+"Application Author"+author);
		ResponseEntity<Employee> employeeEntity = employeeService.getEmployee(empId.toString());
		return employeeEntity.getBody();
	}
	
	public Employee getEmployeeFallback(Integer id){
		return new Employee("FallbackEMployee",100,"Bangalore");
	}

}
