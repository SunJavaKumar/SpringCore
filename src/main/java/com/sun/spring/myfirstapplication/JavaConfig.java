package com.sun.spring.myfirstapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
}
