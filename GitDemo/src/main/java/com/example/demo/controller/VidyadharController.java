package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.VidyadharService;

@RestController
@RequestMapping("/student")
public class VidyadharController {
	@Autowired
	VidyadharService vidyadharService;
	@PostMapping("/add")
	public Student add(@RequestBody Student student) {
		return vidyadharService.addStudent(student);
	}

}
