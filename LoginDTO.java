package com.app.dto;

import lombok.Data;

@Data
public class LoginDTO {
	
	
	private String userid;
	
	
	private String pwd;


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
