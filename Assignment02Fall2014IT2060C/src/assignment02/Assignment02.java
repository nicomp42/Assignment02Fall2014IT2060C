package assignment02;


public class Assignment02 {
	/**
	 * Test a number for primeness
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
}
