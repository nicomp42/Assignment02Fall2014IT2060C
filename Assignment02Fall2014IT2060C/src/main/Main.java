package main;

import assignment02.Assignment02;

public class Main {

	public static void main(String[] args) {
		int passCount = 0, failCount = 0;
		Assignment02 assignment02 = new Assignment02();
		int test;
		Boolean expectedResult = false;
		
//		**************************************************************		
//		Test #1		
		test = 42;
		expectedResult = false;
		Boolean result = assignment02.IsPrime(test);
		System.out.print("IsPrime(" + test + ") : " + result);
		if (result == expectedResult) {
			System.out.println(" Passed.");
			passCount++;
		} else {
			System.out.println(" FAILED.");
			failCount++;
		}
//		**************************************************************		
//		Test #2		

		
		
//		**************************************************************
//		Summary
		System.out.println(passCount + " tests passed. " + failCount + " tests failed.");
		if (failCount > 0) {
			System.out.println("SOME TEST FAILED");
		}
		
		test = 43;
		System.out.println(test + " : " + assignment02.IsPrime(test));

		test = 17;
		System.out.println(test + " : " + assignment02.IsPrime(test));

		test = 3;
		System.out.println(test + " : " + assignment02.IsPrime(test));
		
		test = 101;
		System.out.println(test + " : " + assignment02.IsPrime(test));	
		
		int primeCount = assignment02.LoadPrimes();
		System.out.println(primeCount + " primes read from file.");
		System.out.println("IsPrimeV03: " + test + " : " + assignment02.IsPrimeV03(test));
		test = 2;
		System.out.println("IsPrimeV03: " + test + " : " + assignment02.IsPrimeV03(test));
		test = 0;
		System.out.println("IsPrimeV03: " + test + " : " + assignment02.IsPrimeV03(test));
		test = -1;
		System.out.println("IsPrimeV03: " + test + " : " + assignment02.IsPrimeV03(test));
	
		
		
		
	}
}
