package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	@ResponseStatus(value = HttpStatus.OK)
	public void updateTemperature(@RequestBody Temperature temp) {
		temperatureService.updateTemperature(temp.getValue());
	}

	@RequestMapping(value = "/stats", method = RequestMethod.GET)
	public ResponseEntity<TemperatureSummary> getStats() {
		TemperatureSummary summary = temperatureService.getStats();
		return new ResponseEntity<TemperatureSummary>(summary, HttpStatus.CREATED);
	}

}
