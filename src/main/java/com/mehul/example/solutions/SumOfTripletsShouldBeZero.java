package com.mehul.example.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTripletsShouldBeZero {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);

		for (int First1stIDX = 0; First1stIDX + 2 < nums.length; First1stIDX++) {

			if (First1stIDX > 0 && nums[First1stIDX] == nums[First1stIDX - 1]) {
				continue;
			}

			int Second2ndIDX = First1stIDX + 1;
			int third3ndIDX = nums.length - 1;

			while (Second2ndIDX < third3ndIDX) {
				int sum = nums[First1stIDX] + nums[Second2ndIDX] + nums[third3ndIDX];
				if (sum == 0) {
					result.add(Arrays.asList(nums[First1stIDX], nums[Second2ndIDX], nums[third3ndIDX]));
				} else if (sum > 0) {
					third3ndIDX--;
				} else {
					Second2ndIDX++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		SumOfTripletsShouldBeZero obj = new SumOfTripletsShouldBeZero();
		int[] numberArray = { -1, 0, 1, 2, -1, -4 };
//		int[] numberArray = { 0, 0, 0, 0 };
//		int[] numberArray = { 0, 0, 0 };
		// int[] numberArray = { -2, 0, 1, 1, 2 };
//		int[] numberArray = { -1, 2, 3, 4, 0, 1 };
		
		System.out.println(obj.threeSum(numberArray));

	}
}
