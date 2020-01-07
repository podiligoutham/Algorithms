
package com.goutham.list;

public class SingleMain {
	
	public SingleNode head;
	
	public void addToFront(Employee emp) {
		SingleNode node = new SingleNode(emp);
		node.setNext(head);
		head = node;
	}
	
	public void printList() {
		SingleNode current = head;
		while(current!= null) {
			System.out.println(current);
			current = current.getNext();
		}
	}

}
