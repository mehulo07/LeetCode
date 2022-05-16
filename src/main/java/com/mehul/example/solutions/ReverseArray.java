package com.mehul.example.solutions;

public class ReverseArray {

	public static int[] reverseArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int last = arr[arr.length - i - 1];
			int initial = arr[i];
			arr[i] = last;
			arr[arr.length - i - 1] = initial;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] intArray = { 10, 20, 30, 40, 50 };
		ReverseArray.reverseArray(intArray);
	}
}

//Note time complexity = O(N) (as we are considering worst complexity)