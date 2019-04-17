package com.thymeleafdemo.com.thymeleaf.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleafdemo.com.thymeleaf.demo.entity.Employee;


@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello(Model model){
		model.addAttribute("Date", new java.util.Date());
		return "helloworld";
		
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model){
		Employee emp1=new Employee("Kishan", "Shaw", "kshaw@outlook.com");
		Employee emp2=new Employee("Jyoti", "Shaw", "jshaw@outlook.com");
		List<Employee> employees=new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		model.addAttribute("employees", employees);
		return "list-employees";
		
	}

}
