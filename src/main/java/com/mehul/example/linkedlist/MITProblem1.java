package com.mehul.example.linkedlist;

import java.util.LinkedList;

public class MITProblem1 {

	public static void reverseHalfOfLine(LinkedList<String> nameList) {
		int size = nameList.size();
		int middlePoint = size / 2;
		for (int i = size - 1; i >= middlePoint; i--) {
			String s = nameList.get(i);
			nameList.remove(i);
			nameList.addLast(s);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<>();
		nameList.add("Lilly Jones");
		nameList.add("Sally Baker");
		nameList.add("Cindy Lopez");
		nameList.add("Maisy Baker");
		nameList.add("Sammy Hardy");
		nameList.add("Daven Brow");
		System.out.println(nameList);
		reverseHalfOfLine(nameList);
		System.out.println(nameList);
	}

}
