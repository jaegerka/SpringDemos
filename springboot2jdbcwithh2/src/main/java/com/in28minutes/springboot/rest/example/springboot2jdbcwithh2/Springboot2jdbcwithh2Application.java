package com.in28minutes.springboot.rest.example.springboot2jdbcwithh2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.springboot.rest.example.springboot2jdbcwithh2.student.StudentJdbcRepository;

@SpringBootApplication
public class Springboot2jdbcwithh2Application implements CommandLineRunner {

	@Autowired
	StudentJdbcRepository repository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot2jdbcwithh2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Student id 10001 -> {}", repository.findById(10001L));
		
	}

}
