package _20180713.kim;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	static int selMenu1 = 0;
	static int selMenu2 = 0;
	
	public int displayMenu1() {
		System.out.println("사용하고자 하는 기능의 번호를 입력해주세요.");
		System.out.println("1: 회원조회 및 차량관리\n2: 회원등록\n3: 회원정보수정\n4: 회원정보삭제\n5: 종료");
		System.out.print("기능선택 >>");
		
		do {
			try {
				selMenu1 = Integer.parseInt(sc.nextLine().trim());
				if(selMenu1 >= 1 && selMenu1 <= 5) {
					break;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.\n메뉴는 1 부터 5까지 입니다.\n재입력 >>");
			}
		} while(true);
		
		return selMenu1;
	}

	public int displayMenu2() {
		System.out.print("1: 차량조회\n2: 차량등록\n3: 차량정보수정\n4: 등록차량삭제\n5: 이전화면\n기능선택 >> ");
		
		do {
			try {
				selMenu2 = Integer.parseInt(sc.nextLine().trim());
				if(selMenu1 >= 1 && selMenu1 <= 5) {
					break;
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.\n메뉴는 1 부터 5까지 입니다.\n");
			}
		} while(true);
		
		return selMenu2;
	}
	
}
