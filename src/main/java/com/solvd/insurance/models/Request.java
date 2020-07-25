package com.solvd.insurance.models;

import java.util.Date;

public class Request {
	private Long id;
	private Date date;
	private Customer customer;
	private Product product;
	private double total;
	private Payment payment;
	private String details;
	private Employee employee;
	public Request(Long id, Date date, Customer customer, Product product, double total, Payment payment,
			String details, Employee employee) {
		super();
		this.id = id;
		this.date = date;
		this.customer = customer;
		this.product = product;
		this.total = total;
		this.payment = payment;
		this.details = details;
		this.employee = employee;
	}
	public Request() {
		super();
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
