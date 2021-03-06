package _20180525.Answers;

import java.util.ArrayList;
import java.util.Scanner;
import _20180525.Answers.PhoneDTO;
import _20180525.Answers.PhoneManagement;

/**
 * @author roeuihyun
 */
public class RunningTest {

	public static void main(String[] args) {
		ArrayList<PhoneDTO> phoneList = new ArrayList<PhoneDTO>();
		Scanner sc = new Scanner(System.in);
		PhoneManagement phoneManagement = new PhoneManagement();
		boolean phoneLoop = true;
		while(phoneLoop){
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1 : 등록 ");
			System.out.println("2 : 조회 ");
			System.out.println("3 : 변경 ");
			System.out.println("4 : 삭제 ");
			System.out.println("5 : 종료 ");
			System.out.print("선택 : ");
			String select = sc.nextLine();
			switch(Integer.parseInt(select)) {
				case 1 :
					phoneManagement.create(phoneList);
					break;
				case 2 :
					phoneManagement.search(phoneList);
					break;
				case 3 :
					phoneManagement.update(phoneList);
					break;
				case 4 :
					phoneManagement.delete(phoneList);
					break;
				case 5 :
					System.out.println("프로그램을 종료합니다.");
					phoneLoop = false;
					break;
				default :
					System.out.println("다시 입력해주세요");
			} 
		}
		sc.close();
	}
}
