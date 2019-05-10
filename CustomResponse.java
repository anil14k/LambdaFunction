package com.amazonaws.lambda.demo;

public class CustomResponse {
	
	private String greeting;
	private String deptName;
	private String deptNo;

	public CustomResponse(String greeting, String deptName, String deptNo) {
		super();
		this.greeting = greeting;
		this.deptName = deptName;
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getGreeting() {
		return greeting;
	}
	
	public CustomResponse() {}
	
	public CustomResponse(String greeting) {
		super();
		this.greeting = greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
