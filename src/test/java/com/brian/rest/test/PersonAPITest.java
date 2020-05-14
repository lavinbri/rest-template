package com.brian.rest.test;

import org.junit.Assert;
import org.junit.Test;

import com.brian.rest.api.PersonAPI;

/**
 * Class used to test PersonAPI methods
 * 
 */

public class PersonAPITest {

	@Test
	public void testGet() {

		PersonAPI personAPI = new PersonAPI();

		Assert.assertEquals(personAPI.getPerson().getFirstname(), "Jimmy");
	}

}
