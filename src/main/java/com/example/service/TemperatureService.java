package com.example.service;

import com.example.model.TemperatureSummary;

public interface TemperatureService {
	
	public void updateTemperature(Double temperature);
	public TemperatureSummary getStats();

}
