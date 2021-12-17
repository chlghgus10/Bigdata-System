package insertdata;

import java.sql.*;

public class Matching {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('����Ǯ',1)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('����Ǯ',2)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('�ǽ�Ƽ',2)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('����Ʈ��',3)";
			stmt.executeUpdate(sql);

 			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('����Ǯ',4)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('����Ǯ',5)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('�ǽ�Ƽ',5)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Matching(team_name, no_match)"; 
			sql +=	"VALUES ('����Ǯ',6)";
			stmt.executeUpdate(sql);
			
			System.out.println("Insert Record �Ϸ�");

			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
