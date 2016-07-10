package com.lvsang.restservice;

public class ContactDAO {
	private int id;
	private String name;
	private String address;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String addr) {
		this.address = addr;
	}
	
	public String getAddress() {
		return this.address;
	}
}
