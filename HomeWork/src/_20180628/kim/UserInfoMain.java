package _20180628.kim;

import java.util.ArrayList;

//import java.util.ArrayList;

import _20180628.kim.Management;
import _20180628.kim.Menu;
import _20180628.kim.User;

public class UserInfoMain {

	public static void main (String args[]) {
		Menu menu = new Menu();
		User u = new User();
		ArrayList<User> userList = new ArrayList<User>();
		
		Management management = new Management();
		
		System.out.println("start user management 1st edition");
		
		while(true) {
			switch(menu.displayMenu()) {
			case 1 :
				System.out.print("\"조회\"기능을 선택하셨습니다.\n");
				management.userSearch(userList);
				break;
			case 2 :
				System.out.print("\"입력\"기능을 선택하셨습니다.\n");	
				management.userCreate(userList);
				break;
			case 3 :
				System.out.print("\"수정\"기능을 선택하셨습니다.\n");
				management.userUpdate(userList);
				break;
			case 4 :
				System.out.print("\"삭제\"기능을 선택하셨습니다.\n");
				management.userDelete(userList);
				break;
			case 5 :
				System.out.print("\"종료\"기능을 선택하셨습니다.\n");
				System.exit(0);
			}
		} 
	}
}
