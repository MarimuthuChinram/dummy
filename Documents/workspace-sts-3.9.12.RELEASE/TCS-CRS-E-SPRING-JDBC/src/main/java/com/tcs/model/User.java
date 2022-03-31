/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser12
 *
 */
public class User {
	private int id;
	private String userId;
	private String password;
	private int roleId;
	private String timestamp;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the user_id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setuserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String toString() {
		return "Student [id=" + id + ", userId=" + userId + ", password=" + password + ", roleId=" + roleId
				+ ",timestamp+ = " + timestamp + "]";
	}


}
