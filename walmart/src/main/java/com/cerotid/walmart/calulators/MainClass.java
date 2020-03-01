package com.cerotid.walmart.calulators;

import com.cerotid.richman.RichMan;

public class MainClass {
	
	public static void main(String[] args) {
//		List<Cars> cars = new ArrayList<Cars>();
//		for(int i = 0; i< 20; i++) {
//			if(i < 10) {
//				cars.add(new Sedan());
//			} else if (i < 12) {
//				cars.add(new Spark());
//			} else if (i < 16) {
//				cars.add(new Veloster());
//			} else if (i < 18) {
//				cars.add(new Mustang());
//			} else if (i < 19) {
//				cars.add(new Camaro());
//			} else {
//				cars.add(new Challenger());
//			}
//		}
//		WalmartRevenueCalculator revenueCalculator = new WalmartRevenueCalculator();
//		for(Cars car: cars) {
//			revenueCalculator.oilChange(car);
//		}
//		
//		System.out.println(revenueCalculator.getTotalRevenue());
		RichMan rm = new RichMan();
		try {
			rm.inputOutput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
