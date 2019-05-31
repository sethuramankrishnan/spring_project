package com.bita.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FEES_BITA")
public class FeesEntity implements Serializable {
	private long feesId;
	private long userId;
	private int feestobepaid;
	private int totalAmount;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public long getFeesId() {
		return feesId;
	}

	public void setFeesId(long feesId) {
		this.feesId = feesId;
	}

	@Column
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column
	public int getFeestobepaid() {
		return feestobepaid;
	}

	public void setFeestobepaid(int feestobepaid) {
		this.feestobepaid = feestobepaid;
	}

	@Column
	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}