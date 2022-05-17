package com.mehul.example;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
		}
	}

	public void printLinkList() {
		Node n = head;

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();

		// Created head
		lList.head = new Node(1);

		// created subsequentNode
		Node second = new Node(2);

		// set next node address to pointer
		lList.head.next = second;
		Node third = new Node(3);
		second.next = third;

		// printLinkedList
		lList.printLinkList();

	}

}
