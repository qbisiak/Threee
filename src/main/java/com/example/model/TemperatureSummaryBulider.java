package com.example.model;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class TemperatureSummaryBulider {

	private List<Double> temperatures;
	private LocalDateTime startTime;

	public TemperatureSummaryBulider(List<Double> temperatures, LocalDateTime startTime) {
		super();
		this.temperatures = temperatures;
		this.startTime = startTime;
	}

	public TemperatureSummary build() {
		TemperatureSummary summary = new TemperatureSummary();
		summary.setStartTime(String.valueOf(this.startTime));
		summary.setEndTime(String.valueOf(LocalDateTime.now()));
		if (!temperatures.isEmpty()) {
			summary.setMin(min(temperatures));
			summary.setMax(max(temperatures));
			summary.setAvg(avg(temperatures));
		}
		return summary;
	}

	public Double min(List<Double> temperatures) {
		return Collections.min(temperatures);
	}

	public Double max(List<Double> temperatures) {
		return Collections.max(temperatures);
	}

	public Double avg(List<Double> temperatures) {
		return temperatures.stream().mapToDouble(val -> val).average().getAsDouble();
	}

}
