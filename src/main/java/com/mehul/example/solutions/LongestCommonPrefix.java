package com.mehul.example.solutions;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder returnVal = new StringBuilder();
		String baseString = strs[0];

		if (strs.length == 1) {
			returnVal.append(baseString);
		} else {
			// loop for baseString char
			for (int j = 0; j < baseString.length(); j++) {
				boolean isFound = false;
				char singleCharFromString = baseString.charAt(j);

				// loop for Strings of array
				for (int i = 1; i < strs.length; i++) {
					String arrayString = strs[i];
					if (arrayString.length() > j) {
						if (!(arrayString.charAt(j) == singleCharFromString)) {
							isFound = false;
							break;
						} else {
							isFound = true;
						}
					} else {
						isFound = false;
						break;
					}
				}

				if (isFound) {
					returnVal.append(singleCharFromString);
				} else {
					break;
				}
			}
		}
		return returnVal.toString();

	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
//		String[] strs = { "a" };
//		String[] strs = { "dog", "racecar", "car" };
//		String[] strs = { "ab", "a" };
		String longestPrefixIs = LongestCommonPrefix.longestCommonPrefix(strs);
		System.out.println("Result : " + longestPrefixIs);

	}
}
