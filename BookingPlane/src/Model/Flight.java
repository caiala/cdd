package Model;

public class Flight {
	private String flightId;
	private String takeoff;
	private String arrival;
	private String takeday;
	private String takeoffTime;
	private String arrivalTime;
	private double fare;
	private String airlineId;
	private String airplantName;
	public Flight(String flightId,String takeoff,String arrival,String takeday,String takeoffTime,String arrivalTime,double fare,String airlineId,String airplantName){
	this.flightId = flightId;
	this.takeoff = takeoff;
	this.arrival = arrival;
	this.takeday = takeday;
	this.takeoffTime = takeoffTime;
	this.arrivalTime = arrivalTime;
	this.fare = fare;
	this.airlineId = airlineId;
	this.airplantName = airplantName;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getTakeoff() {
		return takeoff;
	}
	public void setTakeoff(String takeoff) {
		this.takeoff = takeoff;
	}
	
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getTakeoffTime() {
		return takeoffTime;
	}
	public void setTakeoffTime(String takeoffTime) {
		this.takeoffTime = takeoffTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirplantName() {
		return airplantName;
	}
	public void setAirplantName(String airplantName) {
		this.airplantName = airplantName;
	}
	public String getTakeday() {
		return takeday;
	}
	public void setTakeday(String takeday) {
		this.takeday = takeday;
	}
}
