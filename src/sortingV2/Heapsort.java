package sortingV2;

public class Heapsort {
	public static void main (String args[]) {
		int[] arr = {1, 4, 2, 6, 3, 5, 9, 7, 8, 10};
		heapsort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void heapsort(int[] arr) {
		constructMaxHeap(arr);
		for(int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[0]; 
            		arr[0] = arr[i]; 
            		arr[i] = temp;
            		heapify(arr, i ,0);
		}
	}
	
	public static void constructMaxHeap(int[]arr) {
		for(int i = arr.length - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}
	}
	
	
	public static void heapify(int[] arr, int size, int root) {
		int curLargest = root;
		int leftChild = 2 * root + 1;
		int rightChild = 2 * root + 2;
		
		if (leftChild < size && arr[leftChild] > arr[curLargest]) {
			curLargest = leftChild;
		}
		if (rightChild < size && arr[rightChild] > arr[curLargest]) {
			curLargest = rightChild;
		}
		
		if (curLargest != root) {
			int temp = arr[root]; 
            arr[root] = arr[curLargest]; 
            arr[curLargest] = temp;
			heapify(arr, size, curLargest);
		}
	}
}
