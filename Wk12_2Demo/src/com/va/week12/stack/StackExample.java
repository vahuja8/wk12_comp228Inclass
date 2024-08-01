package com.va.week12.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<>();
		

		// check if stack is empty or not..
		boolean res = stk.empty();

		System.out.println("If the stack is empty returns true or not:-" + res);

// to add elements to stack.. 
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);

		System.out.println("Elements in stack as: " + stk);

		stk.add(2, 500); // update the stack element!.ie 3rd element..

		System.out.println("stack peek: " + stk.peek()); // top most element.. of stack
		System.out.println("Elements in stack as: " + stk);

		res = stk.empty();
		System.out.println("If the stack is empty:-" + res);

	}

}
