package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBC.ConnectionDB;
import Model.Trip;

public class returnTrip {
	//根据机票订单号返回客户信息核对
	public static Trip returnSeat(String tripId)throws Exception {
		ConnectionDB db = new ConnectionDB();
		Trip trip1 = null;
		String sql = "select * from trip where tripId = ? ";
		try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1,tripId); 
         //   System.out.println(",,,,,,,,");
            
            ResultSet rs = ps.executeQuery();
            
          //  System.out.println(".........");
            while (rs.next()) {
            	String tripId1 = rs.getString("tripId");
            	String peopleId1 = rs.getString("peopleId");
            //	System.out.println(".........");
            	String flightId1 = rs.getString("flightId");
            	int SeatId1 = rs.getInt("seatId");
            	System.out.println();
            	System.out.println("机票号"+ '\t'+ '\t'+"客户Id号"+ '\t'+"航班号"+ '\t'+"座位号");
            //	System.out.println(seatId1+"  "+seatType1+'\t'+price1);
				System.out.println(tripId1+'\t'+peopleId1+'\t'+flightId1+'\t'+SeatId1);
				 trip1 = new Trip(tripId1,peopleId1,flightId1,SeatId1);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
            
        }
		
		return trip1;
		

	}
}
