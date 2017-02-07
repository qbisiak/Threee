package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Temperature;

@Repository
 class TemperatureRepositoryImpl implements TemperatureRepository{
	
	List<Temperature> temperatures = new ArrayList<>();

	@Override
	public void add(Temperature temperature) {
		temperatures.add(temperature);
		
	}

	@Override
	public List<Temperature> getAll() {
		return temperatures;
	}

}
