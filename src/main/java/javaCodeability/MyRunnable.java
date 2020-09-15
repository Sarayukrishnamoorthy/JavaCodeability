package javaCodeability;

public class MyRunnable implements Runnable  {

	public int Max=10;
	static int  threadNo=1;
	int sequence;
	static Object lock=new Object();
 
	MyRunnable(int sequence)
	{
		this.sequence=sequence;
	}
 
	public void run() {
		while (threadNo < Max-1) {
			synchronized (lock) {
				while (threadNo % 3 != sequence) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + threadNo);
				threadNo++;
				lock.notifyAll();
			}
		}
	}
	
}
