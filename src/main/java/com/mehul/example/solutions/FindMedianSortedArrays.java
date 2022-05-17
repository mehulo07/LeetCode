package com.mehul.example.solutions;

import java.util.Arrays;

public class FindMedianSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0;
		int[] mergedNums = getSortedMergeArray(nums1, nums2);
		int lastUpdatedIndex = mergedNums.length;
		double d = lastUpdatedIndex % 2;
		int midIndex = lastUpdatedIndex / 2;

		if (d == 0) {
			double sum = mergedNums[midIndex - 1] + mergedNums[midIndex];
			median = sum / 2;
		} else {
			median = mergedNums[midIndex];
		}
		return median;
	}

	private int[] getSortedMergeArray(int[] nums1, int[] nums2) {
		int[] mergedNums = new int[nums1.length + nums2.length];
		int lastUpdatedIndex = 0;
		for (int i = 0; i < nums1.length; i++) {
			mergedNums[lastUpdatedIndex] = nums1[i];
			lastUpdatedIndex++;
		}
		for (int i = 0; i < nums2.length; i++) {
			mergedNums[lastUpdatedIndex] = nums2[i];
			lastUpdatedIndex++;
		}
		Arrays.sort(mergedNums);
		return mergedNums;
	}

	public static void main(String[] args) {
//		int[] nums1 = { 1, 2, 3 }, nums2 = { 4, 5, 6 };
		int[] nums1 = { 1, 2 }, nums2 = { 3, 4 };
//		int[] nums1 = { 1, 3 }, nums2 = { 2 };
		FindMedianSortedArrays obj = new FindMedianSortedArrays();
		double median = obj.findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}

}
