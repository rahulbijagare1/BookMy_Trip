package com.example.demo.dto;

import com.example.demo.entities.User.UserType;



public class UserDto {

	private Long id;
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
	public UserDto(Long id, String email, String username, String password, UserType userType) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", userType=" + userType + "]";
	}
    
}
