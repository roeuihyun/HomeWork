package _20180608.Answers;

import java.util.ArrayList;
import java.util.Scanner;
import _20180608.Answers.PhoneDTO;

/**
 * @author roeuihyun
 */
public class PhoneManagement {

	public void create(String name , ArrayList<PhoneDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.print(name + "님의 신규 전화번호를 입력하세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.print(name + "님의 신규 기종을 입력하세요 : ");
		String phoneType = sc.nextLine();
		arrayList.add(new PhoneDTO(name,phoneNumber, phoneType));
		System.out.println("이름 : " + name + ", 휴대폰 번호 :" + phoneNumber + ", 기종 : " + phoneType + " 이 등록되었습니다.");
	}

	public void search(String name , ArrayList<PhoneDTO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.print(name + "님의 조회가 필요한 휴대폰 번호를 입력하세요 : ");
		String phoneNumber = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (phoneNumber.equals(arrayList.get(i).getPhoneNumber())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 휴대폰 번호 :" + arrayList.get(i).getPhoneNumber() +", 기종 : " + arrayList.get(i).getPhoneType() + "을 조회하였습니다." );
				notResult = false;
			}
		}

		if (notResult == true) {
			System.out.println(name + "님의 조회되는 휴대폰 번호가 없습니다. ");
		}
	}
	
	public void searchAll(String name , ArrayList<PhoneDTO> arrayList) {
		boolean notResult = true;
		System.out.println(name + "님의 명의의 휴대폰 번호를 모두 조회합니다.");
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 휴대폰 번호 :" + arrayList.get(i).getPhoneNumber() +", 기종 : " + arrayList.get(i).getPhoneType() + "을 조회하였습니다." );
				notResult = false;
			}
		}

		if (notResult == true) {
			System.out.println(name + "님의 조회되는 휴대폰 번호가 없습니다. ");
		}
	}


	public void update(String name , ArrayList<PhoneDTO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.print(name + "님의 수정이 필요한 휴대폰 번호를 입력하세요 : ");
		String phoneNumber = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (phoneNumber.equals(arrayList.get(i).getPhoneNumber())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 휴대폰 번호 :" + arrayList.get(i).getPhoneNumber() +", 기종 : " + arrayList.get(i).getPhoneType() + "의 내용을 변경 예정입니다. ");
				System.out.print(name + "님의 수정할 휴대폰 번호를 입력하세요 : ");
				String phoneNumber2 = sc.nextLine();
				System.out.print(name + "님의 변경할 휴대폰 기종을 입력하세요: ");
				String phoneType = sc.nextLine();
				arrayList.get(i).setPhoneNumber(phoneNumber2);
				arrayList.get(i).setPhoneType(phoneType);
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 휴대폰 번호 :" + arrayList.get(i).getPhoneNumber() +", 기종 : " + arrayList.get(i).getPhoneType() + "으로 수정이 완료되었습니다. ");
				notResult = false;
				break;
			}	
		}

		if (notResult == true) {
			System.out.println("조회된 결과가 없습니다. ");
		}
	}

	public void delete(String name , ArrayList<PhoneDTO> arrayList) {
		boolean noResult = true;
		int resultLineno = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제를 시작합니다.");
		System.out.print(name + "님의 삭제할 휴대폰 번호를 입력하세요 : ");
		String phoneNumber = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (phoneNumber.equals(arrayList.get(i).getPhoneNumber())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + "님(의) " + arrayList.get(i).getPhoneNumber() + " 번호가 삭제 되었습니다.");
				resultLineno = i;
				noResult = false;
			}
		}

		if (noResult == true) {
			System.out.println("조회된 결과가 없습니다. ");
		} else {
			arrayList.remove(resultLineno);
		}
	}

}
