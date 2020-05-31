package sortingV2;

public class Bubblesort {
	
	public static void main (String args[]) {
		int[] arr = {1,4,3,7};
		bubblesort(arr);
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k] + ",");
		}
	}
	
	public static void bubblesort(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
