package com.mehul.example.recursive;

public class SumOfN {

	public int function(int n) {
		System.out.println("N : " + n);
		if (n == 1) {
			return 1;
		}
		return function(n - 1) + function(n - 1);
	}

	public static void main(String[] args) {
		SumOfN obj = new SumOfN();

		System.out.println("Sum : " + obj.function(4));
	}
	
}
