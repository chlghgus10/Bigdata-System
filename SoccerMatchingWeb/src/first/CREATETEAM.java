package first;

import java.sql.*;
import java.sql.DriverManager;


public class CREATETEAM
{
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:9999/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			StringBuffer sql = new StringBuffer();
			sql.append("create table Team(team_name varchar(50)");
			sql.append(", leader varchar(20)");
			sql.append(", member_num int");
			sql.append(", team_talent varchar(30)");
			sql.append(", region varchar(30)");
			sql.append(", uniform_color varchar(30)");
			sql.append(", primary key(team_name, leader))");	
					
			stmt.executeUpdate(sql.toString());
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}

