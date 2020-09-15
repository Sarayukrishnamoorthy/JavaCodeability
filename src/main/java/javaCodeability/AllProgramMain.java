package javaCodeability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.Vector;
import javaCodeability.TowerOfHanoi.Stack;

public class AllProgramMain {

	public static void main(String[] args) {

		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Program Number 1 to 20 else to exit");
			int iProgNum =sc.nextInt(); 
			if (iProgNum >=1 && iProgNum <=20) {
				if (iProgNum == 1) {
					program01();
				} else if (iProgNum == 2) {
					program02();
				} else if (iProgNum ==3) {
					program03();
				} else if (iProgNum == 4) {
					program04(sc);
				} else if (iProgNum == 5) {
					program05(sc);
				} else if (iProgNum == 6) {
					program06(sc);
				} else if (iProgNum == 7) {
					program07();
				} else if (iProgNum == 8) {
					program08();
				} else if (iProgNum == 9) {
					program09(sc);
				} else if (iProgNum == 10) {
					program10(sc);
				} else if (iProgNum == 11) {
					program11();
				} else if (iProgNum == 12) {
					program12();
				} else if (iProgNum == 13) {
					program13();
				} else if (iProgNum == 14) {
					program14(sc);
				} else if (iProgNum == 15) {
					program15();
				} else if (iProgNum == 16) {
					program16();
				} else if (iProgNum == 17) {
					program17();
				} else if (iProgNum == 18) {
					program18();
				} else if (iProgNum == 19) {
					program19(sc);
				} else if (iProgNum == 20) {
					program20();
				}

			} else {
				sc.close();
				break;
			}
		}
	}

	public static void program01() {
		System.out.println("TreeMap implementation for students");
		System.out.println("***********************************");
		TreeMap<Integer, String> students = new TreeMap<Integer, String>();
		students.put(01, "Sarayu");
		students.put(02, "Naresh");
		students.put(03, "Devaki");
		students.put(04, "Krishna");
		students.put(05, "sisi");

		Iterator<Entry<Integer, String>> it = students.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println("students list : " + it.next());
		}
	}
	public static void program02() {
		System.out.println("First Three Rank Students using Arraylist");
		System.out.println("*****************************************");
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "sara", 400);
		Student s2 = new Student(2, "saru", 450);
		Student s3 = new Student(3, "sayu", 200);
		Student s4 = new Student(4, "sasa", 300);
		Student s5 = new Student(5, "saya", 480);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		printList(list);
		Collections.sort(list);
		System.out.println("First Rank Student  : " + list.get(0).sStudName + " "+ list.get(0).iMarks);
		System.out.println("Second Rank Student : " + list.get(1).sStudName+ " " + list.get(1).iMarks);
		System.out.println("Third Rank Student  : " + list.get(2).sStudName+ " " + list.get(2).iMarks);
		printList(list);
	}

	public static void printList(ArrayList<Student> list) {
		Iterator<Student> iterator1 = list.iterator();
		while(iterator1.hasNext()) {
			Student s = iterator1.next();
			System.out.println( s.iMarks + " " + s.sStudName);
		}
	}

	public static void program03() {
		System.out.println("Combined Vehicle Parking List and Max Duration Vehicle");
		System.out.println("******************************************************");
		ArrayList<ParkingVehicle> vehicleList1 = new ArrayList<ParkingVehicle>();
		ArrayList<ParkingVehicle> vehicleList2 = new ArrayList<ParkingVehicle>();
		ParkingVehicle v1 = new ParkingVehicle("1wda321yiu235622", "Civic", 30);
		ParkingVehicle v2 = new ParkingVehicle("4sdf565jfs456434", "Acura", 60);
		ParkingVehicle v3 = new ParkingVehicle("6jkl234szd278654", "Audi", 90);
		ParkingVehicle v4 = new ParkingVehicle("3wet124mgh368523", "LandRover", 10);
		ParkingVehicle v5 = new ParkingVehicle("9qwe123zdf932564", "Lexus", 20);
		ParkingVehicle v6 = new ParkingVehicle("7mfg798gfr048535", "Maserati", 15);
		vehicleList1.add(v1);
		vehicleList1.add(v2);
		vehicleList1.add(v3);
		vehicleList2.add(v4);
		vehicleList2.add(v5);
		vehicleList2.add(v6);
		ArrayList<ParkingVehicle> finalVehList = new ArrayList<ParkingVehicle>();
		finalVehList.addAll(vehicleList1);
		finalVehList.addAll(vehicleList2);

		System.out.println("Combined Vehicle list");
		Iterator<ParkingVehicle> iterator1 = finalVehList.iterator();
		while(iterator1.hasNext()) {
			ParkingVehicle pv = iterator1.next();
			System.out.println( pv.sVehicleModel + " " + pv.iDurationParked);
		}
		Collections.sort(finalVehList);
		System.out.println("Highest Parked Time Of Vehicle : " + finalVehList.get(0).sVehicleModel + " " + finalVehList.get(0).iDurationParked);

	}
	public static void program04(Scanner sc) {
		System.out.println("Unique and  Sorted List : HashSet");
		System.out.println("*********************************");
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		HashSet<Integer> elements = new HashSet<Integer>();
		System.out.println("Enter the elements");
		for(int i = 0; i< size; i++) {
			int input = sc.nextInt();
			boolean isAdded = elements.add(input);
			if (!isAdded) {
				System.out.println("Element " + input + " is already Exists.");
				break;
			}
		}
		System.out.println("Sorted and non-duplicate elements " + elements.toString());

	}
	public static void program05(Scanner inputCents) {
		System.out.println("Cents to Dollars, quarters, dime and penny");
		System.out.println("******************************************");
		System.out.println("Enter the cents");
		int iCents = inputCents.nextInt();
		int temp = iCents;
		if (iCents >= 100) {
			int dollars = temp / 100;
			temp %= 100;
			if (dollars > 1) {
				System.out.print(dollars + " dollars ");
			} else {
				System.out.print(dollars + " dollar ");
			}
		} else {
			System.out.print(" 0 dollar ");
		}
		if (temp >= 25) {
			int quaters = temp / 25;
			temp %= 25;
			if (temp > 0)
				System.out.print(" , ");
			else
				System.out.print(" and ");

			if (quaters > 1) {
				System.out.print(quaters + " quaters ");
			} else {
				System.out.print(quaters + " quater ");
			}
		}
		if (temp >= 10) {
			int dimes = temp / 10;
			temp %= 10;
			if (temp > 0)
				System.out.print(" , ");
			else
				System.out.print(" and ");

			if (dimes > 1)
				System.out.print(dimes + " dimes ");
			else {
				System.out.print(dimes + " dime ");
			}
		}
		if (temp >= 1) {
			System.out.print(" and ");
			int pennies = temp / 1;
			temp %= 1;
			if (pennies > 1)
				System.out.print(pennies + "  pennies ");
			else {
				System.out.print(pennies + "  penni ");
			}
		}
		System.out.println();
	}
	public static void program06(Scanner scN) {
		System.out.println("Vector:insert N Z's and delete N items");
		System.out.println("**************************************");
		System.out.println("Enter the n value");
		int n = scN.nextInt();
		Vector<String> v = new Vector<String>();
		v.add("t");
		v.add("e");
		v.add("k");
		v.add("a");
		v.add("r");
		v.add("c");
		v.add("h");
		System.out.println("initial vector " + v.toString());
		//for adding 'z' n times at 3rd position
		for (int i = 0; i < n; i++) {
			v.add(i+3, "Z");
		}
		System.out.println("After adding 'Z' s "+v.toString());
		//deleting from 6th position n elements
		for (int i = 0; i < n; i++) {
			v.remove(6);
		}
		System.out.println("Delete n charaters "+v.toString());
	}
	public static void program07(){
		System.out.println("My Own ArrayList");
		System.out.println("****************");
		try {
			MyOwnArrayList myList = new MyOwnArrayList();
			myList.add("s");
			myList.add("a");
			myList.add("r");
			myList.add("a");
			myList.add("y");
			myList.add("u");
			for (int i = 0; i < 6; i++) {
				System.out.print(myList.get(i)+" ");
			}
			myList.remove(3);
			System.out.println();
			System.out.println("After removing 3rd position: ");
			for (int i = 0; i < 5; i++) {
				System.out.print(myList.get(i)+" ");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("exception while removing...");
		}
	}
	public static void program08() {
		System.out.println("Employee List using ArrayList");
		System.out.println("*****************************");
		ArrayList<Employee> empList = new ArrayList<Employee>();
		ArrayList<Integer> empId = new ArrayList<Integer>();
		empList.add(new Employee(222, "employee2"));
		empList.add(new Employee(222, "employee3"));
		empList.add(new Employee(333, "employee4"));
		empList.add(new Employee(444, "employee5"));
		empList.add(new Employee(555, "employee6"));
		System.out.println("actual employee list");
		printEmpList(empList);
		System.out.println();
		for (int i = 0; i< empList.size(); i++) {
			Employee emp = empList.get(i);
			if (!empId.contains(emp.iEmpID) ) {
				empId.add(emp.iEmpID);
			} else {
				empList.remove(i);
			}
		}

		System.out.println("after removing duplicates");
		printEmpList(empList);
		System.out.println();
	}
	private static void printEmpList(ArrayList<Employee> eList) {
		
		Iterator<Employee> it = eList.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.iEmpID + " " + emp.sEmpName);
		}
	}
	public static void program09(Scanner scN) {
		System.out.println("Tower Of Hanoi Implementation");
		System.out.println("*****************************");
		System.out.println("Enter the n value");
		int n = scN.nextInt();
		System.out.println("nValue = "  + n);
		TowerOfHanoi toh = new TowerOfHanoi();
		Stack src, dest, aux;
		src = toh.createStack(n);
		dest = toh.createStack(n);
		aux = toh.createStack(n);

		toh.tohFunction(n, src, aux, dest);

	}
	public static void program10(Scanner scN) {
		System.out.println("My Own Stack for peek, push and pop");
		System.out.println("***********************************");
		System.out.println("Enter the size of Stack");
		int n = scN.nextInt();
		System.out.println("Stack Size = "  + n);
		MyStack stack = new MyStack(n);

		System.out.println("Enter Stack the elements");
		for(int i = 0; i< n; i++) {
			int input = scN.nextInt();
			stack.push(input);
		}
		stack.printStack();
		System.out.println("Top of the Stack " + stack.peek() + "\n-After peek stack size " + (stack.top + 1) + "\n");
		System.out.println("delete top of the Stack " + stack.pop()+ "\n-After pop stack size " + (stack.top + 1));
		stack.printStack();
	}

	public static void program11() {
		System.out.println("Singly Linked List");
		System.out.println("******************");
		SinglyLinkedList llist = new SinglyLinkedList(); 
		llist.push(1); 
		llist.push(3); 
		llist.push(9); 
		llist.push(6); 
		llist.push(2); 

		System.out.println("First list");
		llist.displayList();
		llist.remove(1);
		llist.remove(2);
		llist.remove(1);
		llist.displayList();

		System.out.println("second list with single node");

		SinglyLinkedList llist1 = new SinglyLinkedList(); 
		llist1.push(1);
		llist1.displayList();
		llist1.remove(1);
		llist1.displayList();
	}

	public static void program12() {
		System.out.println("Doubly linked list");
		System.out.println("******************");
		DoublyLinkedList deque = new DoublyLinkedList();
		deque.insertFront(5);
		deque.insertFront(8);
		deque.insertFront(2);
		deque.removeFront();
		deque.insertRear(9);
		deque.removeRear();

	}

	public static void program13() {
		System.out.println("Circular Queue for Insertion and Deletion");
		System.out.println("****************************************");
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(1);
		cq.enqueue(6);
		cq.enqueue(4);
		cq.enqueue(40);
		cq.display();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.dequeue();
		cq.display();
	}
	
	public static void program14(Scanner scN) {
		System.out.println("Stack and Queue");
		System.out.println("****************");
		System.out.println("Enter the size of Stack");
		int n = scN.nextInt();
		System.out.println("Stack Size = "  + n);
		MyStack stack = new MyStack(n);
		MyQueue queue = new MyQueue();

		System.out.println("Enter Stack the elements");
		for(int i = 0; i< n; i++) {
			int input = scN.nextInt();
			stack.push(input);
			queue.insert(input);
		}
		stack.printStack();
		System.out.println("Top of the Stack " + stack.peek() );
		System.out.println("delete top of the Stack " + stack.pop());
		stack.printStack();
		queue.printQueue();
		System.out.println("queue insert 99 ");
		queue.insert(99);
		queue.printQueue();
		System.out.println("queue delete " + queue.delete());
		System.out.println("queue delete " + queue.delete());
		queue.printQueue();
	}
	
	public static void program15() {
		System.out.println("Student list using Priority Queue");
		System.out.println("*********************************");
		 PriorityQueue<Student> pQueue = new PriorityQueue<Student>(new StudentComparator()); 
	        pQueue.add(new Student(1, "Student one", 23)); 
	        pQueue.add(new Student(2, "Student two", 45)); 
	        pQueue.add(new Student(5, "Student three", 76)); 
	        
	        printPQueue(pQueue);
	        
	        System.out.println("peek : " + pQueue.peek().iRegNo); 
	        System.out.println("poll : " + pQueue.poll().iRegNo); 
	        System.out.println("after poll queue : ");
	        printPQueue(pQueue);
	        System.out.println("peek : " + pQueue.peek().iRegNo); 
	}
	static void printPQueue(PriorityQueue<Student> pQueue) {
		Iterator<Student> it = pQueue.iterator();
		while (it.hasNext()) {
			Student stud = it.next();
			System.out.println(stud.iRegNo +" : " + stud.sStudName);
		}
	}

	public static void program16() {
		System.out.println("Three Threads and Sequence Order");
		System.out.println("********************************");
		Thread thread1 = new Thread(new MyRunnable(1), "T1") ;
		Thread thread2 = new Thread(new MyRunnable(2), "T2") ;
		Thread thread3 = new Thread(new MyRunnable(0), "T3") ;
		thread1.start();
		thread2.start();
		thread3.start();
	}

	public static void program17() {
		System.out.println("Ticket Reservation Using MultiThreading");
		System.out.println("***************************************");
		Reservation reservation = new Reservation();
		TicketReservation reserve1 = new TicketReservation(reservation, 6);
		reserve1.setName("person1");
		TicketReservation reserve2 = new TicketReservation(reservation, 3);
		reserve2.setName("person2");
		TicketReservation reserve3 = new TicketReservation(reservation, 4);
		reserve3.setName("person3");
		
		reserve1.start();
		reserve2.start();
		reserve3.start();
	}
	public static void program18() {
		System.out.println("DeadLock");
		System.out.println("********");
		  final String resource1 = "First Resource";  
		    final String resource2 = "2nd Resource";  

		    Thread t1 = new Thread() {  
		      public void run() {  
		          synchronized (resource1) {  
		           System.out.println("Thread 1: locked resource 1");  
		  
		           try { Thread.sleep(100);} catch (Exception e) {}  
		  
		           synchronized (resource2) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         }  
		      }  
		    };  
		   
		    Thread t2 = new Thread() {  
		      public void run() {  
		        synchronized (resource2) {  
		          System.out.println("Thread 2: locked resource 2");  
		  
		          try { Thread.sleep(100);} catch (Exception e) {}  
		  
		          synchronized (resource1) {  
		            System.out.println("Thread 2: locked resource 1");  
		          }  
		        }  
		      }  
		    };  
		    t1.start();  
		    t2.start();  
	}
	public static void program19(Scanner sc) {
		System.out.println("Sorting of Array using quick sort");
		System.out.println("*********************************");
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int iArray[] = new int[size];
		System.out.println("Enter the elements");
		for(int i = 0; i< size; i++) {
			iArray[i] = sc.nextInt();
		}
		QuickSort qs = new QuickSort();
		qs.quickSort(iArray, 0, size -1);
		System.out.println("After Sorting : ");
		for(int i =0; i< size; i++) {
			System.out.print(iArray[i] + " ");;
		}
		System.out.println();
		System.out.println("Quick sort is not stable algorithm because it doest not consider original positions");
	}
	public static void program20() {
		System.out.println("Buying Drinks from Store");
		System.out.println("*************************");
		DrinkStore ds = new DrinkStore("coke ", 20);
		ds.buyDrinks(15, "sarayu");
		ds.buyDrinks(10, "Naresh");
		DrinkStore ds1 = new DrinkStore("Fanta ", 5);
		ds1.buyDrinks(1, "sarayu");
		ds1.buyDrinks(3, "Naresh");
	}
	
}
