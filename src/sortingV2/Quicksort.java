package sortingV2;

public class Quicksort {
	public static void main (String args[]) {
		int[] arr = {9,11,3,7,4,10};
		quicksort(0, arr.length - 1, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void quicksort (int lower, int upper, int[] arr) {
		if(lower < upper) {
			int split = partition(lower, upper, arr);
			quicksort(lower, split - 1, arr);
			quicksort(split + 1, upper, arr);
		}
		return;
	}
	
	public static int partition (int lower, int upper, int[] arr) {
		int p = arr[upper];
		int i = lower - 1;
		for (int j = lower; j < upper; j++) {
			if (arr[j] <= p) {
				i++;
				swap(i, j, arr);
			}
		}
		swap(i+1, upper, arr); //swap partition and highest num
		return i + 1;
	}
	
	public static void swap (int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
