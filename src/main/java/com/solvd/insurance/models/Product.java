package com.solvd.insurance.models;

public class Product {
	private Long id;
	private String details;
	private Coverage coverage;
	private Car car;
	private House house;
	public Product(Long id, String details, Coverage coverage, Car car, House house) {
		super();
		this.id = id;
		this.details = details;
		this.coverage = coverage;
		this.car = car;
		this.house = house;
	}
	public Product() {
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Coverage getCoverage() {
		return coverage;
	}
	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	
	
	
}
