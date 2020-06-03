package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBC.ConnectionDB;
import Model.People;

public class JDBDdemo {

	public static People findPeople(String peopleid) throws Exception {
		ConnectionDB db = new ConnectionDB();
	//	PreparedStatement ps = null;
	//	Connection a=db.getConnection();
		String sql = "select * from people where peopleId=? ";
		try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, peopleid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	String peopleName1 = rs.getString("peopleName");
            	String seatId1 = rs.getString("seatId");
                System.out.println(peopleName1+seatId1);
            }
            rs.close();
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
