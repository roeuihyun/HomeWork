package _20180608.Answers;

import java.util.ArrayList;
import java.util.Scanner;
import _20180608.Answers.HumanDTO;

/**
 * @author roeuihyun
 */
public class HumanManagement {
	
	public void create(ArrayList<HumanDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		String age = sc.nextLine();
		arrayList.add( new HumanDTO(name,age) );
		System.out.println("이름 : " + name + ", 나이 :" + age + " 이 등록되었습니다.");
	}

	public void search(ArrayList<HumanDTO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("조회를 시작 합니다.");
		System.out.print("조회할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + ", 나이 :" + arrayList.get(i).getAge() );
				notResult = false;
				break;
			}
		}

		if (notResult == true) {
			System.out.println("조회되는 이름이 없습니다. ");
		}
	}

	public void update(ArrayList<HumanDTO> arrayList) {
		boolean notResult = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("수정을 시작합니다.");
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.print("나이를 입력하세요 : ");
				String age = sc.nextLine();
				arrayList.get(i).setAge(age);
				System.out.println("수정이 완료되었습니다. ");
				notResult = false;
				break;
			}	
		}

		if (notResult == true) {
			System.out.println("조회된 결과가 없습니다. ");
		}
	}

	public void delete(ArrayList<HumanDTO> arrayList) {
		boolean noResult = true;
		int resultLineno = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제를 시작합니다.");
		System.out.print("삭제할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (name.equals(arrayList.get(i).getName())) {
				System.out.println("이름 : " + arrayList.get(i).getName() + "님(의) 정보가 삭제 되었습니다.");
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
