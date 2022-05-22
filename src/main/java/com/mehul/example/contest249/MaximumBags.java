package com.mehul.example.contest249;

import java.util.Arrays;

public class MaximumBags {

	public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
		int FBC = 0;
		int[] vecancyArray = new int[capacity.length];
		for (int i = 0; i < capacity.length; i++) {
			vecancyArray[i] = capacity[i] - rocks[i];
		}
		Arrays.sort(vecancyArray);

		for (int j = 0; j < vecancyArray.length; j++) {
			if (additionalRocks <= 0) {
				break;
			} else {
				if (vecancyArray[j] <= additionalRocks) {
					additionalRocks = additionalRocks - vecancyArray[j];
					FBC++;
				}
			}
		}
		return FBC;
	}

	private static int[] getSortedVecancyArray(int[] capacity, int[] rocks) {
		int[] vecancyArray = new int[capacity.length];
		for (int i = 0; i < capacity.length; i++) {
			vecancyArray[i] = capacity[i] - rocks[i];
		}
		Arrays.sort(vecancyArray);
		return vecancyArray;
	}

	public static void main(String[] args) {
//		int newTotalBagWithMaxCap = maximumBags(new int[] { 10, 2, 2 }, new int[] { 2, 2, 0 }, 100);
//		System.err.println("New :" + newTotalBagWithMaxCap + " which is on its full capacity");

//		int newTotalBagWithMaxCap = maximumBags(new int[] { 2, 3, 4, 5 }, new int[] { 1, 2, 4, 4 }, 2);
//		System.err.println("New :" + newTotalBagWithMaxCap + " which is on its full capacity");

//		int newTotalBagWithMaxCap = maximumBags(new int[] { 91, 54, 63, 99, 24, 45, 78 },
//				new int[] { 35, 32, 45, 98, 6, 1, 25 }, 17);
//		System.err.println("New :" + newTotalBagWithMaxCap + " which is on its full capacity");

		int newTotalBagWithMaxCap = maximumBags(
				new int[] { 54, 18, 91, 49, 51, 45, 58, 54, 47, 91, 90, 20, 85, 20, 90, 49, 10, 84, 59, 29, 40, 9, 100,
						1, 64, 71, 30, 46, 91 },
				new int[] { 14, 13, 16, 44, 8, 20, 51, 15, 46, 76, 51, 20, 77, 13, 14, 35, 6, 34, 34, 13, 3, 8, 1, 1,
						61, 5, 2, 15, 18 },
				77);
		System.err.println("New :" + newTotalBagWithMaxCap + " which is on its full capacity");
	}
}
