package com.practice.design.observer.pattern;

import java.util.Observable;

public class CurrentConditionDisplay implements java.util.Observer, DisplayElement {

	private float temperature, humidity, pressure;
	private Observable weatherData;

	public CurrentConditionDisplay(Observable obs) {
		this.weatherData = obs;
		weatherData.addObserver(this);
	}

	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return String.format("Current Condition Display [temperature=%s, humidity=%s, pressure=%s]", temperature,
				humidity, pressure);
	}

	@Override
	public void update(Observable o, Object arg) {

		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData)o;
			this.temperature = data.getTempeature();
			this.humidity = data.getHumidity();
			this.pressure = data.getPressure();
			display();
		}
	}

}
