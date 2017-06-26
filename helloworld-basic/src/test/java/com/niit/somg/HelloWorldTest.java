package com.niit.somg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.somg.config.HelloDaoConfig;
import com.niit.somg.config.HelloWorldConfiguration;
import com.niit.somg.service.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes={HelloWorldConfiguration.class, HelloDaoConfig.class})
@ContextConfiguration(classes={HelloWorldConfiguration.class, HelloDaoConfig.class})
public class HelloWorldTest {

	@Autowired
	private HelloWorldService hello;
	
	@Test
	public void helloTest() {
		hello.hello(1);
	}
}
