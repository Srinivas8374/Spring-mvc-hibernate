package com.jsp.dto;

public class CustomerDto {
	private int id;
	private String name;
	private String email;
	private String visitedDate;
	private double totalExp;
	
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
	public String getVisitedDate() {
		return visitedDate;
	}
	public void setVisitedDate(String visitedDate) {
		this.visitedDate = visitedDate;
	}
	public double getTotalExp() {
		return totalExp;
	}
	public void setTotalExp(double totalExp) {
		this.totalExp = totalExp;
	}
	
	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", name=" + name + ", email=" + email + ", visitedDate=" + visitedDate
				+ ", totalExp=" + totalExp + "]";
	}
	
}

