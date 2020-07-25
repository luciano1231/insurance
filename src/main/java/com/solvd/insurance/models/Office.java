package com.solvd.insurance.models;

public class Office {
	private Long id;
	private String name;
	private Company company;

	public Office() {
	}

	public Office(Long id, String name, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
