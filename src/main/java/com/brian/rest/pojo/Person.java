package com.brian.rest.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class to represent a Person
 * 
 *
 */
@XmlRootElement
public class Person {

	private String firstname;
	private String surname;
	private String dob;
	private Address address;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
