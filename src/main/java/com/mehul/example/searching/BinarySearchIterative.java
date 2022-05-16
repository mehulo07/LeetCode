package com.mehul.example.searching;

import java.util.Arrays;

public class BinarySearchIterative {

	public int isElementPresent(int[] array, int element) {
		int index = -1;
		array = Arrays.stream(array).sorted().toArray();
		int l = 0, r = array.length - 1;
		while (l <= r) {
			int m = l + (r - l / 2);
			System.out.println("M : " + m);
			if (array[m] == element) {
				return m;
			} else if (array[m] > element) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		BinarySearchIterative bstIterative = new BinarySearchIterative();
		int[] myArray = { 43, 54, 23, 65, 78, 85, 88, 92, 10, 15, 8, 6, 2, 4, 566, 89 };
		int index = bstIterative.isElementPresent(myArray, 566);

		if (index == -1) {
			System.out.println("Element not present in the list.");
		} else {
			System.out.println("Element present at the " + index + " index.");
		}
	}

}
