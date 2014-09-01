package main;

import assignment02.Assignment02;

public class Main {

	public static void main(String[] args) {
		Assignment02 assignment02 = new Assignment02();
		int test = 42;
		System.out.println(test + " : " + assignment02.IsPrime(test));

		test = 43;
		System.out.println(test + " : " + assignment02.IsPrime(test));

		test = 17;
		System.out.println(test + " : " + assignment02.IsPrime(test));

		test = 3;
		System.out.println(test + " : " + assignment02.IsPrime(test));
		
		test = 101;
		System.out.println(test + " : " + assignment02.IsPrime(test));
	}
}
