package Service;

import java.sql.PreparedStatement;

import JDBC.ConnectionDB;
import Model.Trip;

public class Cancelticket {
	//退票  将机票单从Trip表里面删除
	public static boolean cancleTicket(Trip trip) throws Exception {
		String tripId1 = trip.getTripId();
		int seatId1 = trip.getSeatId();
		addseat.updateseat(seatId1);
		ConnectionDB db = new ConnectionDB(); 
		String sql = "delete from trip where tripId=?";
		try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1,tripId1);
            ps.executeUpdate();          
            System.out.println("退票成功");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }	
		return true;

	}

}
