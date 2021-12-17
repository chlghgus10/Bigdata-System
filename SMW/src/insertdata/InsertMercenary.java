package insertdata;

import java.sql.*;

public class InsertMercenary {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
				sql +=	"VALUES ('������','FW', '��', 20, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('������','MF', '��', 20, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('������','MF', '��', 21, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('����â','MF', '��', 23, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('�̼���','DF', '��', 23, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('�ڽ���','DF', '��', 20, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('������','GK', '��', 25, '��', '�泲', '����', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('��Ź�','MF', '��', 20, '��', '���', '����', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('������','FW', '��', 21, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Mercenary(nickname, position, talent, age, gender, do, si, team_name)"; 
			sql +=	"VALUES ('������','MF', '��', 21, '��', '���', 'û��', NULL)";
			stmt.executeUpdate(sql);
			
			
			System.out.println("Insert Record �Ϸ�");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
