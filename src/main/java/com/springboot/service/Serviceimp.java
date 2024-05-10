package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repo.StudentRepo;

@Service
public class Serviceimp implements Studentservice{
	
	private StudentRepo studentRepo;
	
	Serviceimp(StudentRepo studentRepo){
		this.studentRepo=studentRepo;
	}

	@Override
	public List<Student> getList() {
		List<Student> list=studentRepo.findAll();
		return list;
	}

	@Override
	public Student findById(int id) {
		Optional<Student> re=studentRepo.findById(id);
		Student student=re.get();
		
		return student;
	}

	@Override
	public void deleteById(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public Student save(Student student) {
		Student studen=studentRepo.save(student);
		return studen;
	}

}
