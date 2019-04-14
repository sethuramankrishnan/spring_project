package com.bita.dao;


public class UserDTO {

	private String userName;
	private char activeflag;
	private Long UserId;
	
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public char getActiveflag() {
		return activeflag;
	}
	public void setActiveflag(char activeflag) {
		this.activeflag = activeflag;
	}
	

}
