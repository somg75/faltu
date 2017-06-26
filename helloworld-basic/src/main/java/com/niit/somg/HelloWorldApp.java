package com.niit.somg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.somg.service.HelloWorldService;


public class HelloWorldApp {
	public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.niit.somg");
        HelloWorldService service = ctx.getBean(HelloWorldService.class);
        service.hello(1);
    }
}
