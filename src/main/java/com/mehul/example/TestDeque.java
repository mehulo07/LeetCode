package com.mehul.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class TestDeque {

	public static void main(String[] args) {
		System.out.println("=========Stack=========");

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		Iterator<Integer> stackItr = stack.iterator();

		while (stackItr.hasNext()) {
			System.out.println(stackItr.next());
		}

		System.out.println("=========Deque=========");

		Deque<Integer> deque = new ArrayDeque<>();
		deque.push(1);
		deque.push(2);
		deque.push(3);
		deque.push(4);

		Iterator<Integer> dequeItr = deque.iterator();

		while (dequeItr.hasNext()) {
			System.out.println(dequeItr.next());
		}
	}

}
