package com.jsp.dto;

public class VisitorDto {
	private int id;
	private String name;
	private String email;
	private String add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "VisitorDto [id=" + id + ", name=" + name + ", email=" + email + ", add=" + add + "]";
	}
	
}
