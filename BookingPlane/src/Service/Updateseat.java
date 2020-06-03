package Service;

import java.sql.PreparedStatement;
import JDBC.ConnectionDB;

public class Updateseat {
	//选购机票时在seat表里将标识符改为1（被买状态）
	public static void updateseat (int seatId)throws Exception {
		ConnectionDB db = new ConnectionDB();
		String sql = "update seat set ok = '1' where seatId = ?";
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
		// TODO Auto-generated method stub

	}

}
