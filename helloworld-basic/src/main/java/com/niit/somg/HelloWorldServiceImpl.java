package com.niit.somg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {


	private HelloUserDao dao;
	
	@Autowired
	public HelloWorldServiceImpl(HelloUserDao dao) {
		super();
		this.dao = dao;
	}


	public void hello(int id) {
		HelloUser user = dao.findOne(id);
		if(user != null) {
			System.out.println("Hello " + user.getUserName() +  "!!");
		}
		else {
			System.out.println("Hello World!!");
		}
		
	}

}

