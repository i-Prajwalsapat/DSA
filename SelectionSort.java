package DSA;

public class SelectionSort {
	
	// display sorted array 
		public static void display(int arr[]) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
    
	public static void selectionSort(int arr[]) {
		
		int min;
		for(int i = 0; i < arr.length-1; i++) {  // travessing Array
			
			min = i; 	// taking 0th of arr as min or setting array elements as min 
			
			for(int j = i+1; j < arr.length; j++) {  // for loop for comparison or swapping
				
				if(arr[j] < arr[min]) { // comparing with other array element
					min = j;
				}
			} 
			
			int temp = arr[min]; // performing swap
			arr[min] = arr[i];
			arr[i] = temp;
			
		}	
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 3, 2, 5, 8, 1};// array
		selectionSort(arr);
		display(arr);    // calling display method
	}
}


























