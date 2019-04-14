package com.bita.dao;


public class FeesDTO {

private int feesId;
private int userId;
private int fees_to_be_paid;
private int total_amount ;
public int getFeesId() {
	return feesId;
}
public void setFeesId(int feesId) {
	this.feesId = feesId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getFees_to_be_paid() {
	return fees_to_be_paid;
}
public void setFees_to_be_paid(int fees_to_be_paid) {
	this.fees_to_be_paid = fees_to_be_paid;
}
public int getTotal_amount() {
	return total_amount;
}
public void setTotal_amount(int total_amount) {
	this.total_amount = total_amount;
}


}
