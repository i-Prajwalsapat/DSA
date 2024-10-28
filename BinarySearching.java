package DSA;

import java.util.Arrays;


public class BinarySearching {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {

        int left = 0;               // Start point of an array
        int right = arr.length - 1; // End point of an array

        // Calculating mid
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Formula for calculating mid

            // Checking if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater than mid, search the right half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller than mid, search the left half
            else {
                right = mid - 1;
            }
        }
        return -1;  // Return -1 if target is not found
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80}; // Sorted array
        int target = 30;  // Target value to search for

        int result = binarySearch(arr, target);

        // result of binary search
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

