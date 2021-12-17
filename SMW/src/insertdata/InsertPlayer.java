package insertdata;

import java.sql.*;

public class InsertPlayer {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.246.5:4567/SoccerMatchingWeb","leesh", "1234");
			Statement stmt=con.createStatement();
			
			String sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
				sql +=	"VALUES ('������','������','FW', 20, '��', '���', 'û��', NULL,'orpsh1941','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('������','������','MF', 20, '��', '���', 'û��', NULL,'2','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('������','������','MF',21, '��', '���', 'û��', NULL,'3','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('����â','����â','MF', 23, '��', '���', 'û��', NULL,'4','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('�̼���','�̼���','DF',23, '��', '���', 'û��', NULL,'5','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('�ڽ���','�ڽ���','DF', 20, '��', '���', 'û��', NULL,'6','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('������','������','GK',  25, '��', '�泲', '����', NULL,'7','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('��Ź�','��Ź�','MF',  20, '��', '���', '����', NULL,'8','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES ('������','������','FW',  21, '��', '���', 'û��', NULL,'9','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('������','������','MF',  21, '��', '���', 'û��', NULL,'10','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('���ֿ�','���ֿ�','FK',  30, '��', '����', '����', NULL,'11','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)";  
			sql +=	"VALUES ('������','������','FK',  28, '��', '���', '����', NULL,'12','1234')";
			stmt.executeUpdate(sql);
			//////////////////////////////////////////////////////////////////////////////////////////////////
			
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'������','FW', 20, '��', '����', '����', '��Ʈ��','13','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�⼺��','FW', 20, '��', '����', '����', '��ĳ��','14','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�����','FW', 20, '��', '����', '����', '����Ǯ','15','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�Ʊ�����','FW', 21, '��', '���', '�Ⱦ�', '�ǽ�Ƽ','16','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���׹�','FW', 21, '��', '����', '����', '����','17','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���ӽ�','MF', 21, '��', '��õ', '��õ', '����','18','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�̳�','MF', 21, '��', '���', 'û��', '���ӽ�','19','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','MF', 22, '��', '�泲', '����', '�����ư','20','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','MF', 22, '��', '����', '����', '����','21','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'ȣ����','MF', 23, '��', '���', '����', '���ʵ�','22','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','DF', 24, '��', '����', '����', '�ƽ���','23','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�׸�','DF', 25, '��', '����', '����', '�ƽ������','24','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��������','DF', 26, '��', '�λ�', '����', '������','25','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���','DF', 27, '��', '����', '����', '������','26','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�ٿ�ȣ','GK', 28, '��', '��õ', '����', '�����ư','27','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'ĳ��','GK', 29, '��', '�λ�', '����', '����Ʈ��','28','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'Ĳ��','DF', 30, '��', '����', 'û��', 'ÿ��','29','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','DF', 30, '��', '�泲', '����', 'ũ��','30','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�����','DF', 30, '��', '���', 'û��', '��Ʈ��','31','1234')";
			stmt.executeUpdate(sql);
			
			////////////////////////////////////////////////////////////////////////////////////////////////


			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�ι�Ʈ��','FW', 20, '��', '����', '����', '��Ʈ��','no32','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','FW', 20, '��', '����', '����', '��Ʈ��','33','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�Ǹ��̴�','FW', 20, '��', '����', '����', '��Ʈ��','34','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���̳���','FW', 21, '��', '���', '�Ⱦ�', '��Ʈ��','35','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','FW', 21, '��', '����', '����', '��Ʈ��','36','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'������Ʈ','MF', 21, '��', '��õ', '��õ', '��Ʈ��','37','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','MF', 21, '��', '���', 'û��', '��Ʈ��','38','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��ũ��','MF', 22, '��', '�泲', '����', '��Ʈ��','39','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���̾�','MF', 22, '��', '����', '����', '��Ʈ��','40','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'������','MF', 23, '��', '���', '����', '��Ʈ��','41','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','DF', 24, '��', '����', '����', '�ǽ�Ƽ','43','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��������','DF', 25, '��', '����', '����', '�ǽ�Ƽ','42','1234')";
			stmt.executeUpdate(sql);
 			
 			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'������','DF', 26, '��', '�λ�', '����', '�ǽ�Ƽ','44','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��ü��','DF', 27, '��', '����', '����', '�ǽ�Ƽ','45','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��Ÿ','GK', 28, '��', '��õ', '����', '�ǽ�Ƽ','46','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�˸�','GK', 29, '��', '�λ�', '����', '�ǽ�Ƽ','47','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���ĵ�','DF', 30, '��', '����', 'û��', '�ǽ�Ƽ','48','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�����','DF', 30, '��', '�泲', '����', '�ǽ�Ƽ','49','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','DF', 30, '��', '���', 'û��', '�ǽ�Ƽ','50','1234')";
			stmt.executeUpdate(sql);
			
			/////////////////////////////////////////////////////////////////////////////////////////////////////

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�޽�','FW', 20, '��', '����', '����', '�ǽ�Ƽ','51','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���Ʒ���','FW', 20, '��', '����', '����', '����Ǯ','52','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�׸��','FW', 20, '��', '����', '����', '����Ǯ','53','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���','FW', 21, '��', '���', '�Ⱦ�', '����Ǯ','54','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�Ƹ�����','FW', 21, '��', '����', '����', '����Ǯ','55','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','MF', 21, '��', '��õ', '��õ', '����Ǯ','56','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��ƼƼ','MF', 21, '��', '���', 'û��', '����Ǯ','57','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�˹�','MF', 22, '��', '�泲', '����', '����Ǯ','58','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���޵�','MF', 22, '��', '����', '����', '����Ǯ','59','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��������','MF', 23, '��', '���', '����', '����Ǯ','60','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���','DF', 24, '��', '����', '����', '����Ǯ','61','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�ٶ�','DF', 25, '��', '����', '����', '����Ǯ','62','1234')";
			stmt.executeUpdate(sql);

			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'ī���̷�','DF', 26, '��', '�λ�', '����', '����','63','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'��帮ġ','DF', 27, '��', '����', '����', '����','64','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'����','GK', 28, '��', '��õ', '����', '����','65','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���ڸ�','GK', 29, '��', '�λ�', '����', '����','66','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'���̽�','DF', 30, '��', '����', 'û��', '����','67','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'�ɸὺ','DF', 30, '��', '�泲', '����', '����','68','1234')";
			stmt.executeUpdate(sql);
			
			sql= "INSERT INTO Player(nickname, name, position, age, gender, do, si, team_name, id, password)"; 
			sql +=	"VALUES (NULL,'Ű����','DF', 30, '��', '���', 'û��', '����','69','1234')";
			stmt.executeUpdate(sql);
			//////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("Insert Record �Ϸ�");
			
			con.close();
		}catch(Exception e) {System.out.println(e);}
	}
}
