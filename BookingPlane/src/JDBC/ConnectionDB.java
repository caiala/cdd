package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	private static final String DBdriver="com.mysql.jdbc.Driver";
	private static final String DBurl="jdbc:mysql://localhost:3306/airsystem";
	private static final String DBuser="root";
	private static final String DBpassword="";
	private Connection conn=null;
	public ConnectionDB() throws Exception{
		Class.forName(DBdriver);
		this.conn = DriverManager.getConnection(DBurl, DBuser, DBpassword);
	}
	public 	Connection getConnection(){
		return this.conn;
	}
	public void close() throws Exception{
		if(this.conn !=null){
			try{
				this.conn.close();
			}catch(Exception e){
				throw e;
			}
		}
	}
}
