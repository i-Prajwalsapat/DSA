package DSA;

import java.util.Arrays;


import java.util.Arrays;

public class BubbleSort {

	// display sorted array 
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) {		
		}
		System.out.print(Arrays.toString(arr));
	}
	
	
	
	public static void bubbleSort(int arr[]) {
		boolean flag = false;
		for(int i = 0; i < arr.length-1;  i++) {	// loop thorough arr length -1
			for(int j = 0; j < arr.length-i-1; j++ ) {  // swap operation or traverse
				
				if(arr[j] > arr[j+1]) {	// compare adjascent elements
				
					int temp = arr[j];  // swapping if arr[j] > arr[j +1] 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {9, 7, 33, 3, 55};
		bubbleSort(arr);
		display(arr);
	}
} 







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
