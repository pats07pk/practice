package com.practice.design.decorator.computer;

public class Server extends Computer {

	public Server() {
		computerType = "Server";
	}
	
	@Override
	public double cost() {
		return 0;
	}

	@Override
	public String computerParts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
