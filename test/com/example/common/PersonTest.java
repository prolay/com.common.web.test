package com.example.common;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	Person personObj;
	
	@Before
	public void setUp() throws Exception {
		personObj = new Person();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCalculateRewardPoints() {
		int points = personObj.CalculateRewardPoints();
		Assert.assertEquals(5, points);
	}
	
	@Test
	public final void calculateRewardPoints_shouldBeDivisibleByFive() {
		int points = personObj.CalculateRewardPoints();
		Assert.assertEquals(0, points%5);
	}

}
