package com.mehul.example.contest249;

public class PercentageLetter {

	public static int percentageLetter(String s, char letter) {
		char[] stringArray = s.toCharArray();
		int stringLength = s.length();
		int letterCount = 0;
		for (int i = 0; i < stringLength; i++) {
			if (letter == stringArray[i])
				letterCount++;
		}
		return (letterCount * 100) / stringLength;
	}

	public static void main(String[] args) {
//		String s = "foobar";
//		char letter = 'o';

		String s = "jjjj";
		char letter = 'k';

		System.out.println(percentageLetter(s, letter));
	}

}
