package com.practice.dessign.decorator.computer;

public class Test {

	public static void main(String[] args) {
		
		Computer desktopComputer = new Desktop();
		System.out.println(desktopComputer.getComputerType() + " ==> "+ desktopComputer.cost() + " ==> "+  desktopComputer.computerParts());
		
		desktopComputer = new RAMComponent(desktopComputer);
		desktopComputer = new Motherboard(desktopComputer);
		
		System.out.println(desktopComputer.getComputerType() + " ==> "+desktopComputer.cost() + " ==> "+ desktopComputer.computerParts());
	}
}
