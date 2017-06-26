package com.niit.somg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.somg.data.HelloUser;
import com.niit.somg.data.HelloUserDao;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {


	private HelloUserDao dao;
	
	@Autowired
	public HelloWorldServiceImpl(HelloUserDao dao) {
		super();
		this.dao = dao;
	}


	public void hello(int id) {
		HelloUser user = getUser(id);
		if(user != null) {
			System.out.println("Hello " + user.getUserName() +  "!!");
		}
		else {
			System.out.println("Hello World!!");
		}
		
	}


	@Override
	public HelloUser getUser(int id) {
		return dao.findOne(id);
	}
	
}

