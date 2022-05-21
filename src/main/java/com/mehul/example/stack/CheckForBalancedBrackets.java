package com.mehul.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckForBalancedBrackets {

	public static boolean checkForBalancedBrackets(String expr) {
		char[] charArray = expr.toCharArray();

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char givenChar = charArray[i];

			if (givenChar == '[' || givenChar == '{' || givenChar == '(') {
				stack.push(givenChar);
				continue;
			}

			char check;
			if (stack.isEmpty())
				return false;

			switch (givenChar) {

			case ')':
				check = stack.pop();
				if (check == '{' || check == '[') {
					return false;
				}
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[') {
					return false;
				}
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{') {
					return false;
				}
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		String exp = "[()]{}{[()()]()}";
//		String exp = "[(])";
		if (checkForBalancedBrackets(exp)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

}
