package com.springboot.demo.employeeCrudApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.employeeCrudApp.Enity.Employee;
import com.springboot.demo.employeeCrudApp.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empservice;

	public EmployeeController() {
	}
	
	@GetMapping("/employees")
	public List<Employee> listEmployees()
	{
		return empservice.getEmployeeList();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeebyId(@PathVariable(name = "id")int id)
	{
		Employee emp = empservice.getemployeeById(id);
		return emp;
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		emp.setid(0);
		empservice.saveEmployee(emp);
		
		return emp;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		empservice.saveEmployee(emp);
		return emp;
	}
	
	@DeleteMapping("/employees/{id}")
	public Employee deleteEmployee(@PathVariable(name = "id")int id){
		Employee emp = empservice.getemployeeById(id);
		empservice.deleteEmployee(emp);
		return emp;
	}
	
	
	
	
	

}
