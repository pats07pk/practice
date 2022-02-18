package com.practice.design.decorator.pattern;

public abstract class Beverage {

	String description = "Uknown beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
