package sorting;

public class Quicksort {
	public static void main (String args[]) {
		int[] arr = {7,4,2,1,8,11,3};
		quicksort(arr, 0, arr.length - 1);
		for(int p = 0; p < arr.length; p++) {
			System.out.print(arr[p] + ", ");
		}
	}
	
	public static void quicksort(int[] arr, int lower, int upper) {
		if(lower < upper) {
			int partitionSpot = partition(arr, lower, upper);
			quicksort(arr, lower, partitionSpot-1);
			quicksort(arr, partitionSpot + 1, upper);
		}
	}
	
	public static int partition(int[] arr, int lower, int upper) {
		int pivot = arr[upper];
		int i = lower - 1;
		for(int k = lower; k < upper; k++) {
			if(arr[k] < pivot) {
				i++;
				int temp = arr[i]; 
		        arr[i] = arr[k]; 
		        arr[k] = temp;
			}
		}
		//swap arr[i+1] and the highest in the section to place pivot
		int temp = arr[i+1]; 
        arr[i+1] = arr[upper]; 
        arr[upper] = temp;
        
        return i+1; //to use for partitioning sub arrays
	}
}
