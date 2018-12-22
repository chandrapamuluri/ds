package com.ds.general;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 251;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number:");
		int n = s.nextInt();
		boolean isPrime = isPrimeNumber(n);
	}
	public static boolean isPrimeNumber(int n) {
		boolean prime = true;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				prime = false; break;
			}
		}
		if(n==1)
			System.out.println("1 is neither prime nor a composite number.");
		if(prime)
			System.out.println("Given number="+n+" is prime.");
		else
			System.out.println("Given number="+n+" is NOT prime.");
		return prime;
	}

}
