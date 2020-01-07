package com.goutham.list;

public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Goutham", 650000);
		Employee e2 = new Employee("ABhi", 9660000);
		Employee e3 = new Employee("adi", 60000);
		Employee e4 = new Employee("nitin", 50000);
		
		SingleMain s = new SingleMain();
		s.addToFront(e1);
		s.addToFront(e2);
		s.addToFront(e3);
		s.addToFront(e4);
		s.printList();

	}

}
