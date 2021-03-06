package com.niit.somg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={HelloWorldConfiguration.class, HelloDaoConfig.class})
public class HelloWorldTest {

	@Autowired
	private HelloWorldService hello;
	
	@Test
	public void helloTest() {
		hello.hello(1);
	}
}
