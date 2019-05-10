package com.amazonaws.lambda.demo;

public class CustomRequest {
	
	private String name;
	private String firstName;
	private String lastName;
	
	public CustomRequest() {
		
	}
	
	public CustomRequest(String name, String firstName, String lastName) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
