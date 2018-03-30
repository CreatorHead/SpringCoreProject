package com.caps.demo.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigStudent {
	
	@Bean(name="student")
	public Student getStudent() {
		Student s = new Student();
		s.setName("Blake");
		s.setSub(getSubject());
		return s;
	}
	
	@Bean(name="sub")
	public Subject getSubject() {
		return new Math();
	}
	
}
