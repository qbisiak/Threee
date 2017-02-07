package com.example.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
class TemperatureRepositoryImpl implements TemperatureRepository{
	
	List<Double> temperatures = Collections.synchronizedList(new ArrayList<>());

	@Override
	public void add(Double temperature) {
		temperatures.add(temperature);
	}

	@Override
	public List<Double> getAll() {
		return temperatures;
	}

	@Override
	public void clear() {
		temperatures = Collections.synchronizedList(new ArrayList<>());
	}

}
