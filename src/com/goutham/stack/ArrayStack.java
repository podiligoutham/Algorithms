package com.goutham.stack;

public class ArrayStack {
	
	private Employee[] stack;
	private int top;
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee employee) {
		if(top == stack.length) {
			Employee[] temp = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
		}
		stack[top++] = employee;
	}
	
	public Employee pop() {
		Employee emp = null;
		if(top == 0) {
			System.out.println("emptyyyyy");
		}
		else {
			emp = stack[top];
			stack[--top] = null;
		}
		return emp;
	}
	
	public Employee peek() {
		Employee  emp = stack[top];
		return emp;
	}
	
	public void printStack() {
		System.out.println(top);
		for(int i=0;i<top; i++) {
			System.out.println(stack[i].getName());
		}
		
	}

}
