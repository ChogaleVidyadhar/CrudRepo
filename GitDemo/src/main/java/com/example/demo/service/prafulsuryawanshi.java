package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.entity.Student;

@Service
public class prafulsuryawanshi {
	
@Autowired
StudentRepo studentRepo;
	public Student addStudent(Student student) {
	
		return studentRepo.save(student);

}
}