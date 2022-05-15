package com.mehul.example.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RomenToNumberConvertor {

	private static final HashMap<Character, Integer> romenNumberMapper = new HashMap<>();
	private static final List<Character> supportiveCharList = Arrays.asList('I', 'X', 'C');

	static {
		romenNumberMapper.put('I', 1);
		romenNumberMapper.put('V', 5);
		romenNumberMapper.put('X', 10);
		romenNumberMapper.put('L', 50);
		romenNumberMapper.put('C', 100);
		romenNumberMapper.put('D', 500);
		romenNumberMapper.put('M', 1000);

	}

	public static int romanToInt(String s) {
		int returnNumber = 0;
		char[] romanCharArray = s.toCharArray();
		int i = 0;
		while (i < romanCharArray.length) {
			Character romanChar = romanCharArray[i];
			Integer charValue = romenNumberMapper.get(romanChar);

			if (charValue != null) {
				if (supportiveCharList.contains(romanChar)) {
					Character nextRomanChar = 'Z';

					if (i < romanCharArray.length - 1) {
						int j = i + 1;
						nextRomanChar = romanCharArray[j];
					}

					if (romanChar.equals('I')) {
						if (nextRomanChar.equals('V')) {
							returnNumber = returnNumber + 4;
							i = i + 2;
						} else if (nextRomanChar.equals('X')) {
							returnNumber = returnNumber + 9;
							i = i + 2;
						} else {
							returnNumber = returnNumber + charValue;
							i++;
						}
					} else if (romanChar.equals('X')) {
						if (nextRomanChar.equals('L')) {
							returnNumber = returnNumber + 40;
							i = i + 2;
						} else if (nextRomanChar.equals('C')) {
							returnNumber = returnNumber + 90;
							i = i + 2;
						} else {
							returnNumber = returnNumber + charValue;
							i++;
						}
					} else if (romanChar.equals('C')) {
						if (nextRomanChar.equals('D')) {
							returnNumber = returnNumber + 400;
							i = i + 2;
						} else if (nextRomanChar.equals('M')) {
							returnNumber = returnNumber + 900;
							i = i + 2;
						} else {
							returnNumber = returnNumber + charValue;
							i++;
						}
					}
				} else {
					returnNumber = returnNumber + charValue;
					i++;
				}
			}
		}

		return returnNumber;
	}

	public static void main(String[] args) {

		int output1 = RomenToNumberConvertor.romanToInt("III");
		int output2 = RomenToNumberConvertor.romanToInt("LVIII");
		int output3 = RomenToNumberConvertor.romanToInt("MCMXCIV");

		System.out.println("Output1  :" + output1);
		System.out.println("Output2  :" + output2);
		System.out.println("Output3  :" + output3);
	}
}
