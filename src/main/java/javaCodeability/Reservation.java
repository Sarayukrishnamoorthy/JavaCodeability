package javaCodeability;

public class Reservation {
		 int iMaxSeats = 10;
		synchronized void reserveSeat(int iRequestedSeats) {
			 System.out.println(Thread.currentThread().getName() + " entered.");
		        System.out.println("Availableseats : " + iMaxSeats + " Requestedsetas : " + iRequestedSeats);
		        if (iMaxSeats >= iRequestedSeats)
		        {
		            System.out.println("Seat Available. Reserve now");
		            try
		            {
		                Thread.sleep(100); 
		            }
		            catch (InterruptedException e)
		            {
		                System.out.println("Thread interrupted");
		            }
		            System.out.println(iRequestedSeats + " seats reserved.");
		            iMaxSeats = iMaxSeats - iRequestedSeats;
		        }
		        else
		        {
		            System.out.println("Requested seats not available");
		        }
		        System.out.println(Thread.currentThread().getName() + " leaving.");
		        System.out.println();
		}

}
