/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser12
 *
 */
public class Courses {

	private Integer id;
	private String courseName;
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
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
		return "Student [id=" + id + ", courseName=" + courseName+ ",timestamp+ = " + timestamp + "]";
	}
}
