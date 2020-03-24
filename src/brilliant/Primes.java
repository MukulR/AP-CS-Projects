package brilliant;

import java.util.ArrayList;
import java.util.Collections;

public class Primes {
	
	private ArrayList<Integer> primes = new ArrayList<Integer>(); 
	
	Primes(int n){
		genPrimes(n, primes);
	}

	public void genPrimes(int n, ArrayList<Integer> list) {
		int i = 0;
		int num = 0;
		while(i < n) {
			if(Brilliant.isPrime(num)) {
				list.add(num);
				num++;
				i++;
			} else {
				num++;
			}
		}
		Collections.reverse(list);
	}

	public boolean isPrime(int n) {
		if(n > primes.get(0)) {
			expandPrimes(n);
		}
		return primes.contains(n);
	}
	
	public void expandPrimes(int n) {
		for(int i = primes.get(0); i <= n; i++) {
			if(Brilliant.isPrime(i)) {
				primes.add(0, i);
			}
		}
	}
	
	public String toString() {
		return primes.toString();	
	}
}
