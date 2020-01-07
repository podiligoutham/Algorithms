
package com.goutham.sort;

public class ShellSort {
	
	public static void main(String[] args) {
	
	int[] input = new int[] {5,3,1,4,2,4,9,2};
	
	for(int gap = input.length/2; gap > 0; gap/=2) {
	for(int i = gap;i < input.length;i++ ) {
		int j=i;
		int element = input[i];
		while(j>=gap && element< input[j-gap]) {
			input[j] = input[j-gap];
			j-=gap;
		}
		input[j] = element;
	}
	
	
	
	}
	
	for(int k=0;k<input.length;k++) {
		System.out.println(input[k]);
	}
	}
}
