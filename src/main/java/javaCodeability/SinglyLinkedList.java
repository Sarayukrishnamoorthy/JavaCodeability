package javaCodeability;

public class SinglyLinkedList {
	class Node 
	{ 
		int iData; 
		Node next; 
		Node(int d)  { 
			iData = d; 
			next = null; 
		} 
	} 

	Node head;

	public void push(int item) 
	{ 
		Node newNode = new Node(item); 
		newNode.next = head; 
		head = newNode; 
	} 
	
	public boolean remove(int item) {
		boolean removed = false;
		//System.out.println("remove item " + item + "head = " + head.iData);
		if(head.iData==item){ 
			removed = true;
            Node tempNode = head; 
            head=head.next;
            System.out.println("Head Node deleted= "+tempNode.iData);
            return removed;
		}
		
		Node current = head; 
		Node prev = null;
		while (current != null) 
		{ 
			//System.out.println("remove while");
			if (current.iData == item) {
				System.out.println("Node with data="+current.iData+" has been deleted.");
				prev.next=current.next;
				removed = true;
				break;
				
			} else {
				if (current.next == null) {
					System.out.println("Node with data="+item+" not found.");
					break;
				}
				prev = current;
				current = current.next; 
			}
		} 
		
		return removed;
	}

	public int displayList() 
	{ 
		Node temp = head; 
		int count = 0; 
		System.out.println();
		while (temp != null) 
		{ 
			System.out.print(temp.iData +" -> ");
			temp = temp.next; 
		}
		System.out.println();
		return count; 
	} 
}
