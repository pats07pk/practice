package com.practice.arrays;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		System.out.println(findMissingNumber1(new int[] {1,2,3,5,6,7}, 7));
		
		findMissingNumber2(new int[] { 1,2,3,5,6}, 7);
		
	}

	
	/*
	 * This is suitable to find only one missing number in 
	 */
	public static int findMissingNumber1(int[] numbers, int count) {
		
		int expectedSum = count * ((count + 1) / 2);
		int actualSum = 0;
		
		for( int i: numbers) {
			actualSum += i;
		}
		
		return expectedSum - actualSum;
	}
	
	/**
	 * This method will work for more than one number missing in the array
	 * @param numbers
	 * @param count
	 */
	public static void findMissingNumber2(int[] numbers, int count) {
		
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet();
		
		for(int number: numbers) {
			bitSet.set(number - 1);
		}
		
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", 
				Arrays.toString(numbers), count);
		
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}

		
		
		
		
	}
	
	
	
	
	
}
