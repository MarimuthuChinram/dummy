/**
 * 
 */
package com.tcs.model;

import java.util.Date;
/**
 * @author springuser12
 *
 */
public class Courses {

	private Long id;
	private String courseName;
	private String courseCode;

	/**
	 * @param id
	 * @param courseName
	 * @param courseCode
	 */
	public Courses(long id, String courseName, String courseCode) {
		this.id = id;
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

	public Courses() {

	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
