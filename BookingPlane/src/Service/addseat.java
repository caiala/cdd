package Service;

import java.sql.PreparedStatement;
import JDBC.ConnectionDB;


public class addseat {   //退票时将座位号变为有座（0）
	public static void updateseat (int seatId)throws Exception {
		ConnectionDB db = new ConnectionDB();
		String sql = "update seat set ok = '0' where seatId = ?";
		try {
            PreparedStatement ps = db.getConnection().prepareStatement(sql);
            ps.setInt(1,seatId);
       //     System.out.println("000000000");
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

	}

}
