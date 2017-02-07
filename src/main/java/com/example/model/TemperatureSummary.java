package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemperatureSummary {

	private Double min = 0.0;
	private Double max = 0.0;
	private Double avg = 0.0;
	private String startTime;
	private String endTime;

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
	
	@JsonProperty(value = "time-start")
	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@JsonProperty(value = "end-time")
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
