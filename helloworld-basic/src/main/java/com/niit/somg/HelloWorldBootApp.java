package com.niit.somg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.niit.somg.config.HelloWorldWebAppConfig;

@Configuration
@EnableAutoConfiguration
@Import({HelloWorldWebAppConfig.class})
public class HelloWorldBootApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldBootApp.class, args);
	}
}
