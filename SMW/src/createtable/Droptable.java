package createtable;

import java.sql.*;
import java.sql.DriverManager;


public class Droptable
{
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			 String sql = "DROP TABLE Team_match ";
			 
		      stmt.executeUpdate(sql);
		      System.out.println("Table  deleted in given database...");

			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}

