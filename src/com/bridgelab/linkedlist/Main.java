package com.bridgelab.linkedlist;

public class Main
{
	public static void main(String[] args)
	{
		SinglyLinkedList linkedlistAtStartObject = new SinglyLinkedList();
		//Creating linkedlist node and passing int type data in it.
		System.out.println("Adding new node at start position :"+"\n");
		linkedlistAtStartObject.addNode(56);
		linkedlistAtStartObject.addNode(30);
		linkedlistAtStartObject.addNode(70);
		//printing linkedList.
		linkedlistAtStartObject.printNode();
	}
}