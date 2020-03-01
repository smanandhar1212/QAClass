package com.cerotid.walmart.test.richman.utilites;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cerotid.richman.utilities.Utilities;
import com.cerotid.walmart.cars.Camaro;
import com.cerotid.walmart.cars.Cars;

public class UtilitiesTest {

	private List<Cars> cars = new ArrayList<>();

	@Before
	public void setUp() {
		Cars c = new Camaro();
		c.setVin("12345");
		cars.add(c);
	}

	@Test
	public void testGetCarBasedOnCarTypeWithoutError() throws Exception {
		Cars car = Utilities.getCarBasedOnCarType("Camaro");
		Assert.assertNotNull(car);
	}

	@Test(expected = Exception.class)
	public void testGetCarBasedOnCarTypeWithError() throws Exception {
		Utilities.getCarBasedOnCarType("Car not exist");
	}

	@Test
	public void testGetCarByVinNumberWithoutError() throws Exception {
		Cars car = Utilities.getCarByVinNumber("12345", cars);
		Assert.assertNotNull(car);
	}

	@Test(expected = Exception.class)
	public void testGetCarByVinNumberWithError() throws Exception {
		Utilities.getCarByVinNumber("Vin doesnt exit", cars);
	}

}
