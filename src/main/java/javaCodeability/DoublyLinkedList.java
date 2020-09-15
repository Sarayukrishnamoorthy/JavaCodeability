package javaCodeability;

public class DoublyLinkedList {
	class Node{    
		Node prev;
		Node next;
		int value;
	}
	private Node front;
	private Node rear;

	public void insertFront(int item){
		System.out.println("Adding element at front: "+item);
		Node node = new Node();
		node.value= item;
		node.next = front;
		if(front != null) 
			front.prev = node;
		if(front == null) 
			rear = node;
		front = node;
	}

	public void insertRear(int item){
		System.out.println("Adding element at rear: "+item);
		Node node = new Node();
		node.value = item;
		node.prev = rear;
		if(rear != null) 
			rear.next = node;
		if(rear == null)
			front = node;

		rear = node;
	}

	public void removeFront(){
		if(front == null){
			System.out.println("Empty");

		} else {
			Node tmpFront = front.next;
			if(tmpFront != null) tmpFront.prev = null;
			if(tmpFront == null) rear = null;
			System.out.println("Remove element from front: "+front.value);
			front = tmpFront;
		}
	}

	public void removeRear(){
		if(rear == null){
			System.out.println("Empty");

		} else {
			Node tmpRear = rear.prev;
			if(tmpRear != null) tmpRear.next = null;
			if(tmpRear == null) front = null;
			System.out.println("Removed element from rear: "+rear.value);
			rear = tmpRear;
		}
	}

}
