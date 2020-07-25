package com.solvd.insurance.models;

public class Model {

	private Long id;
	private String description;
	private Brand brand;

	public Model(Long id, String description, Brand brand) {
		super();
		this.id = id;
		this.description = description;
		this.brand = brand;
	}

	public Model(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Model() {

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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
