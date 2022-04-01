/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser12
 *
 */
import java.util.Date;

public class Student {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private Date dateOfBirth;
	private Float c1;
	private Float c2;
	private Float c3;
	private Float c4;
	private Boolean studentApproval;
	private Float studentPercent;
	private String studResult;

	public Student(long id, String firstName, String lastName, String email, String mobile, float c1, float c2,
			float c3, float c4, boolean studentApproval, float studentPercent, String studResult) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.dateOfBirth = new Date();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.studentApproval = false;
		this.studentPercent = (float) 0.00;
		this.studResult = null;
	}

	/**
	 * @return the studResult
	 */
	public String getStudResult() {
		return studResult;
	}

	/**
	 * @param studResult the studResult to set
	 */
	public void setStudResult(String studResult) {
		this.studResult = studResult;
	}

	/**
	 * @return the studentPercent
	 */
	public Float getStudentPercent() {
		return studentPercent;
	}

	/**
	 * @param studentPercent the studentPercent to set
	 */
	public void setStudentPercent(Float studentPercent) {
		this.studentPercent = studentPercent;
	}

	public Student() {
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the c1
	 */
	public Float getC1() {
		return c1;
	}

	/**
	 * @param c1 the c1 to set
	 */
	public void setC1(Float c1) {
		this.c1 = c1;
	}

	/**
	 * @return the c2
	 */
	public Float getC2() {
		return c2;
	}

	/**
	 * @param c2 the c2 to set
	 */
	public void setC2(Float c2) {
		this.c2 = c2;
	}

	/**
	 * @return the c3
	 */
	public Float getC3() {
		return c3;
	}

	/**
	 * @param c3 the c3 to set
	 */
	public void setC3(Float c3) {
		this.c3 = c3;
	}

	/**
	 * @return the c4
	 */
	public Float getC4() {
		return c4;
	}

	/**
	 * @param c4 the c4 to set
	 */
	public void setC4(Float c4) {
		this.c4 = c4;
	}

	/**
	 * @return the studentApproval
	 */
	public Boolean getStudentApproval() {
		return studentApproval;
	}

	/**
	 * @param studentApproval the studentApproval to set
	 */
	public void setStudentApproval(Boolean studentApproval) {
		this.studentApproval = studentApproval;
	}

}
