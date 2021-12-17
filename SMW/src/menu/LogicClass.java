package menu;

import java.sql.*;
import java.util.*;

public class LogicClass {
	
	Scanner scan = new Scanner(System.in);
	public void InsertPlayer() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO Player(id,password,name,position,age,gender,do,si) VALUE(?,?,?,?,?,?,?,?)";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			pstmt = con.prepareStatement(sql);
			
			System.out.println("ȸ�������� �Է��Ͻÿ�.");
			System.out.printf("ID: ");
			String id = scan.next(); 
			System.out.printf("P/W: ");
			String password = scan.next();
			System.out.printf("�̸�: ");
			String name = scan.next();
			System.out.printf("������: ");
			String position = scan.next();
			System.out.printf("����: ");
			int age = scan.nextInt();
			System.out.printf("����: ");
			String gender = scan.next();
			System.out.printf("�ּ�(��): ");
			String doo = scan.next();
			System.out.printf("�ּ�(��): ");
			String si = scan.next();
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, position);
			pstmt.setInt(5, age);
			pstmt.setString(6, gender);
			pstmt.setString(7, doo);
			pstmt.setString(8, si);
			
			int cnt = pstmt.executeUpdate(); 
			System.out.println(cnt + "���� ȸ�����ԵǾ����ϴ�.");	
			System.out.println("\n");
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {}	
		}
	}
	////////////////////////////////////////////////////////////////////
	public void SelectPlayer() {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM Player";
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) {
				String id = rs.getString("id"); 
				String name = rs.getString("name"); 
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String position = rs.getString("position");
				
				System.out.println(id + "\t" + name + "\t" + age + "\t" + gender+ "\t"+position);
			}System.out.println("\n");
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}	
	}
	////////////////////////////////////////////////////////////////////
	public void FindPlayer() {
	
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			String sql = "SELECT id,name,age,gender,position FROM Player WHERE name =";
			
			System.out.print("�˻��� ����: "); // �˻��� ������ �Է¹޾Ƽ�
			String find_name = scan.nextLine();
			
			pstmt = con.prepareStatement(sql + "'" + find_name + "'");

			rs = pstmt.executeQuery(); 
			System.out.println("----"+ find_name +"��  �˻� ���-------");
			
			while (rs.next()) {
				String id = rs.getString("id"); 
				String name = rs.getString("name"); 
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String position = rs.getString("position");
				
				System.out.println(id + "\t" + name + "\t" + age + "\t" + gender+ "\t"+position);
			}
		}catch(Exception e) {System.out.println("�˻��� ������ �������� �ʽ��ϴ�.");}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}	
	
////////////////////////////////////////////////////////////////////
	public void DeletePlayer() {	
		Connection con = null;
		Statement stmt = null;
		int r=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			String sql = "DELETE FROM Player WHERE id =";
			
			System.out.println("<ȸ��Ż��> ");
			System.out.print("ID: ");
			String id = scan.nextLine();
			System.out.print("Password: ");
			String password = scan.nextLine();
			
			stmt = con.createStatement();
			r = stmt.executeUpdate(sql + "\'" + id + "\'" + " AND password =" +"\'" + password + "\'"); 
			if( r == 0 ){
                System.out.println("���� ��  ������ ã�� �� �����ϴ�.\n");
            }else{
            	System.out.println("----"+ id +"����  ȸ��Ż��Ǿ����ϴ�.------\n");
            }
			}catch(Exception e) {System.err.println("ID �Ǵ� P/W�� Ʋ�Ƚ��ϴ�.\n");}
		finally {
			try {
				stmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////
	public void SelectMercenary() {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM Mercenary";
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) {
				String nickname = rs.getString("nickname");  
				String position = rs.getString("position");
				String talent = rs.getString("talent");
				String gender = rs.getString("gender");
				int age = rs.getInt("age");
				String doo = rs.getString("do");
				String si = rs.getString("si");
				System.out.println(nickname + "\t" + position + "\t" + talent + "\t" + gender+ "\t"+ age+"\t"+ doo+ "\t"+si);
			}System.out.println("\n");
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}	
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void SelectTeam() {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM Team";
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) {
				String team_name = rs.getString("team_name");  
				int member_num = rs.getInt("member_num");
				String leader = rs.getString("leader");
				String team_talent = rs.getString("team_talent");
				String team_type = rs.getString("team_type");
				String region = rs.getString("region");
				System.out.println(team_name + "\t" + member_num + "\t" + leader + "\t" + team_talent+ "\t"+ team_type+"\t"+ region);
			}System.out.println("\n");
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}	
	}
////////////////////////////////////////////////////////////////////
	public void SelectTeam_match() {Connection con = null;
	PreparedStatement pstmt = null;
	String sql = "SELECT * FROM Team_match";
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery(); 
		
		while (rs.next()) {
			String location = rs.getString("location");  
			String date = rs.getString("date");
			String strat_time = rs.getString("start_time");
			String match_kind = rs.getString("match_kind");
			String match_type = rs.getString("match_type");
			String home = rs.getString("home");
			String away = rs.getString("away");
			String u_home = rs.getString("u_home");
			String u_away = rs.getString("u_away");
			System.out.println(location + "\t" + date + "\t" + strat_time + "\t" + match_kind+ "\t"+ match_type+"\t"+ home+"\t"+ away+"\t"+ u_home+"\t"+ u_away);
		}System.out.println("\n");
	}catch(Exception e) {System.out.println(e);}
	finally {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {}
	}	
}
	
