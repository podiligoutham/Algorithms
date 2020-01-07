package com.goutham.sort;

public class InsertionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[] {5,3,1,4,2};
		int lastIndex = input.length;
		for(int i = 1; i<lastIndex;i++ ) {
			int element = input[i];
			int j;
			for(j = i; j>0 && input[j-1]>element;j--) {
				input[j] = input[j-1];
			}
			input[j] = element;
		}
		
		for(int k=0;k<input.length;k++) {
			System.out.println(input[k]);
		}

	}
	

}
