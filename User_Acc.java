package com.crony.model;

public class User_Acc {

	private String username;
	private String password;
	private long uid;
	private int pin;
	private User user;
	private Checking_Account ca;
	
	public User_Acc() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public User_Acc(String username, String password, long uid, int pin, User user, Checking_Account ca) {
		super();
		this.username = username;
		this.password = password;
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "User_Acc [username=" + username + ", password=" + password + ", uid=" + uid + "]";
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Checking_Account getCa() {
		return ca;
	}
	public void setCa(Checking_Account ca) {
		this.ca = ca;
	}

	
	
}
