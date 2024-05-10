package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.Studentservice;

@RestController
@RequestMapping("/interview")
public class Controller {
	
	public Studentservice studentservice;
	
	
	public Controller(Studentservice studentservice) {
		this.studentservice=studentservice;
	}
	
	@GetMapping("/students")
	public List<Student> fillAllStd(){
		List<Student> list=studentservice.getList();
		return list;
	}
	
	@GetMapping("/student/{id}")
	public Student fillStd(@PathVariable int id){
		Student std=studentservice.findById(id);
		return std;
	}
	
	@PostMapping("/students")
	public Student save(@RequestBody Student student) {
		Student std=studentservice.save(student);
		return std;
	}


}
