package javaCodeability;


public class MyStack {
	int capacity;
	int[] array;
	int top;
	MyStack(int n) {
		this.capacity = n;
		this.array = new int[n];
		this.top = -1;
	}
	private boolean isFull() {
		return ((this.capacity -1) == this.top);
	}
	private boolean isEmpty() {
		return (this.top == -1);
	}
	public int pop() {
		if (!isEmpty()) {
			int topValue = this.array[this.top];
			this.top--;
			return topValue;
		}
		return 0;
	}
	
	public void push(int value) {
		if (!isFull()) {
			this.top++;
			this.array[this.top] = value;  
		}
	}
	
	public int peek() {
		if (!isEmpty()) {
			return this.array[this.top];
		}
		return 0;
	}
	
	public void printStack() {
		System.out.println();
		for (int i = this.top; i >= 0; i--) {
			System.out.println("|_"+ this.array[i] + "_|");
		}
		System.out.println();
	}
}
