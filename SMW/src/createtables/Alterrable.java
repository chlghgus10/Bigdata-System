package createtables;

import java.sql.*;

public class Alterrable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "ALTER TABLE Player " +
						"ADD CONSTRAINT FOREIGN KEY (team_name) REFERENCES Team(team_name)" +
						"ALTER TABLE Player " +
						"ADD CONSTRAINT FOREIGN KEY (nickname) REFERENCES Mercenary(nickname)" + 
						"ALTER TABLE Mercenary " +
						"ADD CONSTRAINT FOREIGN KEY (team_name) REFERENCES Team(team_name)" +
						"ALTER TABLE Game " +
						"ADD CONSTRAINT FOREIGN KEY (team_name) REFERENCES Team(team_name)";
	
			stmt.executeUpdate(sql);
			System.out.println("Player 수정 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
