package com.niit.somg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.niit.somg"})
public class HelloWorldConfiguration {

	/*@Bean
	public HelloWorldService getHello() {
		return new HelloWorldServiceImpl();
	}*/
}
