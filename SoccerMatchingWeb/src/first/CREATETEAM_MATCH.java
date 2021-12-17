package first;

import java.sql.*;
import java.sql.DriverManager;


public class CREATETEAM_MATCH
{
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:9999/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			StringBuffer sql = new StringBuffer();
			sql.append("create table Team_match(no_match int");
			sql.append(", location varchar(50)");
			sql.append(", m_date date");
			sql.append(", m_start_time varchar(30)");
			sql.append(", opponent varchar(30)");
			sql.append(", home varchar(30)");
			sql.append(", away varchar(30)");
			sql.append(", primary key(no_match))");	
					
			stmt.executeUpdate(sql.toString());
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}

