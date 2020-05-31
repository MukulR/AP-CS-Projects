package sortingV3;

public class Quicksort {

	public static void main (String[] args) {
		int[] arr = {1,5,3,7,4,10};
		quicksort(0, arr.length - 1, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}
	
	public static void quicksort(int low, int high, int[] arr) {
		if (low < high) {
			int split = partition(low, high, arr);
			quicksort(low, split - 1, arr);
			quicksort(split+1, high, arr);
		}
	}
	
	public static int partition(int low, int high, int[] arr) {
		int p = arr[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if (arr[j] < p) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[ i+ 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}
}
