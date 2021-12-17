package insertdata;

import java.sql.*;

public class InsertData {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://192.168.0.2:4567/SoccerMatchingWeb","leesh", "1234");
            Statement stmt=con.createStatement();
    
            String sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
                sql +=	"VALUES ('첼시','캉테', '서울', '남성팀', '상', 20)";
            stmt.executeUpdate(sql);
            
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('리버풀','헨더슨', '서울', '남성팀', '상', 19)";
            stmt.executeUpdate(sql);
            
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('맨시티','아구에로', '경기', '남성팀', '상', 18)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('셰필드','호날두', '경기', '남성팀', '상', 17)";
            stmt.executeUpdate(sql);
    
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('울버햄튼','바예호', '인천', '남성팀', '상', 16)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('번리','제임스', '인천', '남성팀', '상', 15)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('아스널','외질', '강원', '남성팀', '중', 20)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('맨유','포그바', '강원', '남성팀', '중', 20)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('토트넘','손흥민', '충북', '남성팀', '중', 19)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('본머스','미나', '충북', '남성팀', '중', 18)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('브라이튼','피터', '충남', '남성팀', '중', 17)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('크펠','자하', '충남', '남성팀', '중', 16)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('뉴캐슬','기성용', '전북', '남성팀', '중', 15)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('아스토빌라','테리', '전남', '여성팀', '하', 20)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('에버턴','히샬리송', '부산', '남성팀', '하', 19)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('웨스트햄','케릭', '부산', '여성팀', '하', 18)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('노리치','에릭센', '제주', '남성팀', '하', 17)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('사햄','윌셔', '제주', '여성팀', '하', 16)";
            stmt.executeUpdate(sql);
        
            sql= "INSERT INTO Team(team_name, leader, region, team_type, team_talent, member_num)"; 
            sql +=	"VALUES ('왓포드','살라', '서울', '여성팀', '하', 15)";
            stmt.executeUpdate(sql);
        
            System.out.println("Insert Record 완료");
            
            con.close();
        }catch(Exception e) {System.out.println(e);}
    }
}