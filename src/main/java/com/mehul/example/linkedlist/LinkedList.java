package com.mehul.example.linkedlist;

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

	// add node at the front (Time complexity : O(1))
	public void push(int newData) {
		Node new_node = new Node(newData);
		new_node.next = head;
		head = new_node;
	}

//	(Time complexity : O(1))
	public void insertAfter(Node preNode, int data) {
		if (preNode == null) {
			System.out.println("Previous node must not be empty.");
		} else {
			Node newNode = new Node(data);
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
	}

	// Time complexity O(n)
	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		newNode.next = null;
		lastNode.next = newNode;
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

		lList.push(0);

		// Insert After
		lList.insertAfter(second, 10);

		// Append node at the end
		lList.append(40);

		// printLinkedList
		lList.printLinkList();

	}

}
