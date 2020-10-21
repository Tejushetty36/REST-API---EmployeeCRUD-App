package com.springboot.demo.employeeCrudApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.employeeCrudApp.Enity.Employee;
import com.springboot.demo.employeeCrudApp.repos.EmployeeJpaRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeJpaRepository employeerepo;

	public EmployeeService() {
	}
	
	public List<Employee> getEmployeeList(){
		return employeerepo.findAll();
	}

	public Employee getemployeeById(int id) {
		return employeerepo.getEmployeeById(id);
	}

	public Employee saveEmployee(Employee emp) {
		employeerepo.save(emp);
		return null;
	}

	public void deleteEmployee(Employee emp) {
		employeerepo.delete(emp);
	}

}
