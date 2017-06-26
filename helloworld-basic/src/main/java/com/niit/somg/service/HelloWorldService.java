package com.niit.somg.service;

import com.niit.somg.data.HelloUser;

public interface HelloWorldService {
	void hello(int id);
	HelloUser getUser(int id);
}
