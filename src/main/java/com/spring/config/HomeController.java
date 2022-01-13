package com.spring.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.Student;
import com.spring.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	StudentService stuService;
	
	@RequestMapping({"/", "/Home"})
	public String showHome() {
		return "Home";
	}
	
	@RequestMapping("/showStudentsView")
	public String getAllStudents(Model model) {
		
		List<Student> allStudents = stuService.getAllStudents();
		model.addAttribute("students", allStudents);
		return "StudentsList";
	}
}
