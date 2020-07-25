package com.solvd.insurance.models;

import java.util.Date;

public class Payment {
	private Long id;
	private Date date;
	private double amount;
	
	public Payment(Long id, Date date, double amount) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
	}
	public Payment() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
