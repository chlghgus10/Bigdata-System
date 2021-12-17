package insertdata;

import java.sql.*;

public class Team_uniform {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
				sql +=	"VALUES ('����Ǯ','RED')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('����Ǯ','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('�ǽ�Ƽ','BLUE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('�ǽ�Ƽ','GREEN')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('����','RED')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('����','BLACK')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('��Ʈ��','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('��Ʈ��','BLACK')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('����Ʈ��','RED')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('����Ʈ��','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('������','WHITE')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Team_uniform(team_name, u_color)"; 
			sql +=	"VALUES ('������','GREEN')";
			stmt.executeUpdate(sql);
			
			
			System.out.println("Insert Record �Ϸ�");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
