package com.spring.supplier;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String username;

	public User(String username) {
		this.username = username;
	}

	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
