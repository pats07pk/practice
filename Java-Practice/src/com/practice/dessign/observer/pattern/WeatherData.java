package com.practice.dessign.observer.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {

	private float tempeature;
	private float pressure;
	private float humidity;

	public WeatherData() {
	}

	public void setMeasurements(float temperature, float pressure, float humidity) {
		this.tempeature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	@SuppressWarnings("deprecation")
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}

	public float getTempeature() {
		return tempeature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

}
