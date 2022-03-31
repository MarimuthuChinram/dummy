package com.tcs.model;

import java.util.Date;

public class Student {

	private Integer id;
	private String name;
	private String email;
	private Integer phoneNumber;
	private Date dob;
	private boolean isStudAprroved;
	private String timestamp;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param i the dob to set
	 */
	public void setDob(Date i) {
		this.dob = i;
	}

	/**
	 * @return the isStudAprroved
	 */
	public boolean isStudAprroved() {
		return isStudAprroved;
	}

	/**
	 * @param isStudAprroved the isStudAprroved to set
	 */
	public void setStudAprroved(boolean isStudAprroved) {
		this.isStudAprroved = isStudAprroved;
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
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ",dob="
				+ dob + ", isStudAprroved =" + isStudAprroved + ",timestamp+ = "+ timestamp+ "]";
	}
	
}
