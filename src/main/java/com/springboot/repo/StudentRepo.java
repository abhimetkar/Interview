package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
