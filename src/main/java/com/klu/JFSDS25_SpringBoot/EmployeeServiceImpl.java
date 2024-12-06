package com.klu.JFSDS25_SpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public String addEmp(Employee emp) {
		empRepo.save(emp);
		return "Employee saved";
	}
	
	@Override
	public List<Employee> getAllEmps(){
		return empRepo.findAll();
	}

}
