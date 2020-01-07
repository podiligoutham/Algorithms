package com.goutham.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[] {5,3,1,4,2};
		int lastIndex = input.length-1;
		for(int i = lastIndex; i>0;i-- ) {
			for(int j=0;j<i;j++) {
				if(input[j]>input[j+1]) {
					swap(input,j,j+1);
				}
			}
		}
		
		for(int k=0;k<input.length;k++) {
			System.out.println(input[k]);
		}

	}
	
	public static void swap(int[] arr,int i, int j) {
		if(i==j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	
	}

}
