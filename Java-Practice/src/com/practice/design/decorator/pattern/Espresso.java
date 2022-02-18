package com.practice.design.decorator.pattern;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso coffee";
	}
	
	@Override
	public double cost() {
		return 1.99D;
	}

}
