package com.cerotid.walmart.cars;

import java.io.Serializable;
import java.util.Date;

public abstract class Cars implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6456457621240250100L;
	private Engine engine;
	private Tires tires;
	private int doors;
	private int maxSpeed;
	private boolean hasAndroidAuto;
	private boolean hasCarPlay;
	private Date lastOilChangeDate;
	private Date lastTireChangeDate;
	private String vin;
	private String color;
	
	

	public Date getLastOilChangeDate() {
		return lastOilChangeDate;
	}

	public void setLastOilChangeDate(Date lastOilChangeDate) {
		this.lastOilChangeDate = lastOilChangeDate;
	}

	public Date getLastTireChangeDate() {
		return lastTireChangeDate;
	}

	public void setLastTireChangeDate(Date lastTireChangeDate) {
		this.lastTireChangeDate = lastTireChangeDate;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tires getTires() {
		return tires;
	}

	public void setTires(Tires tires) {
		this.tires = tires;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	


	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isHasAndroidAuto() {
		return hasAndroidAuto;
	}

	public void setHasAndroidAuto(boolean hasAndroidAuto) {
		this.hasAndroidAuto = hasAndroidAuto;
	}

	public boolean isHasCarPlay() {
		return hasCarPlay;
	}

	public void setHasCarPlay(boolean hasCarPlay) {
		this.hasCarPlay = hasCarPlay;
	}

	private String getAvailableTechnologyFeatures() {
		String availableTechnologies = "";
		availableTechnologies = "Your cars max speed is " + maxSpeed + ".";
		if (hasCarPlay) {
			availableTechnologies += "Your car has apple car play.";
		}
		if (hasAndroidAuto) {
			availableTechnologies += "Your car has android auto.";
		}
		return availableTechnologies;
	}

}
