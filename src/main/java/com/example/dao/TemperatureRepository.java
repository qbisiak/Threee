package com.example.dao;

import java.util.List;

import com.example.model.Temperature;

public interface TemperatureRepository {
	
	public void add(Temperature temp);
	public List<Temperature> getAll();
}
