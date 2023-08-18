package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class pah_1 {
	@GetMapping("/sd")
	public List<Student> display()
	{
		return Arrays.asList(new Student("Varshaa","hello and vanakkam"),new Student("Soundhariya","HII,How are you !"));
	}
	
	
	
	

}
