package com.practice.design.observer.pattern;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData); // Subscribe to weather data
		StatisticalDisplay statisticalDisplay = new StatisticalDisplay(weatherData);
		
		weatherData.setMeasurements(20f, 34f, 45f);
		weatherData.setMeasurements(21f, 33f, 40f);
		weatherData.setMeasurements(20f, 32f, 35f);
		weatherData.setMeasurements(19f, 31f, 33f);
		weatherData.setMeasurements(18f, 30f, 34f);
		weatherData.setMeasurements(16f, 32f, 32f);
		weatherData.setMeasurements(15f, 31f, 30f);
		weatherData.setMeasurements(18f, 30f, 34f);
		weatherData.setMeasurements(16f, 32f, 32f);
		weatherData.setMeasurements(15f, 31f, 30f);
		weatherData.setMeasurements(14f, 28f, 28f);
		
	}
}
