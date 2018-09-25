	package com.treandingstyle.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int userId;
	public int getUserId() {
		return userId;
	}
	private String email;
	private String userName;
	private String phoneNumber;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private String password;
	private boolean enabled;
	@OneToOne(mappedBy="user")
	private Customer customer;
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private Authorities authorities;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Authorities getAuthorities() {
		return authorities;
	}
	public void setAuthorities(Authorities authorities) {
		this.authorities = authorities;
	}
	public void setUserId(int nextInt) {
		// TODO Auto-generated method stub
		
	}
}
	