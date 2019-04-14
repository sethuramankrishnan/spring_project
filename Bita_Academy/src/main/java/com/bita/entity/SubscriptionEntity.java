package com.bita.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUBSCRIPTION_BITA")
public class SubscriptionEntity implements Serializable {

	private long subscriptionId;
	private long userId;
	private long courseId;
	private int paidamount;
	private int totalamount;
	private int balanceamount;
	private int duration;
	private String status;
	private Date enddate;
	private Date startdate;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	@Column
	public int getPaidamount() {
		return paidamount;
	}

	public void setPaidamount(int paidamount) {
		this.paidamount = paidamount;
	}

	@Column
	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	@Column
	public int getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount(int balanceamount) {
		this.balanceamount = balanceamount;
	}

	@Column
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Column
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column
	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column
	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Column
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column
	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

}