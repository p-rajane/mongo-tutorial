package com.mongo.tutorial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/addRecord")
	public Student addRecord(@RequestBody Student student) {
		return iStudent.save(student);
	}
	
	@DeleteMapping("/delete")
	public Student deleteRecord(@RequestBody Student student) {
		iStudent.delete(student);
		return student;
	}

}
