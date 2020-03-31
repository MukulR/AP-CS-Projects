package sorting;

public class Mergesort {
	static int callcount = 0;
	public static void main (String args[]) {
		int[] arr = {38,27,43,3,9,82,10};
		System.out.print("Array before sort: ");
		printArray(arr);
		System.out.print("-- Array length: [" + arr.length + "]");
		System.out.println("");
		System.out.print("Array after sort: ");
		mergeSort(arr, arr.length);
		printArray(arr);
		System.out.print("-- Array length: [" + arr.length + "]");
		System.out.println("");
		System.out.println("Number of recursive calls: " + callcount);
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void mergeSort(int[] arr, int arrLength) {
		if(arrLength > 1) {
			callcount++;
			int middle = arrLength / 2;
			int[] left = new int[middle]; //smaller if odd because x.5 becomes x
			int[] right = new int[arrLength - middle];
			
			for(int i = 0; i < middle; i++) {
				left[i] = arr[i];
			}
			
			for(int j = middle; j < arrLength; j++) {
				right[j - middle] = arr[j];
			}
			
			mergeSort(left, middle);
			mergeSort(right, arrLength - middle);
			merge(arr, left, right);
		} else {
			return;
		}
	}
	
	public static void merge(int[] or, int[] l, int[] r) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < l.length && j < r.length) {
			if(l[i] < r[j]) {
				or[k] = l[i];
				i++;
			} else {
				or[k] = r[j];
				j++;
			}
			k++;
		}
		
		while(i < l.length) {
			or[k] = l[i];
			k++;
			i++;
		}
		while(j < r.length) {
			or[k] = r[j];
			k++;
			j++;
		}
	}
}
