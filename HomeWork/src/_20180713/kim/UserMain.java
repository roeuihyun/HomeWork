package _20180713.kim;

import java.util.ArrayList;

import _20180713.kim.Menu;
import _20180713.kim.User;
import _20180713.kim.Car;
import _20180713.kim.UserManager;
import _20180713.kim.CarManager;

public class UserMain {

	public static void main (String args[]) {
		String name = "";
		
		Menu menu = new Menu();
		UserManager userManager = new UserManager();
		CarManager carManager = new CarManager();
		
		ArrayList<User> userInfoCard = new ArrayList<User>();
		ArrayList<Car> carInfoCard = new ArrayList<Car>();
		
		
		do {
			switch(menu.displayMenu1()) {
			case 1 :
				System.out.print("\"회원정보조회 및 회원차량관리\"기능을 선택하셨습니다.\n");
				name = userManager.userSearch(name, userInfoCard);
//				System.out.println(name + "의 차량관리 시작");
					switch(menu.displayMenu2()){
					case 1:
						System.out.print("\"차량조회\"기능을 선택하셨습니다.\n");
						carManager.carSearch(name, carInfoCard);
						break;
					case 2:
						System.out.print("\"차량등록\"기능을 선택하셨습니다.\n");
						carManager.carCreate(name, carInfoCard);
						break;
					case 3:
						System.out.print("\"등록차량정보수정\"기능을 선택하셨습니다.\n");
						carManager.carUpdate(name, carInfoCard);
						break;
					case 4:
						System.out.print("\"등록차량삭제\"기능을 선택하셨습니다.\n");
						carManager.carDelete(name, carInfoCard);
						break;
					case 5:
						System.out.print("\"이전화면\"기능을 선택하셨습니다.\n");
						menu.displayMenu1();
						break;
					}
				break;
			case 2 :
				System.out.print("\"회원등록\"기능을 선택하셨습니다.\n");
				userManager.userCreate(userInfoCard);
				break;
			case 3 :
				System.out.print("\"회원정보수정\"기능을 선택하셨습니다.\n");
				userManager.userUpdate(userInfoCard);
				break;
			case 4 :
				System.out.print("\"삭제\"기능을 선택하셨습니다.\n");
				userManager.userDelete(userInfoCard, carInfoCard);
				break;
			case 5 :
				System.out.print("\"종료\"기능을 선택하셨습니다.\n");
				System.exit(0);
			} 
		} while(true);
		
	}
}
