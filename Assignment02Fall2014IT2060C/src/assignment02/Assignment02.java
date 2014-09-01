package assignment02;
 
/**
 * Code for Assignment 02, IT2060C Fall 2014
 * @author Nicholson.Bill
 *
 */
public class Assignment02 {
	/**
	 * Test a number for primeness using a brute-force loop
	 * @param num the number to be tested
	 * @return True if num is prime, false otherwise.
	 */
	public Boolean IsPrime(int num) {
		Boolean isPrime = true;
		int limit = (int) Math.sqrt(num);
		
		for (int i = 2; i < limit; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	/**
	 * Test a number for primeness using a list of primes, then a brute-force loop
	 * @param num the number to be tested
	 * @return True if num is prime, false otherwise.
	 */
	public Boolean IsPrimeV02(int num) {
		final int[] primeList = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157};
		Boolean isPrime = true;
		int limit = (int) Math.sqrt(num);
		int myPrime = 0;
		
		for (int i = 2; i < primeList.length; i++) {
			myPrime = primeList[i];
			if ((num % myPrime) == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			for (int i = myPrime + 2; i < limit; i++) {
				if ((num % i) == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}
