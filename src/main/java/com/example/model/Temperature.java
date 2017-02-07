package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {

	private Double value;

	public Temperature(@JsonProperty("value")Double value) {
		super();
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temperature [value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

}