////////////////////////////////////////////////////////////////////
	public void SelectGame() {Connection con = null;
	PreparedStatement pstmt = null;
	String sql = "SELECT * FROM Game";
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery(); 
		
		while (rs.next()) {
			String location = rs.getString("location");  
			String date = rs.getString("date");
			String strat_time = rs.getString("start_time");
			String game_kind = rs.getString("game_kind");
			String game_type = rs.getString("game_type");
			String team_name = rs.getString("team_name");
			int player_num = rs.getInt("player_num");
	
			System.out.println(location + "\t" + date + "\t" + strat_time + "\t" + game_kind+ "\t"+ game_type+"\t"+ team_name+"\t"+ player_num);
		}System.out.println("\n");
	}catch(Exception e) {System.out.println(e);}
	finally {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {}
	}	
}
	
////////////////////////////////////////////////////////////////////
	public void SelectResult() {Connection con = null;
	PreparedStatement pstmt = null;
	String sql = "SELECT Result.home, Result.away, score,location,date,start_time FROM Team_match, Result WHERE Team_match.no_match = Result.no_match";
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery(); 
		
		while (rs.next()) {
			String home = rs.getString("Result.home");  
			String away = rs.getString("Result.away");
			String score = rs.getString("score");
			String location = rs.getString("location");
			String date = rs.getString("date");
			String start_time = rs.getString("start_time");
			System.out.println(home + "\t" + away + "\t" + score + "\t" + location+ "\t"+ date+"\t"+ start_time);
		}System.out.println("\n");
	}catch(Exception e) {System.out.println(e);}
	finally {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {}
	}	
}
////////////////////////////////////////////////////////////////////
	public void MercenaryGame() {Connection con = null;
	PreparedStatement pstmt = null;
	String sql = "SELECT * FROM Game WHERE player_num<12 OR (player_num>12 AND player_num<24)";
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery(); 
		
		while (rs.next()) {
			String location = rs.getString("location");  
			String date = rs.getString("date");
			String strat_time = rs.getString("start_time");
			String game_kind = rs.getString("game_kind");
			String game_type = rs.getString("game_type");
			String team_name = rs.getString("team_name");
			int player_num = rs.getInt("player_num");
	
			System.out.println(location + "\t" + date + "\t" + strat_time + "\t" + game_kind+ "\t"+ game_type+"\t"+ team_name+"\t"+ player_num);
		}System.out.println("\n");
	}catch(Exception e) {System.out.println(e);}
	finally {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {}
	}	
}
////////////////////////////////////////////////////////////////////////////////

	public void TeamUniform() {Connection con = null;
	PreparedStatement pstmt = null;
	String sql = "SELECT * FROM Team_uniform";
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery(); 
		
		while (rs.next()) {

			String team_name = rs.getString("team_name");
			String u_color = rs.getString("u_color");
	
			System.out.println(team_name + "\t" + u_color);
		}System.out.println("\n");
	}catch(Exception e) {System.out.println(e);}
	finally {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {}
	}	
}
	
	public void SearchTeam() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			String sql = "SELECT team_name,member_num,leader,team_talent,team_type,region FROM Team WHERE team_name =";
			
			System.out.print("�˻��� ��: "); // �˻��� ������ �Է¹޾Ƽ�
			String find_team = scan.nextLine();
			
			pstmt = con.prepareStatement(sql + "'" + find_team + "'");

			rs = pstmt.executeQuery(); 
			System.out.println("----"+ find_team +"��  �˻� ���-------");
			
			while (rs.next()) {
				String team_name = rs.getString("team_name"); 
				String leader = rs.getString("leader"); 
				int member_num = rs.getInt("member_num");
				String team_talent = rs.getString("team_talent");
				String team_type = rs.getString("team_type");
				String region = rs.getString("region");
				System.out.println(team_name + "\t" + leader + "\t" + member_num + "\t" + team_talent+ "\t"+team_type+ "\t"+ region);
			}
		}catch(Exception e) {System.out.println("�˻��� ����  �������� �ʽ��ϴ�.");}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}	
public void SearchMercenary() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
						"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			String sql = "SELECT nickname,position,talent,gender,age FROM Mercenary WHERE position =";
			
			System.out.print("�뺴 ������: "); // �˻��� ������ �Է¹޾Ƽ�
			String find_position = scan.nextLine();
			
			pstmt = con.prepareStatement(sql + "'" + find_position + "'");

			rs = pstmt.executeQuery(); 
			System.out.println("----"+ find_position +"��  �˻� ���-------");
			
			while (rs.next()) {
				String position = rs.getString("position"); 
				String nickname = rs.getString("nickname"); 
				int age = rs.getInt("age");
				String talent = rs.getString("talent");
				String gender = rs.getString("gender");
				
				System.out.println(position + "\t" + nickname + "\t" + age + "\t" + talent+ "\t"+gender);
			}
		}catch(Exception e) {System.out.println("�˻��� ����  �������� �ʽ��ϴ�.");}
		finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}	

public void Livelocation() {Connection con = null;
PreparedStatement pstmt = null;
String sql = "SELECT Game.location,Game.date,Game.start_time FROM Game,Team_match WHERE Game.location = Team_match.location";
ResultSet rs = null;

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection(
				"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
	pstmt = con.prepareStatement(sql);
	rs = pstmt.executeQuery(); 
	
	while (rs.next()) {
		String location = rs.getString("location");  
		String date = rs.getString("date");
		String strat_time = rs.getString("start_time");


		System.out.println(location + "\t" + date + "\t" + strat_time);
	}System.out.println("\n");
}catch(Exception e) {System.out.println(e);}
finally {
	try {
		rs.close();
		pstmt.close();
		con.close();
	} catch (Exception e) {}
}	
}
}
