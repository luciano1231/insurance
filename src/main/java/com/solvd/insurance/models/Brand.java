package com.solvd.insurance.models;

public class Brand {
	private Long id;
	private String description;
	
	public Brand(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public Brand() {
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	 

}
