package com.mongo.tutorial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.tutorial.data.Student;

@Repository
public interface IStudent extends MongoRepository<Student, String>{

}
