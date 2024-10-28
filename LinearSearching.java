package DSA;

public class LinearSearching {
	
	public static int LinearSearching(int[] arr, int target) {    // static method for iteration of loop in array
		
		for(int i = 0; i < arr.length-1; i++) {   // traversing through array
			if(arr[i] == target) {
				return i; 				// checking ith element is eqaul or not
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr [] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};   // Initializing an Array
		int target = 6;			// setting target element in Array							

		int result = LinearSearching(arr, target);   // initializing the iteration of array
		
		if(result != -1) {   // checking for result 
			System.out.println("Element "+ target + " found at index "+result);
		}else {
			System.out.println("Element "+ target + " not found in the Array");
		}
	}

}
