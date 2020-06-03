package Model;

public class Trip {
	private String tripId;
	private String peopleId;
	private String airlineNo;
	private int seatId;
	public Trip(String tripId,String peopleId,String airlineNo,int seatId){
		this.tripId = tripId;
		this.peopleId = peopleId;
		this.airlineNo = airlineNo;
		this.seatId = seatId;
		
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getPeopleId() {
		return peopleId;
	}
	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}
	public String getAirlineNo() {
		return airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		this.airlineNo = airlineNo;
	}
}
