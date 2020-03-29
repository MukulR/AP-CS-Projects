package randp;

public class Randp {
	private int counter;
	private int[] nums; 

	public Randp(int n) {
		nums = new int[n];
		initNums(nums);
		counter = n;
	}

	public int size() {
		return nums.length;
	}
	
	private void initNums(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
	}

	public int nextInt() {
		if (counter == 0) {
			return 0;
			
		}
		
		
		int position = (int)(Math.random() * counter);
		counter--;
		int returnValue = nums[position];
		swap(nums, position, counter);
		return returnValue;

	}
	
	public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}


