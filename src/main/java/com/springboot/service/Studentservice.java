package com.springboot.service;

import java.util.List;

import com.springboot.entity.Student;
public interface Studentservice {
	
	Student save(Student student);
	List<Student> getList();
	Student findById(int id);
	void deleteById(int id);
	

}
