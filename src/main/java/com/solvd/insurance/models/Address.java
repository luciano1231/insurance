package com.solvd.insurance.models;

public class Address {
	private Long id;
	private String street;
	private String number;
	private Cities cities;

	public Address(Long id, String street, String number, Cities cities) {
		super();
		this.id = id;
		this.street = street;
		this.number = number;
		this.cities = cities;
	}

	public Address(Long id, String street, String number) {
		this.id = id;
		this.street = street;
		this.number = number;

	}

	public Address() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Cities getCities() {
		return cities;
	}

	public void setCities(Cities cities) {
		this.cities = cities;
	}

}
