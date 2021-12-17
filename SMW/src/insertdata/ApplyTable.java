package insertdata;

import java.sql.*;

public class ApplyTable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Apply(nickname, no_game)"; 
				sql +=	"VALUES ('이승호',4)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('염형섭',4)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('김주역',17)";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('신상민',12)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Apply(nickname, no_game)"; 
			sql +=	"VALUES ('하정민',13)";
			stmt.executeUpdate(sql);
			System.out.println("Insert Record 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
