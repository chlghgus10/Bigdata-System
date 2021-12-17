package createtables;

import java.sql.*;

public class FKtable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			/*String sql= "CREATE TABLE Result( " +
						"no_result INTEGER NOT NULL, " +
						"no_match INTEGER NOT NULL, " +
						"score INTEGER NOT NULL, " +
						"home VARCHAR(30) NOT NULL, " +
						"away VARCHAR(30) NOT NULL, " +
						"FOREIGN KEY (no_match) REFERENCES Team_match(no_match)," +
						"PRIMARY KEY (no_result, no_match))";
	
	
			stmt.executeUpdate(sql);
			System.out.println("Result ���̺� ���� �Ϸ�");*/
			
			String sql= "CREATE TABLE Apply( " +
					"nickname VARCHAR(20) NOT NULL," +
					"no_game INTEGER NOT NULL," +
					"PRIMARY KEY (nickname,no_game),"+
					"FOREIGN KEY (nickname) REFERENCES Mercenary(nickname)," +
					"FOREIGN KEY (no_game) REFERENCES Game(no_game))" ;
			
			stmt.executeUpdate(sql);
			System.out.println("Apply 테이블 생성 완료");
			
			sql= "CREATE TABLE Matching( " +
					"team_name VARCHAR(20) NOT NULL," +
					"no_match INTEGER NOT NULL," +
					"PRIMARY KEY (team_name,no_match),"+
					"FOREIGN KEY (team_name) REFERENCES Team(team_name)," +
					"FOREIGN KEY (no_match) REFERENCES Team_match(no_match))" ;
			
			stmt.executeUpdate(sql);
			System.out.println("Matching 테이블 생성 완료");

			sql= "CREATE TABLE Team_uniform( " +
					"team_name VARCHAR(20) NOT NULL," +
					"u_color VARCHAR(20) NOT NULL," +
					"PRIMARY KEY (team_name,u_color),"+
					"FOREIGN KEY (team_name) REFERENCES Team(team_name))";

			
			stmt.executeUpdate(sql);
			System.out.println("Team_uniform 테이블 생성 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
