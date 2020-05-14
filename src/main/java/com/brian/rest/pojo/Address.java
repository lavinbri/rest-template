package com.brian.rest.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/***
 * Class to store details of an Address
 *
 */
@XmlRootElement
public class Address {

	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
