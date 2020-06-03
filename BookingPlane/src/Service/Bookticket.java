package Service;

import java.sql.PreparedStatement;

import JDBC.ConnectionDB;
import Model.Flight;
import Model.People;
import Model.Seat;

public class Bookticket {
	//预定机票
	public static String Booking(People people,Flight flight,Seat seat) throws Exception {
		String peopleId = people.getPeopleId();
		String flightId = flight.getFlightId();
		int seatId = seat.getSeatId();
		String  tripId = peopleId+flightId+seatId;
		ConnectionDB db = new ConnectionDB(); 
		String sql = "insert into trip (tripId,peopleId, flightId,seatId) value(?,?,?,?)";
		try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1,tripId);
            ps.setString(2,peopleId);
            ps.setString(3,flightId);
            ps.setInt(4, seatId);        
            ps.executeUpdate();
            Updateseat.updateseat(seatId); 
            System.out.println("您的订单号为"+tripId);
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
		
		return null;
		// TODO Auto-generated method stub

	}

}
