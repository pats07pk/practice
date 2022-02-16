package com.practice.stack;

public class Solution {
	public static int peakElement(int[] arr,int n)
    {
      for(int i = 0; i < n; i++) {
          
          if(n == 1) {
              return 0;
          }
          
          if(arr[i] > arr[i+1] &&	 arr[i] > arr[i-1]) {
              return i;
          }
          
      }
      
      return 0;
    }

	
	public static void main(String[] args) {
		
		
		
	}
}
