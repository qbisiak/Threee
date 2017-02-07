package com.example.dao;

import java.util.List;

public interface TemperatureRepository {
	
	public void add(Double temp);
	public List<Double> getAll();
	public void clear();
}
