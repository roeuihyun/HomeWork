package _20180608.Answers;

import java.util.ArrayList;
import java.util.Scanner;
import _20180608.Answers.PhoneDTO;

/**
 * @author roeuihyun
 */
public class PhoneManagement {

	public void create(ArrayList<PhoneDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("기종을 입력하세요 : ");
		String phoneType = sc.nextLine();
		arrayList.add(new PhoneDTO(name,phoneNumber, phoneType));
		System.out.println("이름 : " + name + ", 휴대폰 번호 :" + phoneNumber + ", 기종 : " + phoneType + " 이 등록되었습니다.");
	}

	public void search(ArrayList<PhoneDTO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("조회를 시작 합니다.");
		System.out.print("조회할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 휴대폰 번호 :" + arrayList.get(i).getPhoneNumber() +", 기종 : " + arrayList.get(i).getPhoneType() );
				notResult = false;
				break;
			}
		}

		if (notResult == true) {
			System.out.println("조회되는 이름이 없습니다. ");
		}
	}

	public void update(ArrayList<PhoneDTO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("수정을 시작합니다.");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.print("휴대폰 번호을 입력하세요 : ");
				String phoneNumber = sc.nextLine();
				System.out.print("변경할 기종을 입력하세요: ");
				String phoneType = sc.nextLine();
				arrayList.get(i).setPhoneNumber(phoneNumber);
				arrayList.get(i).setPhoneType(phoneType);
				System.out.println("수정이 완료되었습니다. ");
				notResult = false;
				break;
			}	
		}

		if (notResult == true) {
			System.out.println("조회된 결과가 없습니다. ");
		}
	}

	public void delete(ArrayList<PhoneDTO> arrayList) {
		boolean noResult = true;
		int resultLineno = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제를 시작합니다.");
		System.out.print("삭제할 번호를 입력하세요 : ");
		String PhoneNumber = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (PhoneNumber.equals(arrayList.get(i).getPhoneNumber())) {
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
