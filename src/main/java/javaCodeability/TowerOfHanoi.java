package javaCodeability;


//-------------------------------------------------------------
//1. Calculate the total number of moves required i.e. "pow(2, n)
//   - 1" here n is number of disks.
//2. If number of disks (i.e. n) is even then interchange destination 
//   pole and auxiliary pole.
//3. for i = 1 to total number of moves:
//     if i%3 == 1:
//    legal movement of top disk between source pole and 
//        destination pole
//     if i%3 == 2:
//    legal movement top disk between source pole and 
//        auxiliary pole    
//     if i%3 == 0:
//        legal movement top disk between auxiliary pole 
//        and destination pole 
//---------------------------------------------------------------

public class TowerOfHanoi {

	class Stack{
		int capacity;
		int[] array;
		int top;
	}
	
	Stack createStack(int n) {
		Stack s = new Stack();
		s.capacity = n;
		s.array = new int[n];
		s.top = -1;
		
		return s;
	}
	private boolean isFull(Stack s) {
		return ((s.capacity -1) == s.top);
	}
	private boolean isEmpty(Stack s) {
		return (s.top == -1);
	}
	public int pop(Stack s) {
		if (!isEmpty(s)) {
			int topValue = s.array[s.top];
			s.top--;
			return topValue;
		}
		return 0;
	}
	
	public void push(Stack s,int value) {
		if (!isFull(s)) {
			s.top++;
			s.array[s.top] = value;  
		}
	}
	
	public void moveItemBetweenTwoPoles(Stack src, Stack dest, String s, String d) {
		int srcItem = pop(src);
		int destItem = pop(dest);
		//System.out.println(srcItem+","+ destItem+","+s+","+d);
		// src stack is empty
		if (srcItem == 0) {
			push(src, destItem);
			printMove(d, s, destItem);
			
			//dest stack is empty
		} else if(destItem == 0) {
			push(dest, srcItem);
			printMove(s, d, srcItem);		
			
			//dest Stack is min
		} else if (destItem < srcItem) {
			push(src, srcItem);
			push(src, destItem);
			printMove(d, s, destItem);
			
			// src stack is min
		} else  {
			push(dest, destItem);
			push(dest, srcItem);
			printMove(s, d, srcItem);
		}
	}
	private void printMove(String src, String dest, int item) {
		System.out.println(item + " Moving From " + src + " To " + dest);
	}
	
	public void tohFunction(int sizeN, Stack src, Stack aux, Stack dest) {
		int iTotalMoves;
		String srcStr = "Source";
		String destStr ="Destination";
		String auxStr = "Auxiliary";
		if (sizeN % 2 == 0) {
			String temp = auxStr;
			auxStr = destStr;
			destStr = temp;
		}
		iTotalMoves = (int)(Math.pow(2, sizeN)-1);
		
		for (int i = sizeN; i>= 1; i--) {
			push(src, i);
			System.out.println("intial push : " + i);
		}
		System.out.println("src array : "+ src.top);
		for (int i = 1; i <= iTotalMoves; i++) {
			if(i%3 == 1)
				moveItemBetweenTwoPoles(src, dest, srcStr, destStr);
			if(i%3 == 2)
				moveItemBetweenTwoPoles(src, aux, srcStr, auxStr);
			if(i%3 == 0)
				moveItemBetweenTwoPoles(aux, dest, auxStr, destStr);
		}
	}
}
