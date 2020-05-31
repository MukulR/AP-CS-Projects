package sortingV2;

public class Selectionsort {
	
	public static void main (String args[]) {
		int[] arr = {1,4,3,7};
		selectionsort(arr);
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k] + ",");
		}
	}
	
	public static void selectionsort (int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minindex = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			int temp = arr[i];
		    arr[i] = arr[minindex];
		    arr[minindex] = temp;
		}
	}
}
