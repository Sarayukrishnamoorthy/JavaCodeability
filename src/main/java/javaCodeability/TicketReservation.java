package javaCodeability;

public class TicketReservation extends Thread {

	
	int iRequestedSeats ;
	Reservation reserve;
	
	 public TicketReservation(Reservation reserve, int iRequestedSeats)
	    {
		 this.reserve  = reserve;
	     this.iRequestedSeats = iRequestedSeats;
	    }
	 
	 @Override
	public void run() {
			reserve.reserveSeat(iRequestedSeats);
		}
	
	
	
	
		
}
