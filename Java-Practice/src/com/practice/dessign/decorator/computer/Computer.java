package com.practice.dessign.decorator.computer;

public abstract class Computer {

	String computerType = "";
	
	public String getComputerType() {
		return computerType;
	}
	
	public abstract double cost();
	
	public abstract String computerParts(); 
	
}
