package com.anandhu.hibernateproject;

public class Employee {
	private int empID;
	private String firstName,lastName;
	public int getID(){
		return empID;
	}
	public void setID(int empID){
		this.empID = empID;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	

}
