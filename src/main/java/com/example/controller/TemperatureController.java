package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Temperature;
import com.example.model.TemperatureSummary;
import com.example.service.TemperatureService;

@RestController
public class TemperatureController {

	private TemperatureService temperatureService;

	@Autowired
	public TemperatureController(TemperatureService temperatureService) {
		super();
		this.temperatureService = temperatureService;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateTemperature(@RequestBody Temperature temp) {
		temperatureService.updateTemperature(temp.getValue());
		return "Value updated: " + temp.getValue();
	}

	@RequestMapping(value = "/stats", method = RequestMethod.GET)
	public TemperatureSummary getStats() {
		return temperatureService.getStats();
	}

}
