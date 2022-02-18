package com.practice.design.singleton.pattern;

public class SingletonTest {

	private static SingletonTest INSTANCE = null;

	private SingletonTest() {
	}

	public static SingletonTest getInstance() {

		if (INSTANCE == null) {
			synchronized (SingletonTest.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonTest();
				}
			}
		}

		return INSTANCE;
	}

	
}
