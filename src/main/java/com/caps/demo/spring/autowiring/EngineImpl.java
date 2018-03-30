package com.caps.demo.spring.autowiring;

import org.springframework.stereotype.Component;

@Component("engine")
public class EngineImpl implements Engine {

	@Override
	public void run() {
		System.out.println("Start Engine");
	}

	@Override
	public void stop() {
		System.out.println("Stop Engine");
	}

}
