package com.cerotid.walmart.test.calculators;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cerotid.walmart.calulators.WalmartRevenueCalculator;
import com.cerotid.walmart.cars.Camaro;
import com.cerotid.walmart.cars.Cars;
import com.cerotid.walmart.cars.Challenger;
import com.cerotid.walmart.cars.Mustang;
import com.cerotid.walmart.cars.Sedan;
import com.cerotid.walmart.cars.Spark;
import com.cerotid.walmart.cars.Veloster;

import org.junit.Assert;



public class WalmartRevenueCalculatorTest {
	
	private List<Cars> cars = new ArrayList<Cars>();
	private WalmartRevenueCalculator revenueCalculator = new WalmartRevenueCalculator();
	
	@Before
	public void setUp() {
		for(int i = 0; i< 20; i++) {
			if(i < 10) {
				cars.add(new Sedan());
			} else if (i < 12) {
				cars.add(new Spark());
			} else if (i < 16) {
				cars.add(new Veloster());
			} else if (i < 18) {
				cars.add(new Mustang()); 
			} else if (i < 19) {
				cars.add(new Camaro());
			} else {
				cars.add(new Challenger());
			}
		}
	}

	@Test
	public void testRevenue() {
		for(Cars car: cars) {
			revenueCalculator.oilChange(car);
		}
		Assert.assertEquals( 779.7999, revenueCalculator.getTotalRevenue(), 2.0);
		
	}

	
}
