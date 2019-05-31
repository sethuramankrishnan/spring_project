package stock.walmart.dao;

import lombok.Getter;
import lombok.Setter;


public class UserDTO {

	private String userName;
	private boolean active;
	private Long UserId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}

}
