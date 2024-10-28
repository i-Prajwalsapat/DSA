package DSA;

public class MergeSorting {
	
	public static void display(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void mergeSort(int arr[], int left, int right) {
		if(left >= right) {
			return;
		}
		
		int mid = left + (right - left)/2;	// mid
		mergeSort(arr, left, mid);			// left part
		mergeSort(arr, mid+1, right);		// right part
		merge(arr, left, mid, right);		// merge left & right part	
	}
	
	public static void merge(int arr[], int left, int mid, int right) {
		
		int temp[] = new int[right - left + 1];
		int i = left;  // iteraator for left
		int j = mid+1; // iterator for right
		int k = 0;     // integer for temp arr
		
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++; 
			}else {
				temp[k] = arr[j];
				j++; 
			}
			k++;	
		}
		// left part
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		// right part
		while(j <= right) {
			temp[k++] = arr[j++];
		}
		// copy temp to original arr
		for(k = 0, i = left; k < temp.length; k++, i++) {
			arr[i] = temp[k];
		}
	}
	
	public static void main(String[] args) {
	
		int arr[] = { 6, 3, 9, 5, 2, 8};
		mergeSort(arr,0,arr.length-1);
		display(arr);
		
	}

}
