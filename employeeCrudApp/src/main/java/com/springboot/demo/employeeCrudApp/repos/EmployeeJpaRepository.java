package com.springboot.demo.employeeCrudApp.repos;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.employeeCrudApp.Enity.Employee;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Id>{

	Employee getEmployeeById(int id);

}
