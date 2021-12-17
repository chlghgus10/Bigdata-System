package insertdata;

import java.sql.*;

public class Team_match {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (1,'û��ǲ����', '2019-12-11', '18:00:00', 'ǲ��', '������ġ', NULL, '����Ǯ', NULL, 'RED', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (2,'û��ǲ����', '2019-12-12', '18:00:00', 'ǲ��', '������ġ', NULL, '����Ǯ', '�ǽ�Ƽ', 'RED', 'BLUE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (3,'û��ǲ����', '2019-12-13', '18:00:00', 'ǲ��', '������ġ', NULL, '������', '����Ʈ��', 'RED', 'WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (4,'û��ǲ����', '2019-12-13', '20:00:00', 'ǲ��', '������ġ', NULL, '����Ǯ', NULL, 'RED', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (5,'û���౸����', '2019-12-14', '12:00:00', '�౸', '������ġ', NULL, '����Ǯ', '�ǽ�Ƽ', 'RED', 'WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_match(no_match, location, date, start_time, match_type, match_kind, opponent, home, away, u_home,u_away)"; 
			sql +=	"VALUES (6,'û���౸����', '2019-12-15', '14:00:00', '�౸', '������ġ', NULL, '����Ǯ', NULL, 'RED', NULL)";
			stmt.executeUpdate(sql);
			

			stmt.executeUpdate(sql);
			
			
			
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("Insert Record �Ϸ�");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
