package com.practice.stack;

public class Test {

	public static void main(String[] args) {

		TwoStacksOneArray twoStacks = new TwoStacksOneArray(6);
		
		twoStacks.push1(3);
		twoStacks.push1(3);
		twoStacks.push1(3);
		twoStacks.push1(3);
		
		System.out.println(twoStacks.pop1());
	//	twoStacks.pop2();
		
		
	}

}
