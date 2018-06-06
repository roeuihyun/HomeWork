package _20180608.kwon;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

	public void create(ArrayList<PhoneVO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요 : ");
		String PhoneNumber = sc.nextLine();
		System.out.println("통신사를 입력하세요 : ");
		String phoneType = sc.nextLine();
		System.out.println("주소를 입력하세요 : ");
		String addrs = sc.nextLine();
		
		arrayList.add(new PhoneVO(name,PhoneNumber, phoneType, addrs));
		System.out.println("이름 : " + name + ", 휴대폰 번호 :" + PhoneNumber + ", 기종 : " + phoneType +
				", 주소 " + addrs + " 등록되었습니다.");
	}

	public void search(ArrayList<PhoneVO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("조회를 시작 합니다.");
		System.out.println("조회할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 휴대폰 번호 :" + arrayList.get(i).getPhoneNumber() + 
						", 기종 : " + arrayList.get(i).getPhoneType() +
						", 주소 : " + arrayList.get(i).getAddrs());
				notResult = false;
				break;
			}
		}

		if (notResult == true) {
			System.out.println("조회되는 이름이 없습니다. ");
		}
	}

	public void update(ArrayList<PhoneVO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("수정을 시작합니다.");
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("휴대폰 번호을 입력하세요 : ");
			String PhoneNumber = sc.nextLine();
			if (PhoneNumber.equals(arrayList.get(i).getPhoneNumber())) {
					System.out.println("변경할 기종을 입력하세요: ");
					String phoneType = sc.nextLine();
				}	
				System.out.println("수정이 완료되었습니다. ");
				notResult = false;
				break;
			}

		if (notResult == true) {
			System.out.println("조회된 결과가 없습니다. ");
		}
	}

	public void delete(ArrayList<PhoneVO> arrayList) {
		boolean noResult = true;
		int resultLineno = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제를 기능을 시작합니다.");
		System.out.println("삭제할 번호를 입력하세요 : ");
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
