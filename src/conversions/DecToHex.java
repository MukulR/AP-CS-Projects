package conversions;

import java.util.ArrayList;
import java.util.Collections;

public class DecToHex {
	public static void main(String args[]) {
		toHexString(56);	
		//System.out.println(arr.length);
	}
	
	public static void toHexString(int x) {
		ArrayList<String> hex = new ArrayList<String>();
		while(x > 0) {
			if(x % 16 >= 10) {
				switch (x % 16) {
					case 10:
						hex.add("A");
						break;
					case 11:
						hex.add("B");
						break;
					case 12:
						hex.add("C");
						break;
					case 13:
						hex.add("D");
						break;
					case 14:
						hex.add("E");
						break;
					case 15:
						hex.add("F");
						break;
				}
			} else {
				hex.add(String.valueOf(x % 16));
			}
			x = x / 16;
		}
		
		Collections.reverse(hex);
		System.out.print("0x");
		for(int i = 0; i < hex.size(); i++) {
			System.out.print(hex.get(i));
		}
	}
}
