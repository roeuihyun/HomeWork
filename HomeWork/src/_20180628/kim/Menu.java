package _20180628.kim;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	static int selMenu = 0;
	
	public int displayMenu() {
		System.out.println("사용하고자 하는 기능의 번호를 입력해주세요.");
		System.out.println("1: 조회\n2: 입력\n3: 수정\n4: 삭제\n5: 종료");
		System.out.print("기능선택 >> ");
		do {
			try {
				selMenu = Integer.parseInt(sc.nextLine().trim());
				if(selMenu >= 1 && selMenu <= 5) {
					break;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.\n메뉴는 0 부터 4까지 입니다. : ");
			}
		} while(true);
		
		return selMenu;
	}
}
