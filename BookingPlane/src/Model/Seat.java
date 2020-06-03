package Model;

public class Seat {
	private int seatId;
	private String seatType;
	private String airplaneName;
	private String price;
	private int ok;
	public int getOk() {
		return ok;
	}
	public void setOk(int ok) {
		this.ok = ok;
	}
	public Seat(){
		
	}
	public Seat(int seatId,String seatType,String airplaneName,String price){
		this.seatId = seatId;
		this.seatType = seatType;
		this.airplaneName = airplaneName;
		this.price = price;
		this.ok = 0;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getAirplaneName() {
		return airplaneName;
	}
	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}
}
