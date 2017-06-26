package com.niit.somg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.somg.config.HelloDaoConfig;
import com.niit.somg.config.HelloWorldConfiguration;
import com.niit.somg.service.HelloWorldService;


public class HelloWorldApp {
	public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
        		HelloWorldConfiguration.class, HelloDaoConfig.class);
        HelloWorldService service = ctx.getBean(HelloWorldService.class);
        service.hello(1);
    }
}
