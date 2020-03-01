package com.cerotid.walmart.calulators;

import java.util.Date;

import com.cerotid.walmart.cars.Cars;
import com.cerotid.walmart.cars.Coupes;
import com.cerotid.walmart.cars.Hatchback;
import com.cerotid.walmart.cars.Sedan;

public class WalmartRevenueCalculator {
	
	private double revenue;
	
	public double getTotalRevenue() {
		return revenue;
	}
	
	public void oilChange(Cars car) {
		car.setLastOilChangeDate(new Date());
		if(car instanceof Coupes) {
			revenue += 49.99;
		} else if(car instanceof Sedan) {
			revenue += 39.99;
		} else if(car instanceof Hatchback) {
			revenue += 29.99;
		}
	}
	
	public void tireChange(Cars car) {
		car.setLastTireChangeDate(new Date());
	}


}
