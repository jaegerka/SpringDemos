package com.in28minutes.springboot.rest.example.springboot2jdbcwithh2.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	

	public Student findById(long id) {
		return jdbctemplate.queryForObject("select * from student where id=?", 
				new Object[] { id }, 
				new BeanPropertyRowMapper<Student>(Student.class));
	}
	
}
