package com.practice.arrays;

import java.util.Arrays;

public class FindLargestAndSmallestValueFromArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,3,6,4,7,8,9,23,45,6,2,0};
		findLargestAndSmallestValueInArray(array);
		
	}
	
	
	public static void findLargestAndSmallestValueInArray(int[] array) {
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int number: array) {
			if(number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		
		System.out.println("Integer array ==> "+ Arrays.toString(array));
		System.out.println("Smallest number ==> "+ smallest);
		System.out.println("Largest number ==> "+ largest);
		
	}
	
}
