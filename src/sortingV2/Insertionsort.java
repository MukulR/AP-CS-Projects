package sortingV2;

public class Insertionsort {
	
	public static void main (String args[]) {
		int[] arr = {1,4,3,2};
		insertionSort(arr);
 		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	
	
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int num = arr[i];
			int j = i - 1;
			if(arr[i] < arr[i - 1]) {
				while(num < arr[j] && j >= 0) {
					arr[j + 1] = arr[j];
					j--;
				}
				arr[j + 1 ] = num;
			}
		}
	}
}
