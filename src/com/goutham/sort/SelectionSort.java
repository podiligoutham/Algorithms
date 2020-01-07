package com.goutham.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[] {5,3,1,4,2};
		int lastIndex = input.length-1;
		for(int i = 0; i<lastIndex;i++ ) {
			for(int j=i+1;j<=lastIndex;j++) {
				if(input[j]<input[i]) {
					swap(input,i,j);
				}
				
			}
			for(int k=0;k<input.length;k++) {
				System.out.println(input[k]);
				
			}
			System.out.println("------------------");
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
