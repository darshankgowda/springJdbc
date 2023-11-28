package com.dkg.springboot.learnjpaandhiberante.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dkg.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "learn Devops", "in28minutes"));
		repository.insert(new Course(2, "learn Aws", "in28minutes"));
		repository.insert(new Course(3, "learn Azure", "in28minutes"));
		repository.insert(new Course(4, "learn GCP", "in28minutes"));
		
		repository.deleteById(1);
		System.out.println(repository.findById(2));
	}
}
