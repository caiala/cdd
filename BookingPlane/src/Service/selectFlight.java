package Service;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import JDBC.ConnectionDB;
import Model.Flight;

public class selectFlight {
	//根据出发地 目的地 出发时间 查询航班
	public static ArrayList<Flight> findFlight(String takeoff2,String arrival2,String day2) throws Exception {
		ConnectionDB db = new ConnectionDB(); 
		ArrayList<Flight> flights = new ArrayList<>();
		String sql = "select * from fight where takeoff=? and arrival = ? and takeday = ? ";
		try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1,takeoff2);
            ps.setString(2,arrival2);
            ps.setString(3,day2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	String flightId1 = rs.getString("flightId");
            	String takeoff1 = rs.getString("takeoff");
            	String arrival1 = rs.getString("arrival");
            	String takeday1 = rs.getString("takeday");
            	String takeofftime1 = rs.getString("takeofftime");
            	String arrivalTime1 = rs.getString("arrivalTime");
            	Double fare1 = rs.getDouble("fare");
            	String airlineId1 = rs.getString("airlineId");
            	String airplaneName1 = rs.getString("airplaneName");
				Flight flight = new Flight(flightId1,takeoff1,arrival1,takeday1,takeofftime1,arrivalTime1,fare1,airlineId1,airplaneName1);
				flights.add(flight);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
		return flights;
		// TODO Auto-generated method stub

	}

}
