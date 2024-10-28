package DSA;

public class InsertionSort {

	// method for display data
	public static void show(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	// method for insertion logic or travessing
	public static void selectionSort(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {  // travessing array i = 1 becoz unsorted element starts from index 1
			
			int curr = arr[i];	// assignihg value of ith index elemet to curr variable 
			int j = i - 1;      // sorted element(starting)
			while(j >= 0 && curr < arr[j]) {   // checking codn for element
				
				arr[j+1] = arr[j]; 
				j--;
			}
		arr[j+1] = curr;   // if j < 0 || curr > arr[j] then curr increment by index 1 i.e arr[j+1]
		}
	}	
	
	public static void main(String[] args) {
		
		int[] arr = { 3, 2, 5, 8, 1};
		
		selectionSort(arr);
		show(arr);
	}
}




















