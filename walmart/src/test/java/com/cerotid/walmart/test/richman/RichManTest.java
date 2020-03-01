package com.cerotid.walmart.test.richman;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.cerotid.richman.RichMan;
import com.cerotid.walmart.cars.Camaro;
import com.cerotid.walmart.cars.Cars;

public class RichManTest {

	@Test
	public void testAddCar() {
		RichMan rm = new RichMan();
		rm.addCar(new Camaro());
		Assert.assertEquals(1, rm.getMyCars().size());
	}
	
	@Test
	public void testRepaint() {
		RichMan rm = new RichMan();
		Cars c = new Camaro();
		rm.repaint(c, "Red");
		Assert.assertEquals("Red", c.getColor());
	}
	
	@Test
	public void testOilChange() throws Exception {
		RichMan rm = new RichMan();
		Cars c = new Camaro();
		rm.performService(c, 1);
		Calendar todaysDate = Calendar.getInstance();
		Calendar oilChangeDate = Calendar.getInstance();
		todaysDate.setTime(new Date());
		oilChangeDate.setTime(c.getLastOilChangeDate());
		Assert.assertEquals(todaysDate.get(Calendar.YEAR), oilChangeDate.get(Calendar.YEAR));
		Assert.assertEquals(todaysDate.get(Calendar.MONTH), oilChangeDate.get(Calendar.MONTH));
		Assert.assertEquals(todaysDate.get(Calendar.DAY_OF_YEAR), oilChangeDate.get(Calendar.DAY_OF_YEAR));
	}

	
	@Test
	public void testTireChange() throws Exception {
		RichMan rm = new RichMan();
		Cars c = new Camaro();
		rm.performService(c, 2);
		Calendar todaysDate = Calendar.getInstance();
		Calendar tireChangeDate = Calendar.getInstance();
		todaysDate.setTime(new Date());
		tireChangeDate.setTime(c.getLastTireChangeDate());
		Assert.assertEquals(todaysDate.get(Calendar.YEAR), tireChangeDate.get(Calendar.YEAR));
		Assert.assertEquals(todaysDate.get(Calendar.MONTH), tireChangeDate.get(Calendar.MONTH));
		Assert.assertEquals(todaysDate.get(Calendar.DAY_OF_YEAR), tireChangeDate.get(Calendar.DAY_OF_YEAR));
	}
}
