package com.ibm.healthplanner.spring.bean;

public class PatientName {
	
	private String firstName ;
	private String lastName;
	
	public PatientName(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
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
