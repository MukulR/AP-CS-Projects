package conversions;

import java.util.ArrayList;
import java.util.Collections;

public class DecToBin {
	public static void main (String args[]) {
		System.out.println(toBinaryString(11));
	}
	
	public static String toBinaryString(int x) {
		ArrayList<Integer> bin = new ArrayList<Integer>();
		while(x > 0) {
			bin.add(x % 2);
			x = x / 2;
		}
		Collections.reverse(bin);
		return bin.toString();
	}
}
