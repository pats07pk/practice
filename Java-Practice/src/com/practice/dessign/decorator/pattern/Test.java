package com.practice.dessign.decorator.pattern;

public class Test {
	
	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();

		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		
		System.out.println(beverage.cost());
		
	}
	
}
