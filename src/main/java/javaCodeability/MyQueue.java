package javaCodeability;

import java.util.ArrayList;

public class MyQueue {
	
	ArrayList<Integer> queue = new ArrayList<Integer>();
	public int delete() {
		if (queue.size() > 0) {
			 return queue.remove(queue.size() - 1);
		}
		return -1;
	}
	
	public void insert(int value) {
		if (queue != null) {
			queue.add(value);
		}
	}
	
	public int peek() {
		if (queue.size() > 0) {
			 return queue.get(queue.size() - 1);
		}
		return -1;
	}
	
	public void printQueue() {
		System.out.println();
		for (int i = 0; i < queue.size(); i++) {
			System.out.print(queue.get(i) + " | ");
		}
		System.out.println();
	}
}
