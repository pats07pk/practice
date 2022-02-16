package com.practice.dessign.decorator.computer;

public class RAMComponent extends ComputerComponent {

	Computer computer;
	
	public RAMComponent(Computer computer) {
		this.computer = computer;
	}
	
	@Override
	public double cost() {
		return computer.cost() + 20;
	}
	
	@Override
	public String getDescription() {
		return "Ram";
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
