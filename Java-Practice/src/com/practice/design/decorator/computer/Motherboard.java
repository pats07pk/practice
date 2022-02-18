package com.practice.design.decorator.computer;

public class Motherboard extends ComputerComponent{

	Computer computer;
	
	public Motherboard(Computer computer) {
		this.computer = computer;
	}
	
	@Override
	public double cost() {
		return computer.cost() + 25;
	}

	@Override
	public String getDescription() {
		return "Motherboard";
	}

	@Override
	public String computerParts() {
		return	computer.computerParts() + " "+ getDescription();
	}
	
	@Override
	public String getComputerType() {
		return computer.getComputerType();
	}
}
