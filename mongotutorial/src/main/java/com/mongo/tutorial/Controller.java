package com.mongo.tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.tutorial.data.Student;
import com.mongo.tutorial.repository.IStudent;

@RestController
@RequestMapping("/mongo")
public class Controller {
	
	@Autowired
	IStudent iStudent;
	
	@GetMapping("/getDetails")
	public List<Student> getDbDetails() {
		return iStudent.findAll();
	}
	
	@PutMapping("/addRecord")
	public Student addRecord() {
		Student s = new Student("6819ffcfd74bbba3403d9389", "Tushar");
		return iStudent.save(s);
	}

}
