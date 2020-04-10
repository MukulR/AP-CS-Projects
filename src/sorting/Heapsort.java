package sorting;

public class Heapsort {
	public static void main (String args[]) {
		int[] arr = {3,2,1,4, 7};
		heapsort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void heapsort(int[] arr) {
		buildMaxHeap(arr);
		for(int i = arr.length - 1; i > 0; i--) {
			//move largest to end of the array
			int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp;
            //find the next largest with the reduced array and puts at 0 index
            heapify(arr, i, 0);
		}
	}
	
	public static void buildMaxHeap(int[] arr) {
		for(int i = arr.length - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}
	}
	
	public static void heapify(int[] arr, int arrlen, int rootIndex) {
		int curLargestIndex = rootIndex;
		int leftIndex = 1 + rootIndex * 2;
		int rightIndex = 2 + rootIndex * 2;
		
		if(leftIndex < arrlen && arr[leftIndex] > arr[curLargestIndex]) {
			// ^ make sure indexing does not throw index out of bounds
			curLargestIndex = leftIndex;
		}
		
		if(rightIndex < arrlen && arr[rightIndex] > arr[curLargestIndex]) {
			// ^ make sure indexing does not throw index out of bounds
			curLargestIndex = rightIndex;
		}
		
		//prevent infinite recursions
		if(curLargestIndex == rootIndex) {
			return;
		}
		//if the root and largest aren't the same then we can swap and heapify again
		int temp = arr[rootIndex]; 
        arr[rootIndex] = arr[curLargestIndex]; 
        arr[curLargestIndex] = temp; 
    
        heapify(arr, arrlen, curLargestIndex);
        // ^ Reorder the reduced heap such that it is a max heap
	}
}
