package com.cerotid.richman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cerotid.richman.utilities.Utilities;
import com.cerotid.walmart.calulators.WalmartRevenueCalculator;
import com.cerotid.walmart.cars.Camaro;
import com.cerotid.walmart.cars.Cars;
import com.cerotid.walmart.cars.Challenger;
import com.cerotid.walmart.cars.Coupes;
import com.cerotid.walmart.cars.Hatchback;
import com.cerotid.walmart.cars.Mustang;
import com.cerotid.walmart.cars.Sedan;
import com.cerotid.walmart.cars.Spark;
import com.cerotid.walmart.cars.Veloster;

public class RichMan {

	List<Cars> myCars = new ArrayList<>();

	public void setMyCars(List<Cars> myCars) {
		this.myCars = myCars;
	}

	public List<Cars> getMyCars() {
		return myCars;
	}

	Scanner in = new Scanner(System.in);
	WalmartRevenueCalculator wm = new WalmartRevenueCalculator();

	public void displayMenu() {
		String input;
		boolean isExit = false;
		while (isExit == false) {

			System.out.println("Choose one of the option");
			System.out.println("Press a to add a new car");
			System.out.println("Press b Modify cars features");
			System.out.println("Press c Repaint");
			System.out.println("Press d to perform regular services in walmart");
			System.out.println("Press e exit");
			input = in.next();
			switch (input) {
			case "a":
				System.out.println("Enter type of your car. Available options: "
						+ "Camaro, Challenger, Mustang, Coupes, Sedan, Hatchback, Veloster, Spark");
				try {
					String carType = in.next();
					Cars newCar = Utilities.getCarBasedOnCarType(carType);
					System.out.println("Enter Vin Number for new car");
					newCar.setVin(in.next());
					this.addCar(newCar);
				} catch (Exception npe) {
					System.out.println(
							"Error occured while adding car in the list." + "Here is the error" + npe.getMessage());
				}
				break;
			case "b":
				System.out.println("Enter vin to modify");
				try {
					this.modify(Utilities.getCarByVinNumber(in.next(), myCars));
				} catch (Exception e) {
					System.out.println("Error occured while modifying car");
				}
				break;
			case "c":
				System.out.println("Enter vin to modify");
				String vin = in.next();
				Cars carToReColor;
				try {
					carToReColor = Utilities.getCarByVinNumber(vin, myCars);
					System.out.println("Enter new color");
					String newColor = in.next();
					this.repaint(carToReColor, newColor);
				} catch (Exception e) {
					System.out.println("Error occured while recoloring the car");
				}
				break;
			case "d":
				System.out.println("Enter vin to modify");
				String vinNo = in.next();
				try {
					Cars carToService = Utilities.getCarByVinNumber(vinNo, myCars);
					System.out.println("Enter 1 for oil chnage or 2 for tire change");
					int oilOrTireChange = in.nextInt();
					this.performService(carToService, oilOrTireChange);
				} catch (Exception e) {
					System.out.println("Error occured while servicing your car");
				}
				break;
			case "e":
				isExit = true;
				break;
			}

		}

	}

	public void addCar(Cars c) {
		this.myCars.add(c);
	}

	public void modify(Cars c) {
		// TODO needs to implement modify feature
	}

	public void repaint(Cars c, String newColor) {
		c.setColor(newColor);
	}

	public void performService(Cars c, int oilOrTireChange) {
		if (oilOrTireChange == 1) {
			wm.oilChange(c);
			System.out.println(c.getLastOilChangeDate());
		} else {
			wm.tireChange(c);
			System.out.println(c.getLastTireChangeDate());
		}
	}

}
