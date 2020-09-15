package javaCodeability;

public class CircularQueue {

	int size;
	int queue[];
	int rear;
	int front;
	
	public CircularQueue(int size) {
		this.size = size;
		queue = new int[size];
		this.front = -1;
		this.rear  = -1;
	}
	
	public void enqueue(int item) {
		//System.out.println("insert " +(rear+1) % size + " "+ front);
		  if((rear+1) % size != front && (rear + 1) != size)
		  {
			 rear = (rear+1)%size;
			//System.out.println(rear);
			 queue[rear] = item;
		     //System.out.println("after insert " +rear + " " + size +" "+ front);
		  } else {
			  System.out.println("queue is full");
		  }
	}
	
	public int dequeue() {
		//System.out.println("delete "  + rear + " " + size +" "+ front);
		if(rear != front) {
			front = (front +1) % size;
			int item = queue[front];
			//System.out.println("after delete "  + rear + " " + item +" "+ front);
			System.out.println("Delete item " + item);
			return item;
		} else {
			 System.out.println("queue is Empty");
			 return -1;
		}
		
	}
	public void display()
	{
		int i;
		if(front != rear)
		{
			for(i=0 ; i<= rear ; i=(i+1))
			{
				System.out.println(queue[i] + " i "+ i);
			}
		}
		else
			System.out.println("Queue is empty !");
	}
}
