package practice2020;

public class CheckDigit {
	/**
	 * Returns the check digit for num Precondition: The number of digits in num is
	 * between one and six, inclusive. num >= 0
	 */
	public static int getCheck(int num) {
		/* implementation not shown */ 
		return 1; // for sake of compilation
	}

	/**
	 * Returns true if numWithCheckDigit is valid, or false otherwise, as described
	 * in part (a) Precondition: The number of digits in numWithCheckDigit is
	 * between two and seven, inclusive. numWithCheckDigit >= 0
	 */
	public static boolean isValid(int numWithCheckDigit){
		int checkDigit = numWithCheckDigit % 10;
		if (getCheck((numWithCheckDigit - checkDigit) / 10) == checkDigit) {
			return true;
		}
		return false;
	}
	// There may be variables and methods not shown.
}

/** 
 * Part B:
 * Create a invalidCalls field: private int invalidCalls = 0;
 * Increment invalidCalls before returning false in isValid().
 * Add a method in the CheckDigit class - getInvalidCalls() -
 * that returns invalidCalls
 */