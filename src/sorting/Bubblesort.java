package sorting;

public class Bubblesort {
	public static void main (String[] args) {
		int[] arr = {1, 4, 8 ,3, 4, 10, 4, 23};
		bubblesort(arr);
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
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + ", ");
		}
	}
}
