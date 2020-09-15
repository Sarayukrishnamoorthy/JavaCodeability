package javaCodeability;

public class ParkingVehicle implements Comparable<ParkingVehicle> {

	String sVehicleNo;
	String sVehicleModel;
	int iDurationParked;
	
	public ParkingVehicle(String no, String model, int duration) {
		this.sVehicleNo = no;
		this.sVehicleModel = model;
		this.iDurationParked = duration;
	}

	public int compareTo(ParkingVehicle o) {
		return o.iDurationParked - this.iDurationParked;
	}
	
}
