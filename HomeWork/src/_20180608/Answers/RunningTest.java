package _20180608.Answers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import _20180608.Answers.PhoneDTO;
import _20180608.Answers.PhoneManagement;
import _20180608.Answers.HumanDTO;
import _20180608.Answers.HumanManagement;

/**
 * @author roeuihyun
 */
public class RunningTest {

	public static void main(String[] args) {
		ArrayList<HumanDTO> humanList = new ArrayList<HumanDTO>();
		ArrayList<PhoneDTO> phoneList = new ArrayList<PhoneDTO>();
		Scanner sc = new Scanner(System.in);
		HumanManagement humanManagement = new HumanManagement();
		PhoneManagement phoneManagement = new PhoneManagement();
		boolean humanLoop = true;
		while(humanLoop){
			System.out.println("인재 관리 메뉴를 선택하세요.");
			System.out.println("1 : 인재 등록 ");
			System.out.println("2 : 인재 조회 ");
			System.out.println("3 : 인재 변경 ");
			System.out.println("4 : 인재 삭제 ");
			System.out.println("5 : 프로그램 종료 ");
			System.out.print("선택 : ");
			String select = sc.nextLine();
			switch(Integer.parseInt(select)) {
				case 1 :
					humanManagement.create(humanList);
					break;
				case 2 :
					HashMap<String,Object> resultMap = humanManagement.search(humanList);
					if(!((boolean)resultMap.get("notResult"))){
						System.out.println((String)resultMap.get("name") + "의 휴대폰 관리 모드입니다. 메뉴를 선택하세요.");
						System.out.println("1 : " + (String)resultMap.get("name") + " 님의 신규 휴대폰 등록 ");
						System.out.println("2 : " + (String)resultMap.get("name") + " 님의 휴대폰 목록 전체 조회");
						System.out.println("3 : " + (String)resultMap.get("name") + " 님의 휴대폰 목록 조회");
						System.out.println("4 : " + (String)resultMap.get("name") + " 님의 휴대폰 변경");
						System.out.println("5 : " + (String)resultMap.get("name") + " 님의 휴대폰 삭제");
						System.out.println("6 : " + (String)resultMap.get("name") + " 님의 휴대폰 관리모드 빠져나가기");
						System.out.print("선택 : ");
						select = sc.nextLine();
						String name = (String)resultMap.get("name");
						switch(Integer.parseInt(select)) {
							case 1 :
								phoneManagement.create(name,phoneList);
								break;
							case 2 :
								phoneManagement.searchAll(name,phoneList);
								break;
							case 3 :
								phoneManagement.search(name,phoneList);
								break;
							case 4 :
								phoneManagement.update(name,phoneList);
								break;
							case 5 :
								phoneManagement.delete(name,phoneList);
								break;
							case 6 :
								System.out.println("인재 관리 화면으로 돌아갑니다.");
								break;
							default :
								System.out.println("인재 관리 화면으로 돌아갑니다.");
						}
					}
					break;
				case 3 :
					humanManagement.update(humanList);
					break;
				case 4 :
					humanManagement.delete(humanList);
					break;
				case 5 :
					System.out.println("프로그램을 종료합니다.");
					humanLoop = false;
					break;
				default :
					System.out.println("다시 입력해주세요");
			} 
		}
		sc.close();
	}
}
