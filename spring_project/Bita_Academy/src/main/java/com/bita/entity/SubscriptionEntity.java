package com.bita.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUBSCRIPTION_BITA")
public class SubscriptionEntity {

	private long subscriptionId;
	private long userId;
	private long courseId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	
	@Column
	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@Column
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}