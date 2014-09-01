package assignment02;

public class Assignment02 {
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
