package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBC.ConnectionDB;

import Model.Seat;

public class selectSeat {
	//根据航班号显示剩余座位
	public static boolean selectSeat(String airplaneName)throws Exception {
		ConnectionDB db = new ConnectionDB();
		Seat seat;
		boolean flag = false;
		String sql = "select * from seat where airplaneName = ? and ok = 0";
		try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);

            ps.setString(1,airplaneName);
            ResultSet rs = ps.executeQuery();
      

            while (rs.next()) {
            	flag = true;
            	System.out.println("请选择座位号：");
            	int seatId1 = rs.getInt("seatId");
            	String airplaneName1 = rs.getString("airplaneName");
            
            	String seatType1 = rs.getString("seatType");
            	String price1 = rs.getString("price");
            	System.out.println("座位号"+ '\t'+"座位类型"+ '\t'+"金额");
            	System.out.println(seatId1+"                    "+seatType1+'\t'+price1);

            }
            if(!flag){
            	return false;
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
		return true;
		// TODO Auto-generated method stub

	}

}
