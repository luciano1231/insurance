package com.solvd.insurance.models;

public class Car {
	
	private Long id;
	private int chasis;
	private String color;
	private int year;
	private Model model;
	public Car(Long id, int chasis, String color, int year, Model model) {
		super();
		this.id = id;
		this.chasis = chasis;
		this.color = color;
		this.year = year;
		this.model = model;
	}
	public Car(Long id, int chasis, String color, int year) {
		super();
		this.id = id;
		this.chasis = chasis;
		this.color = color;
		this.year = year;
		}
	public Car() {
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getChasis() {
		return chasis;
	}
	public void setChasis(int chasis) {
		this.chasis = chasis;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	
	

}
