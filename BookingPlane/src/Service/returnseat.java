package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBC.ConnectionDB;
import Model.Seat;

public class returnseat {
		//根据所选座位号将seat对象返回去
		public static Seat returnSeat(int seatId)throws Exception {
			ConnectionDB db = new ConnectionDB();
			Seat seat1 = null;
			String sql = "select * from seat where seatId = ? ";
			try {
	            PreparedStatement ps = db.getConnection().prepareStatement(sql);
	            ps.setInt(1,seatId); 
	         //   System.out.println(",,,,,,,,");
	            
	            ResultSet rs = ps.executeQuery();
	            
	          //  System.out.println(".........");
	            while (rs.next()) {
	            	int seatId1 = rs.getInt("seatId");
	            	String airplaneName1 = rs.getString("airplaneName");
	            //	System.out.println(".........");
	            	String seatType1 = rs.getString("seatType");
	            	String price1 = rs.getString("price");
	           
					 seat1 = new Seat(seatId1,airplaneName1,seatType1,price1);
	            }
	            rs.close();
	            ps.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            db.close();
	            
	        }
			
			return seat1;
			// TODO Auto-generated method stub

		}
}


