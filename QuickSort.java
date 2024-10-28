package DSA;

import java.util.*;

class Qsort{

	// method for display  o/p
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
		//	System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int arr[],int left, int right ) {
		
	if(left >= right) {   
		return;
		}
	
		// last index
		int pIndex = partition(arr,left,right);  // partition index
		quickSort(arr,left,pIndex-1);  // left part of pivot index
		quickSort(arr,pIndex+1,right); // right part of pivot index
	}
	
	public static int partition(int arr[], int left, int right) {
		
		int pivot = arr[right];  // pivot element(we took last ele as pivot ele)
		int i = left-1;  // to make the place for the smallest element
		
		for(int j = left; j < right; j++) {
			if(arr[j] <= pivot) {
				i++;
			// swap
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			}
		}
		i++;
		int temp = pivot;
		arr[right] = arr[i]; // pivot = arr[right];
		arr[i] = temp;
		return i;
	}

}

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {6, 3, 9, 8, 2, 5};
		
		Qsort.quickSort(arr,0,arr.length-1);
		Qsort.display(arr);	
	}
}
































