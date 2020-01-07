package com.goutham.stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("goutham", 23);
		Employee e2 = new Employee("abhi", 23);
		Employee e3 = new Employee("adi", 23);
		Employee e4 = new Employee("sai", 23);
		
		ArrayStack stack = new ArrayStack(10);
		stack.push(e1);
		stack.push(e2);
		stack.pop();
		stack.push(e3);
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

}
