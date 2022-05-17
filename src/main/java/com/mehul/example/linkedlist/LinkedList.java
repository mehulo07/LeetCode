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
		System.out.println("=========================");
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println("=========================");
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

	// Time Complexity O(n)
	public void delete(Node node) {
		if (node == null) {
			return;
		}

		if (head == node) {
			head = head.next;
			return;
		}

		Node nodePosition = head;
		while (nodePosition.next != node) {
			nodePosition = nodePosition.next;
		}
		nodePosition.next = node.next;
		node.next = null;
	}

	/**
	 * This method will delete node from given index
	 * 
	 * @param int index
	 */
	public void deleteNodeByIndex(int index) {
		int itrInx = 0;
		Node tempHead = head;
		if (head == null) {
			System.out.println("linkedList is empty");
			return;
		}

		if (index == 0) {
			head = head.next;
			return;
		}

		while (tempHead.next != null) {
			if ((itrInx + 1) == index) {
				tempHead.next = tempHead.next.next;
				break;
			} else {
				tempHead = tempHead.next;
				itrInx++;
			}
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

		lList.push(0);

		// Insert After
		lList.insertAfter(second, 10);

		// Append node at the end
		lList.append(40);

		// printLinkedList
		lList.printLinkList();

		// delete node
		lList.delete(third);
		// delete head node
		lList.delete(lList.head);
		lList.delete(null);

		lList.printLinkList();

		lList.deleteNodeByIndex(2);

		// printLinkedList
		lList.printLinkList();

//		lList.deleteNodeByIndex(0);
//		lList.printLinkList();
	}
}
