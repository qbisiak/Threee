package com.example.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ThreeeApplicationTests;
import com.example.model.TemperatureSummary;

public class TemperatureServiceImplTest extends ThreeeApplicationTests {

	private static final double DELTA = 0.00001;
	
	@Autowired
	TemperatureService uut;
	
	@Test
	public void shouldReturnClearSummary() {
		
		uut.clear();
		
		TemperatureSummary summary = uut.getStats();
		
		assertEquals(0.0, summary.getAvg(), DELTA);
		assertEquals(0.0, summary.getMin(), DELTA);
		assertEquals(0.0, summary.getMax(), DELTA);
	}
	
	@Test
	public void shouldReturnCorrectSummary(){
		
		uut.clear();
		uut.updateTemperature(20.0);
		uut.updateTemperature(60.0);
		uut.updateTemperature(10.0);
		
		TemperatureSummary summary = uut.getStats();
		
		assertEquals(30.0, summary.getAvg(), DELTA);
		assertEquals(10.0, summary.getMin(), DELTA);
		assertEquals(60.0, summary.getMax(), DELTA);
	}

}
