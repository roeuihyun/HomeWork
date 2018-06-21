package _20180621.kim.userManagement;

import java.util.ArrayList;

import _20180621.kim.userManagement.Management;
import _20180621.kim.userManagement.Menu;
import _20180621.kim.userManagement.User;

public class UserInfoMain {

	public static void main (String args[]) {
		Menu menu = new Menu();
		ArrayList<User> user = new ArrayList<User>();
		
		Management bookMmanagement = new Management();
		
		while(true) {
			switch(menu.displayMenu()) {
			case 1 :
				System.out.println("\"조회\"기능을 선택하셨습니다.\n");
				break;
			case 2 :
				System.out.println("\"입력\"기능을 선택하셨습니다.\n");	
				bookMmanagement.userCreate(user);
				break;
			case 3 :
				System.out.println("\"수정\"기능을 선택하셨습니다.\n");
				break;
			case 4 :
				System.out.println("\"삭제\"기능을 선택하셨습니다.\n");
				break;
			case 5 :
				System.out.println("\"종료\"기능을 선택하셨습니다.\n");
				System.exit(0);
			}
		} 
	}
}
