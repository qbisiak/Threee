package com.example.model;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemperatureSummary {

	private Double min;
	private Double max;
	private Double avg;
	
	@JsonProperty(value = "time-start")
	private String startTime;
	
	@JsonProperty(value = "end-time")
	private String endTime;

	public TemperatureSummary(LocalDateTime startTime, List<Double> temperatures) {
		super();
		this.startTime = String.valueOf(startTime);
		this.endTime = String.valueOf(LocalDateTime.now());
		this.min = Collections.min(temperatures);
		this.max = Collections.max(temperatures);
		this.avg = average(temperatures);
	}

	public Double average(List<Double> temperatures) {
		return temperatures.stream().mapToDouble(val -> val).average().getAsDouble();
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TemperatureSummary [min=");
		builder.append(min);
		builder.append(", max=");
		builder.append(max);
		builder.append(", avg=");
		builder.append(avg);
		builder.append(", startTime=");
		builder.append(startTime);
		builder.append(", endTime=");
		builder.append(endTime);
		builder.append("]");
		return builder.toString();
	}

}
