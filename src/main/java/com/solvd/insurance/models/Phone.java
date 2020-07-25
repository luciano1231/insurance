package com.solvd.insurance.models;

public class Phone {
	private Long id;
	private String detail;
	private int number;
	private Customer customer;
	private Office office;
	private Employee employee;
	
	public Phone(Long id, String detail, int number, Customer customer, Office office, Employee employee) {
		super();
		this.id = id;
		this.detail = detail;
		this.number = number;
		this.customer = customer;
		this.office = office;
		this.employee = employee;
	}
	
	public Phone(Long id, String detail, int number) {
		super();
		this.id = id;
		this.detail = detail;
		this.number = number;
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Phone() {
	
	}
	
	
	
}
