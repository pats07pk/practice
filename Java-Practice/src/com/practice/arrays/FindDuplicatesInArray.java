package com.practice.arrays;

import java.util.Arrays;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1}
            };

        for(int[] ar: test) {
        //	System.out.println(Arrays.toString(ar));
        	System.out.println(Arrays.toString(removeDuplicates(ar)));
        }
		
	}
	
	
	public static int[] removeDuplicates(int[] ar) {
		
		
		Arrays.sort(ar);
		int[] result = new int[ar.length];
		int previous = ar[0];
		
		result[0] = previous;
		
		for(int i = 1; i < ar.length; i++) {
			int ch = ar[i];
			
			if(previous != ch) {
				result[i] = ch;
			}
			
			previous = ch;
			
		}
		
		
		return result;
		
	}
}
