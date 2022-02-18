package com.practice.design.singleton.pattern;

public class BillPughSingleton {

	private BillPughSingleton() {}
	
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
}
