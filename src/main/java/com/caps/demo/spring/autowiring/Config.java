package com.caps.demo.spring.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.caps.demo.spring.annotations.CarConfig;
import com.caps.demo.spring.annotations.Student;
import com.caps.demo.spring.mix.Laptop;

@Configuration
@ComponentScan(basePackageClasses= {CarConfig.class,Laptop.class,Config.class})
public class Config {
	
}
