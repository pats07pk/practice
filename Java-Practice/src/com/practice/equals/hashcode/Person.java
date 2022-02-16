package com.practice.equals.hashcode;

import java.util.Objects;

public class Person {

	private String firstName;
	private String lastName;
	private int aadhar;

	public Person(String firstName, String lastName, int aadhar) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadhar = aadhar;
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

	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public boolean equals(Object obj) {
	
		if (this == obj)
			return true;

		if(obj == null)
			return false;
		
		if( !(obj instanceof Person))
			return false;
		
		Person person = (Person) obj;
		
		return aadhar == person.getAadhar() && 
				Objects.equals(this.firstName, person.getFirstName()) && 
				Objects.equals(this.lastName, person.getLastName());
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(getAadhar(), getFirstName(), getLastName());
	}

}
