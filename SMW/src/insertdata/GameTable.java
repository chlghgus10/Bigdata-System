package insertdata;

import java.sql.*;

public class GameTable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
				sql +=	"VALUES (1,'청주풋살장', '2019-12-01', '18:00:00', '풋살', '남성매치', 12, '리버풀')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (2,'청주풋살장', '2019-12-01', '20:00:00', '풋살', '남성매치', 12, '리버풀')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (3,'청주풋살장', '2019-12-01', '22:00:00', '풋살', '남성매치', 12, '맨시티')";
			stmt.executeUpdate(sql);
		
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (4,'청주풋살장', '2019-12-02', '18:00:00', '풋살', '남성매치', 10, '맨시티')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (5,'청주풋살장', '2019-12-02', '20:00:00', '풋살', '여성매치', 10, '웨스트햄')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (6,'청주풋살장', '2019-12-01', '12:00:00', '풋살', '여성매치', 10, '웨스트햄')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (7,'청주풋살장', '2019-12-03', '14:00:00', '풋살', '남성매치', 12, '맨시티')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (8,'청주풋살장', '2019-12-04', '16:00:00', '풋살', '남성매치', 12, '리버풀')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (9,'서울풋살장', '2019-12-01', '18:00:00', '풋살', '남성매치', 12, '맨유')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (10,'서울풋살장', '2019-12-03', '18:00:00', '풋살', '남성매치', 12, '맨유')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (11,'서울풋살장', '2019-12-05', '18:00:00', '풋살', '남성매치', 12, '맨유')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (12,'강원풋살장', '2019-12-02', '18:00:00', '풋살', '남성매치', 10, '토트넘')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (13,'강원풋살장', '2019-12-04', '18:00:00', '풋살', '남성매치', 10, '리버풀')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (14,'강원풋살장', '2019-12-06', '18:00:00', '풋살', '남성매치', 10, '리버풀')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (15,'청주축구구장', '2019-12-07', '14:00:00', '축구', '남성매치', 24, '리버풀')";
			stmt.executeUpdate(sql);
	
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (16,'청주축구구장', '2019-12-07', '16:00:00', '축구', '남성매치', 24, '맨시티')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (17,'청주축구구장', '2019-12-08', '18:00:00', '축구', '여성매치', 22, '웨스트햄')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (18,'청주축구구장', '2019-12-08', '16:00:00', '축구', '남성매치', 24, '리버풀')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (19,'청주풋살장', '2019-12-09', '18:00:00', '풋살', '남성매치', 12, '맨시티')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (20,'청주풋살장', '2019-12-10', '18:00:00', '풋살', '남성매치', 12, '리버풀')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Game(no_game, location, date, start_time, game_type, game_kind, player_num, team_name)"; 
			sql +=	"VALUES (21,'청주풋살장', '2019-12-11', '18:00:00', '풋살', '남성매치', 12, '리버풀')";
			stmt.executeUpdate(sql);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("Insert Record 완료");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}