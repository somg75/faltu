package com.niit.somg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.somg.data.HelloUser;
import com.niit.somg.service.HelloWorldService;

@RestController
public class HelloWorldRestController {

	@Autowired
	private HelloWorldService service;
	
	@RequestMapping(method=RequestMethod.GET, value="getuser/{id}")
	public ResponseEntity retrieve(@PathVariable("id") int id) {
		//System.out.println("Request came here >> " + id);
		HelloUser user = service.getUser(id);
		if(user == null) {
			return new ResponseEntity("No User found with ID = " + id, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(user, HttpStatus.OK);
	}
}
