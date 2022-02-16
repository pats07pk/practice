package com.practice.stack;

public class TwoStacksOneArray {

	private int[] arr;
	private int size;
	private int top1, top2;

	public TwoStacksOneArray(int n) {
		size = n;
		arr = new int[n];
		top1 = n / 2 + 1;
		top2 = n / 2;
	}

	public void push1(int x) {
		
		if(top1 > 0) {
			top1--;
			arr[top1] = x;
		} else {
			System.out.println("Stack1 overflow...");
			return;
		}
	}

	public void push2(int x) {
		if(top2 > 0) {
			top2--;
			arr[top2] = x;
		} else {
			System.out.println("Stack2 overflow...");
			return;
		}
	}

	public int pop1() {
		if(top1 <= size/2) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack 1 underflow..");
			System.exit(0);
		}
		return 0;
	}

	public int pop2() {
		if(top2 > size/2) {
			int x = arr[top2];
			top2--;
			return x;
		} else {
			System.out.println("Satck 2 underflow...");
			System.exit(0);
		}
		
		return 0;
	}

}
