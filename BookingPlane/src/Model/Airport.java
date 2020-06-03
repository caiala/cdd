package Model;

import java.sql.Date;

public class Airport {
	private String airportNumber;
	private String airportName;
	private String city;
	private String country;
	private Date connectionTime;
	public String getAirportNumber() {
		return airportNumber;
	}
	public void setAirportNumber(String airportNumber) {
		this.airportNumber = airportNumber;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getConnectionTime() {
		return connectionTime;
	}
	public void setConnectionTime(Date connectionTime) {
		this.connectionTime = connectionTime;
	}
}

