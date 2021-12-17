package first;

import java.sql.*;
import java.sql.DriverManager;


public class Createtable
{
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:9999/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			StringBuffer sql = new StringBuffer();
			sql.append("create table Mercenary(m_name varchar(20)");
			sql.append(", m_position varchar(20)");
			sql.append(", m_age int");
			sql.append(", talent varchar(30)");
			sql.append(", gender varchar(30)");
			sql.append(", constraint Mercenary_m_name_pk primary key(m_name))");
			
			
					
			stmt.executeUpdate(sql.toString());
			System.out.println("Mercenary ���̺� ���� �Ϸ�");
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}

