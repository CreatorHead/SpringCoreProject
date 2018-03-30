package com.caps.demo.spring.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SoftwareTester implements Job{

	public void doWork() {
		System.out.println("Test codes n codes n codes");
	}

}
