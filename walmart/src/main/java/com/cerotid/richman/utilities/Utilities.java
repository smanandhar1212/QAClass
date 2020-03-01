package com.cerotid.richman.utilities;

import java.util.List;

import com.cerotid.walmart.cars.Camaro;
import com.cerotid.walmart.cars.Cars;
import com.cerotid.walmart.cars.Challenger;
import com.cerotid.walmart.cars.Coupes;
import com.cerotid.walmart.cars.Hatchback;
import com.cerotid.walmart.cars.Mustang;
import com.cerotid.walmart.cars.Sedan;
import com.cerotid.walmart.cars.Spark;
import com.cerotid.walmart.cars.Veloster;

public class Utilities {

	
	public static Cars getCarBasedOnCarType(String carType) throws Exception {
		Cars newCar = null;
		if (carType.equals("Camaro")) {
			newCar = new Camaro();
		} else if (carType.equals("Challenger")) {
			newCar = new Challenger();
		} else if (carType.equals("Mustang")) {
			newCar = new Mustang();
		} else if (carType.equals("Coupes")) {
			newCar = new Coupes();
		} else if (carType.equals("Sedan")) {
			newCar = new Sedan();
		} else if (carType.equals("Hatchback")) {
			newCar = new Hatchback();
		} else if (carType.equals("Veloster")) {
			newCar = new Veloster();
		} else if (carType.equals("Spark")) {
			newCar = new Spark();
		} else {
			throw new Exception("Car Type not available");
		}
		return newCar;
	}
	
	public static Cars getCarByVinNumber(String vin, List<Cars> cars) throws Exception {
		for (Cars c : cars) {
			if (c.getVin().equals(vin)) {
				return c;
			}
		}
		throw new Exception("Car doesn't exist");
	}
}
