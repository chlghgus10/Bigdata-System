package createtables;

import java.sql.*;
import java.sql.DriverManager;

public class createtables {

	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "CREATE TABLE Player( " +
						"id VARCHAR(20) NOT NULL, " +
						"password VARCHAR(30) NOT NULL, " +
						"name VARCHAR(20) NOT NULL, " +
						"position VARCHAR(20) NOT NULL, " +
						"age INTEGER NOT NULL, " +
						"gender VARCHAR(30) NOT NULL, " +
						"do VARCHAR(10) NOT NULL, " +
						"si VARCHAR(10) NOT NULL, " +
						"PRIMARY KEY (id))";	
	
			stmt.executeUpdate(sql);
			System.out.println("Player 테이블 생성 완료");
			
			/*String sql= "CREATE TABLE Mercenary( " +
					"nickname VARCHAR(20) NOT NULL," +
					"position VARCHAR(30) NOT NULL," +
					"talent VARCHAR(20) NOT NULL," +
					"gender VARCHAR(20) NOT NULL," +
					"age INTEGER NOT NULL," +
					"do VARCHAR(10) NOT NULL," +
					"si VARCHAR(10) NOT NULL," +
					"PRIMARY KEY (nickname))";
			
			stmt.executeUpdate(sql);
			System.out.println("Mercenary 테이블 생성 완료");*/
			
			/*String sql= "CREATE TABLE Team( " +
					"team_name VARCHAR(20) NOT NULL," +
					"member_num INTEGER NOT NULL," +
					"leader VARCHAR(20) NOT NULL," +
					"team_talent VARCHAR(20) NOT NULL," +
					"team_type VARCHAR(20) NOT NULL," +
					"region VARCHAR(30) NOT NULL," +
					"PRIMARY KEY (team_name))";
			
			stmt.executeUpdate(sql);
			System.out.println("team_name 테이블 생성 완료");
			
			sql= "CREATE TABLE Game( " +
					"no_game INTEGER NOT NULL," +
					"location VARCHAR(50) NOT NULL," +
					"date DATE NOT NULL," +
					"start_time TIME NOT NULL," +
					"game_type VARCHAR(20) NOT NULL," +
					"game_kind VARCHAR(30) NOT NULL," +
					"player_num INTEGER NOT NULL," +
					"PRIMARY KEY (no_game))";
			
			stmt.executeUpdate(sql);
			System.out.println("Game 테이블 생성 완료");
			
			sql= "CREATE TABLE Team_match( " +
					"no_match INTEGER NOT NULL," +
					"location VARCHAR(50) NOT NULL," +
					"date DATE NOT NULL," +
					"start_time TIME NOT NULL," +
					"match_kind VARCHAR(20) NOT NULL," +
					"match_type VARCHAR(20) NOT NULL," +
					"opponent VARCHAR(10) NOT NULL," +
					"home VARCHAR(20) NOT NULL," +
					"away VARCHAR(20) NOT NULL," +
					"u_home VARCHAR(20) NOT NULL," +
					"u_away VARCHAR(20) NOT NULL," +
					"PRIMARY KEY (no_match))";*/
			
			//stmt.executeUpdate(sql);
			System.out.println("Team_match ���̺� ���� �Ϸ�");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
