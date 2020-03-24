package brilliant;

import java.util.ArrayList;

public class Brilliant {
	public static void main(String args[]) {
		Primes p = new Primes(6);
		System.out.println(p);
		p.isPrime(26);
		System.out.println(p);
		ArrayList<Integer> fiftyPrimes = new ArrayList<Integer>();
		p.genPrimes(50, fiftyPrimes);
		System.out.println(fiftyPrimes.toString());
		System.out.println(isBrilliant(121));
		genBrilliants(20);
	}
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
        	return false; 
        }
          
        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
	}
	
	public static boolean isBrilliant(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0 && isPrime(n/i) && sameDigits(i, n/i) && isPrime(i)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void genBrilliants(int n) {
		ArrayList<Integer> twentyBrilliants = new ArrayList<Integer>();
		int i = 0;
		int num = 0;
		while(i < n) {
			if(isBrilliant(num)) {
				twentyBrilliants.add(num);
				i++;
				num++;
			} else {
				num++;
			}
		}
		System.out.println(twentyBrilliants.toString());
	}
	
	private static boolean sameDigits(int i, int j) {
		if(Integer.toString(i).length() == Integer.toString(j).length()) {
			return true;
		}
		return false;
	}
}