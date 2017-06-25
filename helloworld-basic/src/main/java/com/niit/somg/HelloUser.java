package com.niit.somg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="msauser")
public class HelloUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	Integer id;
	
	@Column(name="username")
	String userName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
