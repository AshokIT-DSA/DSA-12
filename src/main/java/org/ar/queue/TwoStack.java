package org.ar.queue;

import java.util.Stack;

class Queue {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	int size;

	Queue(int capacity) {
		size = 0;
	}

	boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}

	}

	int size() {

		return size;

	}

	int front() {
		return s2.top();
	}

	int back() {

	}

	void push(int element) {

		s1.push(element);
		size++;
	}

	void pop() {
		if (s2.isEmpty() == false) {
			s2.pop();
			return;
		} 
		else {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s2.pop();
			size--;
			return;
		}
	}
}

public class TwoStack {
	public static void main(String[] args) {

	}

	java.util.Stack<Integer> s1 = new Stack<Integer>();
	java.util.Stack<Integer> s2 = new Stack<Integer>();

	public void enque(int x) {
		s1.push(x);

	}

	public int deqeue() throws Exception {
		if (!s2.isEmpty())
			return s2.pop();
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		if (!s2.isEmpty())
			return s2.pop();
		throw new Exception();
	}

	public int peek() throws Exception {

		if (!s2.isEmpty())
			return s2.peek();
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		if (!s2.isEmpty())
			return s2.peek();
		throw new Exception();

	}

	public int size() {
		return s1.size() + s2.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}
}
