package com.cerotid.richman.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.cerotid.walmart.cars.Cars;

public class FileUtilities {
	private String fileName;

	public FileUtilities(String fileName) {
		super();
		this.fileName = fileName;
	}

	public void write(List<Cars> cars) {
		try {

			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(cars);
			objectOut.close();
			System.out.println("Cars  was succesfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<Cars> read() {
		try {

			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			List<Cars> obj = (List<Cars>) objectIn.readObject();

			System.out.println("The Object has been read from the file");
			objectIn.close();
			return obj;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
