package com.tka.userlogin.user;

import org.springframework.stereotype.Component;

@Component
public class Login {
	String username;
	String Password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}
	
  public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
@Override
	public String toString() {
		return "Login [username=" + username + ", Password=" + Password + "]";
	}
}
