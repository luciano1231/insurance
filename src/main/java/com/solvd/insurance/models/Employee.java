package com.solvd.insurance.models;

public class Employee {
	private Long id;
	private String name;
	private int phone;
	private String email;
	private Office office;
	public Employee(Long id, String name, int phone, String email, Office office) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.office = office;
	}
	public Employee() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	
	

}
