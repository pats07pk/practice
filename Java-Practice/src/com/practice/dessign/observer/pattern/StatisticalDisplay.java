package com.practice.dessign.observer.pattern;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.Queue;
import java.util.stream.Collectors;

public class StatisticalDisplay implements Observer, DisplayElement {

	Queue<WeatherModel> queue;
	Observable weatherData;

	@SuppressWarnings("deprecation")
	public StatisticalDisplay(Observable weatherData) {
		this.queue = new LinkedList<WeatherModel>();
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {

		Double temperature = queue.stream().map(element -> {
			return element.getTemperature();
		}).collect(Collectors.averagingDouble(f -> f));
		Double pressure = queue.stream().map(element -> {
			return element.getPressure();
		}).collect(Collectors.averagingDouble(f -> f));
		Double humidity = queue.stream().map(element -> {
			return element.getHumidity();
		}).collect(Collectors.averagingDouble(f -> f));
	//	System.out.println("All queue data ==> " + queue);
		System.out.println(String.format("Statistics display ==> Avg. Temp: %s, Avg.Pressure: %s, Avg. Humidity: %s",
				temperature, pressure, humidity));
	}

	@Override
	public void update(Observable o, Object arg) {

		if (o instanceof WeatherData) {
			WeatherData  weatherData = (WeatherData)o;
			if (queue.size() == 10) {
				System.out.println("Removing element...");
				queue.remove();
			}

			WeatherModel model = new WeatherModel(weatherData.getTempeature(), weatherData.getPressure(), weatherData.getHumidity());
			queue.add(model);
			display();
		}
	}
}
