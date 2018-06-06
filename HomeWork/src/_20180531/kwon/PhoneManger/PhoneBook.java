package _20180531.kwon.PhoneManger;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

	public void create(ArrayList<PhoneVO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요 : ");
		String PhoneNumber1 = sc.nextLine();
		System.out.println("또 다른 전화번호를 입력하세요 : ");
		String PhoneNumber2 = sc.nextLine();
		System.out.println("집 전화번호를 입력하세요 : ");
		String PhoneNumber3 = sc.nextLine();
		
		arrayList.add(new PhoneVO(name, PhoneNumber1, PhoneNumber2, PhoneNumber3));
		System.out.println("이름 : " + name + ", 휴대폰 번호(1) :" + PhoneNumber1 + ", 휴대폰 번호(2) : " + PhoneNumber2 +
				", 집 전화번호 " + PhoneNumber3 + " 등록되었습니다.");
	}

	public void search(ArrayList<PhoneVO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("조회를 시작 합니다.");
		System.out.println("조회할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 휴대폰 번호(1) :" + arrayList.get(i).getPhoneNumber1() + 
						", 휴대폰 번호(2) : " + arrayList.get(i).getPhoneNumber2() +
						", 집 전화번호 " + arrayList.get(i).getPhoneNumber3());
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
			System.out.println("휴대폰 번호(1)을 입력하세요 : ");
			String PhoneNumber1 = sc.nextLine();
			System.out.println("휴대폰 번호(2)을 입력하세요 : ");
			String PhoneNumber2 = sc.nextLine();
			System.out.println("집 번호를 입력하세요 : ");
			String PhoneNumber3 = sc.nextLine();
			if (name.equals(arrayList.get(i).getName())) {
				if(PhoneNumber1.equals(arrayList.get(i).getPhoneNumber1())){
					System.out.println("변경할 휴대폰 번호(2)를 입력하세요: ");
					PhoneNumber2 = sc.nextLine();
					System.out.println("변경할 집 번호를 입력하세요: ");
					PhoneNumber3 = sc.nextLine();
				}
				else if(PhoneNumber2.equals(arrayList.get(i).getPhoneNumber2())){
					System.out.println("변경할 휴대폰 번호(1)를 입력하세요: ");
					PhoneNumber1 = sc.nextLine();
					System.out.println("변경할 집 번호를 입력하세요: ");
					PhoneNumber3 = sc.nextLine();
				}
				else if(PhoneNumber3.equals(arrayList.get(i).getPhoneNumber3())){
					System.out.println("변경할 휴대폰 번호(1)를 입력하세요: ");
					PhoneNumber1 = sc.nextLine();
					System.out.println("변경할 휴대폰 번호(2)를 입력하세요: ");
					PhoneNumber2 = sc.nextLine();
				}
				else if(PhoneNumber1.equals(arrayList.get(i).getPhoneNumber1()) && PhoneNumber2.equals(arrayList.get(i).getPhoneNumber2())
						&& PhoneNumber3.equals(arrayList.get(i).getPhoneNumber3())){
					System.out.println("변경할 휴대폰 번호(1)를 입력하세요: ");
					PhoneNumber1 = sc.nextLine();
					System.out.println("변경할 휴대폰 번호(2)를 입력하세요: ");
					PhoneNumber2 = sc.nextLine();
					System.out.println("변경할 집 번호를 입력하세요: ");
					PhoneNumber3 = sc.nextLine();
				}	
				System.out.println("수정이 완료되었습니다. ");
				notResult = false;
				break;
			}
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
		System.out.println("삭제할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + "님(의) 모든 자료가 삭제 되었습니다.");
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
