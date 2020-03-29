package sorting;

public class Insertionsort {
	public static void main (String args[]) {
		int[] arr = {3, 4, 8 ,3, 4, 10, 4, 23};
		insertionSort(arr);
	}
	
	public static void insertionSort(int[] arr) {
		int temp = 0;
		for(int i = 1; i < arr.length; i++) {
			int elem = arr[i];
			int j = i - 1;
			if(arr[i] < arr[i-1]) {
				while(elem < arr[j] && j >= 0) {
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1]=elem;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
}
