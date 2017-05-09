package com.glarimy.cmad.blogging.api;

public class User {
	
	private int userId;
	private String login;
	private String password;
	private String userName;
	private String email;
	private String details;
	
	public User() {
		super();
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", login=" + login + ", password="
				+ password + ", userName=" + userName + ", email=" + email
				+ ", details=" + details + "]";
	}
	
	
	
	
	

}
