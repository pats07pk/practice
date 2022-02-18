package com.practice.design.decorator.computer;

public class Desktop extends Computer {

	public Desktop() {
		computerType = "Desktop";
	}
	
	@Override
	public double cost() {
		return 0;
	}

	@Override
	public String computerParts() {
		return "";
	}
}
