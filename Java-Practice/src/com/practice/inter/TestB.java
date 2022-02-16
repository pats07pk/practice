package com.practice.inter;

public interface TestB {
	
	void m1();
	

	public void m2();
	
	
	public int x = 0;
	
	default int getX() {
		return getNumber();
	}
	
	public static int getNumber() {
		return 42;
	}
}
