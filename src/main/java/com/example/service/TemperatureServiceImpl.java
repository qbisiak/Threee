package com.example.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TemperatureRepository;
import com.example.model.TemperatureSummary;
import com.example.model.TemperatureSummaryBulider;

@Service
public class TemperatureServiceImpl implements TemperatureService {

	private LocalDateTime startTime;
	private TemperatureRepository temperatureRepository;

	@Autowired
	public TemperatureServiceImpl(TemperatureRepository temperatureRepository) {
		super();
		this.startTime = LocalDateTime.now();
		this.temperatureRepository = temperatureRepository;
	}

	@Override
	public void updateTemperature(Double temperature) {
		temperatureRepository.add(temperature);
	}

	@Override
	public TemperatureSummary getStats() {
		List<Double> temperatures = temperatureRepository.getAll();
		return new TemperatureSummaryBulider(temperatures, this.startTime).build();
	}

	@Override
	public void clear() {
		temperatureRepository.clear();
	}

}
