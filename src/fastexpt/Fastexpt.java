package fastexpt;

public class Fastexpt {
	public static void main(String args[]) {
		System.out.println(fastexpt(2, 12));
	}
	
	private static long fastexpt(int b, int n) {
		long result = 1;
		while(n > 0) {
			if(n % 2 == 0) {
				b = b * b;
				n= n / 2;
			} else {
				result = result * b;
				n = n -1;
			}
		}
		return result;
	}
}
