package com.mehul.example.solutions;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigit {

	public static List<Integer> sequentialDigits(int low, int high) {
		List<Integer> returnList = new ArrayList<>();
		int lengthOfLow = String.valueOf(low).trim().length();
		int lengthOfHigh = String.valueOf(high).trim().length();
		StringBuilder appenderBuilder = new StringBuilder();
		StringBuilder sumBuilder = new StringBuilder();

		int additionValue = 0;
		int lowInitials = 0;
		int baseValue = 0;
		int tempLow = 0;

		for (int i = 1; i < lengthOfLow; i++) {
			appenderBuilder.append(i + 1);
			sumBuilder.append(1);
		}
		sumBuilder.append(1);

		for (int k = lengthOfLow; k <= lengthOfHigh; k++) {
			if (k == lengthOfLow) {
				additionValue = Integer.valueOf(sumBuilder.toString());
				lowInitials = Integer.valueOf(appenderBuilder.toString());
				baseValue = low + lowInitials;
				tempLow = low;
			} else {
				sumBuilder.append(1);
				appenderBuilder.append(appenderBuilder.length() + 2);
				additionValue = Integer.valueOf(sumBuilder.toString());
				if (appenderBuilder.toString().length() > 9) {
					break;
				}
				lowInitials = Integer.valueOf(appenderBuilder.toString());
				tempLow = tempLow * 10;
				baseValue = tempLow + lowInitials;
			}
			if (baseValue > high) {
				break;
			} else {
				returnList.add(baseValue);
			}
			for (int j = 1; j <= (9 - k); j++) {
				int nextNumber = baseValue + additionValue;
				if (nextNumber < high) {
					returnList.add(nextNumber);
					baseValue = nextNumber;
				} else {
					break;
				}
			}
		}
		return returnList;
	}

	public static void main(String[] args) {
//		List<Integer> sequentualDigits = SequentialDigit.sequentialDigits(1000, 13000);
//		List<Integer> sequentualDigits = SequentialDigit.sequentialDigits(10, 1000000000);
		List<Integer> sequentualDigits = SequentialDigit.sequentialDigits(58, 155);
		System.out.println(sequentualDigits);
	}

}
