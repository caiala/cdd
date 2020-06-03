package Test;

import java.util.Date;

import Model.Flight;
import Model.People;
import Model.Seat;
import Model.Trip;
import Service.Bookticket;
import Service.Cancelticket;
import Service.selectFlight;
import Service.selectSeat;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//People people = new People();
		//JDBDdemo a = new JDBDdemo();
		//System.out.println(a.findPeople("1300"));
		//selectFlight b = new  selectFlight();
		//selectSeat c = new selectSeat();
		//System.out.println(b.findFlight("北京","上海","2018-10-24"));
		//System.out.println(c.selectSeat(1,"BY001"));
		//People people1 = new People("111212","Jzx");
		//Flight flight1 = new Flight("D1222","北京首都国际级机场","上海虹桥机场","2018-10-23","2018-10-23 20:30","2018-10-23 22:40",1360,"123","A380");
		//Seat seat1 = new Seat(2,"high","A380","1234");
		//Bookticket d = new Bookticket();
		//System.out.println(".........");
		//System.out.println(d.Booking(people1, flight1,seat1));
		Trip trip = new Trip("111222D12221","111222","D1222",1);
		Cancelticket ticket = new Cancelticket();
		System.out.println(ticket.cancleTicket(trip));
	}

}
