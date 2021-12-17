package first;

import java.sql.*;
import java.sql.DriverManager;


public class CREATEGAME
{
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:9999/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			StringBuffer sql = new StringBuffer();
			sql.append("create table Game(no_game int");
			sql.append(", g_location varchar(50)");
			sql.append(", g_date date");
			sql.append(", g_start_time varchar(30)");
			sql.append(", player_num int");
			sql.append(", primary key(no_game))");	
					
			stmt.executeUpdate(sql.toString());
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}

