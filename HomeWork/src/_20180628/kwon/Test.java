package _20180628.kwon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int number;// 실행할 번호를 입력받음

		String name;
		String address;
		String phonenumber;

		Scanner input = new Scanner(System.in); // 입력 값

		HashMap<String, String> map = new HashMap<String, String>();

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.println("전화번호 관리 프로그램을 시작합니다.");

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		while (true) {// 무한 루프

			do {

				System.out.println("삽입 : 0, 삭제 : 1, 수정:2, 찾기: 3, 전체보기: 4, 종료 : 5.");

				System.out.print("입력 >>> ");

				number = input.nextInt();

			} while ((number < 0) || (number > 5));// number<0 or number>5일때 다시
													// 입력받음

			if (number == 5) {// 5번 입력시 프로그램 종료

				System.out.println("프로그램이 종료됩니다.");

				break;

			}

			// 스위치 문 시작

			switch (number) {

			case 0: 

				// 삽입

				System.out.print("이름 입력 >>> ");

				name = input.next();

				System.out.print("주소 입력 >>> ");

				address = input.next();

				System.out.print("전화 입력 >>> ");

				phonenumber = input.next();

				// 주소와 핸드폰 번호를 합쳐서 저장함

				String temp = address + " " + phonenumber;

				map.put(name, temp);

				break;

			case 1:

				// 삭제

				System.out.print("이름 입력 >>> ");

				name = input.next();

				if (map.containsKey(name)) {// 이름이 존재하면

					map.remove(name);

					System.out.println("삭제가 완료되었습니다.");

				}

				else {// 이름이 존재하지 않는다면

					System.out.println("존재하지 않는 이름입니다.");

				}

				break;
				
			case 2:

				// 수정

				System.out.print("이름 입력 >>> ");

				name = input.next();
				
				if(map.containsKey(name)) {
					
					System.out.print("수정할 주소 입력 >>> ");

					address = input.next();

					System.out.print("수정할 전화 입력 >>> ");

					phonenumber = input.next();
					
					temp = address + " " + phonenumber;

					map.put(name, temp);
					
					System.out.println("수정되었습니다.");
					
				}

				break;

			case 3:

				// 찾기

				System.out.print("이름 입력 >>> ");

				name = input.next();

				// 출력

				System.out.println(name + " " + map.get(name));

				break;

			case 4:
				
				Iterator<String> it = map.keySet().iterator();

				// 전체보기(입력된 모든 데이터 출력)

				while (it.hasNext()) {

					String key = (String)it.next();

					String value = map.get(key);

					System.out.println(key + ", " + value);

				}

				break;

			}

		}

	}

}