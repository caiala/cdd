package Test;

import java.util.List;
import java.util.Scanner;

import Model.Flight;
import Model.People;
import Model.Seat;
import Model.Trip;
import Service.Bookticket;
import Service.Cancelticket;
import Service.returnTrip;
import Service.returnseat;
import Service.selectFlight;
import Service.selectSeat;

public class Demofinal {
	public static void main(String args[]) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("|*********************|");
	        System.out.println("|******1.查询  航班 ******|");
	        System.out.println("|******2.退   票*********|");
	        System.out.println("|*********************|");
			String i=scanner.next();
		
		switch (i) {
        case "1": {
            System.out.println("出发地:");
            String takeoff = scanner.next();
            System.out.println("目的地:");
            String arrival = scanner.next();
            System.out.println("登机时间(2018-01-01):");
            String takeday = scanner.next();
            List<Flight> flights = selectFlight.findFlight(takeoff, arrival, takeday);
            System.out.println("航班编号\t登机时间\t\t\t到达时间\t\t\t票价");

            for (Flight flight : flights) {
                System.out.println(flight.getFlightId() + '\t'+ flight.getTakeoffTime() + '\t'+ flight.getArrivalTime() + '\t' + flight.getFare());
            }
            if(flights.size()==0){
                System.out.println("没有可用航班");
                break;
            }
            System.out.println("是否要购票？  购票请选3   退出请选4");
            String m=scanner.next();
            if(m.equals("3")){
            	 System.out.println("请输入航班编号:");
            	 String flightId = scanner.next();
            	 for (Flight flight : flights){
            		 if(flight.getFlightId().equals(flightId)){
            			 System.out.println("请输入姓名:");
            			 String peopleId = scanner.next();
                         System.out.println("请输入身份证:");
                         String peopleName = scanner.next();
                         People people  = new People(peopleId,peopleName);
                         
                         boolean seat = selectSeat.selectSeat(flight.getFlightId());
                         if(seat == false){
                        	 System.out.println("该航班无余票");
                        	 break;
                         }
                         int seatId =scanner.nextInt();
                         Seat seat1 = returnseat.returnSeat(seatId);
                          Bookticket d = new Bookticket();
                          d.Booking(people, flight, seat1);
                          break;
            		 }
            		 break;
            	 }
            	 break;
            }
            if(m.equals("4")){
            	  break;
            }
            
            
            
            
        }
        case "2": {
            System.out.println("请输入机票订单号:");
            String tripId = scanner.next();
            Trip trip1 = returnTrip.returnSeat(tripId);
            System.out.println("5、确认退票                   6、取消");
            String d=scanner.next();
            if(d.equals("5")){
            	
            	Cancelticket.cancleTicket(trip1);
            }else{
                break;
            }
        }
		}
		}
	}
}
            