package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	public enum UserType{
		Admin,
		Customer,
		TourOperator;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="email",unique=true)
    private String email;
    private String username;
    private String password;
    private UserType userType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public User(Long id, String email, String username, String password, UserType userType) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", userType=" + userType + "]";
	}
    
    
}
