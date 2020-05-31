package sorting;

public class Selectionsort {
	public static void main (String[] args) {
		int[] arr = {3,2,1,4};
		selectionsort(arr);
	}
	
	public static void selectionsort(int[] arr) {
		int min;
		int minindex;
		for(int i = 0; i < arr.length; i++) {
			min = arr[i];
			minindex = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[i];
					minindex = j;
				}
			}
			int temp = arr[i];
		    arr[i] = arr[minindex];
		    arr[minindex] = temp;
		}
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + ", ");
		}
	}
}
