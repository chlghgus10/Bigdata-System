package menu;

import java.util.*;

public class Menu {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int option = 0;

		LogicClass CallLogic = new LogicClass();
		
		while(true) {
				System.out.println("=========================");
				System.out.println("1:회원가입 	2:회원목록 ");
				System.out.println("3:회원검색 	4:회원탈퇴");
				System.out.println("5:용병목록 	6:팀목록");
				System.out.println("7:매치목록 	8:경기목록");
				System.out.println("9:매치결과목록	10:용병가능게임");
				System.out.println("11:팀별유니폼	12:팀 검색");
				System.out.println("13:용병검색	14:경기장예약현황");
				System.out.println("=========================");
				System.out.print("메뉴를 선택하시오: ");
				option=scan.nextInt();
				
				if(option ==1) {
					 CallLogic.InsertPlayer();
				}
				else if(option == 2){
					 CallLogic.SelectPlayer();
				}
				else if(option == 3){
					 CallLogic.FindPlayer();
				}
				else if(option == 4){
					 CallLogic.DeletePlayer();
				}
				else if(option == 5){
					 CallLogic.SelectMercenary();
				}
				else if(option == 6){
					 CallLogic.SelectTeam();
				}
				else if(option == 7){
					 CallLogic.SelectTeam_match();
				}
				else if(option == 8){
					 CallLogic.SelectGame();
				}
				else if(option == 9){
					 CallLogic.SelectResult();
				}
				else if(option == 10){ 
					CallLogic.MercenaryGame();
				}
				else if(option == 11){
					CallLogic.TeamUniform();
				}
				else if(option == 12){
					 CallLogic.SearchTeam();
				}
				else if(option == 13){
					 CallLogic.SearchMercenary();
				}
				else if(option == 14){
					 CallLogic.Livelocation();
				}
				else if(option ==99) {
					System.out.print("프로그램 종료");
					scan.close();
					break;
				}
				else {
					
				}		
		}
	}
}