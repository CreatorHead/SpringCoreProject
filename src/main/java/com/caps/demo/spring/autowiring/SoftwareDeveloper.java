package com.caps.demo.spring.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("softwareDevloper")
@Primary
public class SoftwareDeveloper implements Job {

	public void doWork() {
		System.out.println("Typing codes, codes and codes");
	}
	
}
