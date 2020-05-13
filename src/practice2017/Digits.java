package practice2017;

import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;
	
	public Digits (int num) {
		digitList = new ArrayList<Integer>();
		if(num == 0) {
			digitList.add(0);
		} else {
			while(num > 0) {
				digitList.add(0, num % 10);
				num /= 10;
			}
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
	
	public static void main(String args[]) {
		Digits dg = new Digits(65310);
		System.out.println(dg.isStrictlyIncreasing());
	}
}