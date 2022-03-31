package com.tcs.model;

public class Payment {
	private Integer id;
	private Integer studentId;
	private Float feeAmount;
	private String modePayment;
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
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the feeAmount
	 */
	public Float getFeeAmount() {
		return feeAmount;
	}
	/**
	 * @param feeAmount the feeAmount to set
	 */
	public void setFeeAmount(Float feeAmount) {
		this.feeAmount = feeAmount;
	}
	/**
	 * @return the modePayment
	 */
	public String getModePayment() {
		return modePayment;
	}
	/**
	 * @param modePayment the modePayment to set
	 */
	public void setModePayment(String modePayment) {
		this.modePayment = modePayment;
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
		return "Student [id=" + id + ", studentId=" + studentId + ", feeAmount=" + feeAmount + ", modePayment=" + modePayment
				+ ",timestamp+ = " + timestamp + "]";
	}
}


