package com.solvd.insurance.models;

public class House {
	private Long id;
	private String size;
	private int rooms;
	private Address address;
	public House(Long id, String size, int rooms, Address address) {
		super();
		this.id = id;
		this.size = size;
		this.rooms = rooms;
		this.address = address;
	}
	public House(Long id, String size, int rooms) {
		super();
		this.id = id;
		this.size = size;
		this.rooms = rooms;	
	}
	
	public House() {
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	

}
