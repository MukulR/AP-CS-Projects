package practice2017;

import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;
	
	public Digits (int num) {
		digitList = new ArrayList<Integer>();
		int i = Integer.toString(num).length() - 1;
		while(i >= 0) {
			digitList.add(i, num % 10);
			num /= 10;
			i--;
		}
	}
	
	public boolean isStrictlyIncreasing() {
		if(digitList.size() == 1) {
			return true;
		}
		for(int i = 0; i < digitList.size() - 1; i++) {
			if(digitList.get(i) >= digitList.get(i+1)) {
				return false;
			}
		}
		return true;
	}
}