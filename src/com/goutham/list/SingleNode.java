package com.goutham.list;

public class SingleNode {
	
	private Employee employee;
	private SingleNode next;
	public SingleNode(Employee employee) {
		super();
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public SingleNode getNext() {
		return next;
	}
	public void setNext(SingleNode next) {
		this.next = next;
	}
	

}
