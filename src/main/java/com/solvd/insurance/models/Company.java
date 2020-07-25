package com.solvd.insurance.models;

public class Company {
	private Long id;
	private String description;

	public Long getId() {
		return id;
	}

	public Company() {
	}

	public Company(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
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
