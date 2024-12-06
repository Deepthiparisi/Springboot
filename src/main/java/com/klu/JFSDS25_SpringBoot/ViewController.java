package com.klu.JFSDS25_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/add_emp")
	public String renderAddEmpView() {
		return "add_emp";
	}
	
	@PostMapping("/addEmployee")
	public String test(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("employee", employee);
		System.out.println(empService.addEmp(employee));
		return "viewData";
	}
       
	@GetMapping("/viewAllEmps")
	public String viewEmps(Model model) {
		model.addAttribute("emps", empService.getAllEmps());
		return "displayEmps";
	}
}
