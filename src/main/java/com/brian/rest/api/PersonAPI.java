package com.brian.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.brian.rest.pojo.Address;
import com.brian.rest.pojo.Person;

/**
 * Person API class
 * 
 *
 */
@Path("/person")
public class PersonAPI {

	@GET
	public Person getPerson() {

		Person person = new Person();
		person.setFirstname("Jimmy");
		person.setSurname("McFadden");
		person.setDob("1940-03-09");

		Address address = new Address();
		address.setCountry("Ireland");
		person.setAddress(address);
		return person;

	}

}
