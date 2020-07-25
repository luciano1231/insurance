package com.solvd.insurance.models;

public class Coverage {
	private Long id;
	private String descrpiption;
	private double amount;
	private String details;
	
	public Coverage() {	
	}
	
	public Coverage(Long id, String descrpiption, double amount, String details) {
		super();
		this.id = id;
		this.descrpiption = descrpiption;
		this.amount = amount;
		this.details = details;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescrpiption() {
		return descrpiption;
	}
	public void setDescrpiption(String descrpiption) {
		this.descrpiption = descrpiption;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	
	
}
