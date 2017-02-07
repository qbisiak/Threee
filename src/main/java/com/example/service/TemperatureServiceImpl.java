package com.example.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.TemperatureSummary;

@Service
public class TemperatureServiceImpl implements TemperatureService {
	
	List<Double> temperatures = new ArrayList<>();
	LocalDateTime startTime = LocalDateTime.now();

	@Override
	public void updateTemperature(Double temperature) {
		temperatures.add(temperature);
	}

	@Override
	public TemperatureSummary getStats() {
		return new TemperatureSummary(startTime, temperatures);
	}

}
