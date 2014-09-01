package assignment02;

import java.io.BufferedReader;
import java.io.FileReader;
 
/**
 * Code for Assignment 02, IT2060C Fall 2014
 * @author Nicholson.Bill
 * http://www.cs.arizona.edu/icon/oddsends/primes.htm
 *
 */
public class Assignment02 {
	private int[] listOfPrimes;
	
	public int LoadPrimes() {
		int count = 0;
		int idx = 0;
		FileReader fr = null;
		try {
			fr = new FileReader("first50KPrimes.txt");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String buff = br.readLine();
				String[] listOfPrimeStrings = buff.split(" ");
				for (int i = 0; i < listOfPrimeStrings.length; i++) {
					int num = Integer.valueOf(listOfPrimeStrings[i]);
					if (num > 0) {listOfPrimes[idx] = num; idx++; count++;}
				}
			}
		} catch (Exception ex) {
		} finally {try {fr.close();} catch(Exception ex){}}
		
		return count;
	}
	
	/**
	 * Test a number for primeness using a brute-force loop
	 * @param num the number to be tested
	 * @return True if num is prime, false otherwise.
	 */
	public Boolean IsPrime(int num) {
		Boolean isPrime = true;
		int limit = (int) Math.sqrt(num);
		
		if ((num % 2) == 0) {
			isPrime = false;
		} else {
			for (int i = 3; i < limit; i += 2) {
				if ((num % i) == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	/**
	 * Test a number for primeness using a list of the first few primes, then a brute-force loop
	 * @param num the number to be tested
	 * @return True if num is prime, false otherwise.
	 */
	public Boolean IsPrimeV02(int num) {
		final int[] primeList = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157};
		Boolean isPrime = true;
		int myPrime = 0;

		for (int i = 2; i < primeList.length; i++) {
			myPrime = primeList[i];
			if ((num % myPrime) == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			int limit = (int) Math.sqrt(num);
			for (int i = myPrime + 2; i < limit; i += 2) {
				if ((num % i) == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	/**
	 * Test a number for primeness using a flat file list of the first 50K primes, then a brute-force loop
	 * @param num the number to be tested
	 * @return True if num is prime, false otherwise.
	 */
	public Boolean IsPrimeV03(int num) {
		Boolean isPrime = true;
		int numOfPrimes = LoadPrimes();
		for (int i = 0; i < numOfPrimes; i++) {
			int divisor = listOfPrimes[i];
			if ((num % divisor) == 0) {isPrime = false; break;}
		}
		if (isPrime == false) {
			int limit = (int) Math.sqrt(num);
			for (int i = listOfPrimes[listOfPrimes.length-1] + 2; i < limit; i+= 2) {
				if ((num % i) == 0) {
					isPrime = false;
					break;
				}
			}
		}

		return isPrime;
	}
}
