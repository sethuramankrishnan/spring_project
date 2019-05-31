package com.bita.dao;


public class CourseDTO {

	private String coureId;
	private boolean course;
	private Long amount;
	
	public String getCoureId() {
		return coureId;
	}
	public void setCoureId(String coureId) {
		this.coureId = coureId;
	}
	public boolean isCourse() {
		return course;
	}
	public void setCourse(boolean course) {
		this.course = course;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
}
