package com.mehul.example.solutions;

import java.util.Arrays;

/*
 * Description : Given an integer array nums of length n and an integer target, find three integers 
 * in nums such that the sum is closest to target.Return the sum of the three integers.
 * 
 */
public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
		Integer closestSum = null;
		Arrays.sort(nums);
		int second2Idx = 1;
		int third3Idx = nums.length - 1;
		for (int first1Idx = 0; first1Idx < nums.length; first1Idx++) {

			while (second2Idx < third3Idx) {
				int sum = nums[first1Idx] + nums[second2Idx] + nums[third3Idx];
				System.out.println(
						"Sum of :" + sum + "= " + nums[first1Idx] + " , " + nums[second2Idx] + " , " + nums[third3Idx]);
				if (first1Idx == 0) {
					closestSum = sum;
				}
				if (sum < target) {
					if (second2Idx + 1 < third3Idx) {
						second2Idx++;
					} else {
						break;
					}

					if (closestSum != null) {
						int existingDiff = target - closestSum;
						int newDiff = target - sum;
						if (existingDiff > newDiff) {
							closestSum = sum;
						}
					}

				} else {
					if (closestSum != null) {
						int existingDiff = target - closestSum;
						int newDiff = target - sum;
						if (newDiff < existingDiff) {
							closestSum = sum;
						}
					}

					third3Idx--;
				}
			}
		}

		return closestSum;
	}

	public static void main(String[] args) {
		ThreeSumClosest obj = new ThreeSumClosest();
//		int[] nums = { -1, 2, 1, -4 };
//		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, 1));
//		int[] nums = { 0, 0, 0 };
//		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, 1));
//		int[] nums = { 1, 1, -1 };
//		int[] nums = { 1, 1, 1, 1 };
//		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, 4));
//		int[] nums = { 0, 2, 1, -3 };
//		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, 1));

//		int[] nums = { 1, 1, 1, 1 };
//		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, 0));

//		int[] nums = { 1, 1, -1, -1, 3 };
//		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, -1));

//		int[] nums = { -3, -2, -5, 3, -4 };
//		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, -1));

		int[] nums = { -1, 1, -1 };
		System.out.println("Closest Sum : " + obj.threeSumClosest(nums, 2));
	}
}
