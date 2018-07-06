package _20180706.kwon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
	
	
	int number;// 실행할 번호를 입력받음

	String name;
	String address;
	String phonenumber;
	String temp;

	Scanner input = new Scanner(System.in); // 입력 값

	HashMap<String, String> map = new HashMap<String, String>();
	HashMap<String, String> map2 = new HashMap<String, String>();
	HashMap<String, String> map3 = new HashMap<String, String>();
	
	public void input() {
		
		// 삽입

		System.out.print("주소 입력 >>> ");

		address = input.next();

		System.out.print("전화 입력 >>> ");

		phonenumber = input.next();

		// 주소와 핸드폰 번호를 합쳐서 저장함

		temp = address + " " + phonenumber;
		
	}
	
	public void update() {
		
		System.out.print("수정할 주소 입력 >>> ");

		address = input.next();

		System.out.print("수정할 전화 입력 >>> ");

		phonenumber = input.next();
		
		temp = address + " " + phonenumber;
		
	}
	
	public void test () {
		while (true) {// 무한 루프

			do {

				System.out.println("삽입 : 0, 삭제 : 1, 찾기: 2, 전체보기: 3, 종료 : 4.");

				System.out.print("입력 >>> ");

				number = input.nextInt();

			} while ((number < 0) || (number > 4));// number<0 or number>5일때 다시
													// 입력받음

			if (number == 4) {// 5번 입력시 프로그램 종료

				System.out.println("프로그램이 종료됩니다.");

				break;

			}

			// 스위치 문 시작

			switch (number) {

			case 0: 
				
				System.out.print("이름 입력 >>> ");

				name = input.next();

				input();

				map.put(name, temp);

				break;

			case 1:

				// 삭제

				System.out.print("이름 입력 >>> ");

				name = input.next();

				if (map.containsKey(name)) {// 이름이 존재하면

					map.remove(name);
					map2.remove(name);
					map3.remove(name);

					System.out.println("삭제가 완료되었습니다.");

				}

				else {// 이름이 존재하지 않는다면

					System.out.println("존재하지 않는 이름입니다.");

				}

				break;
				
			case 2:

				// 찾기

				System.out.print("이름 입력 >>> ");

				name = input.next();

				// 출력
				
				if(map.containsKey(name)) {
					
					System.out.println(name + " " + map.get(name));
					
					if(map2.get(name) != null) {
						
						System.out.println(name + " " + map2.get(name));
						
						if(map3.get(name) != null) {
							
							System.out.println(name + " " + map3.get(name));
							
						}
						
					}
					
					int secondeNumber;
					
					while (true) {
						do {

							System.out.println("추가 등록 : 0, 수정 : 1, 추가 정보 종료 : 2");

							System.out.print("입력 >>> ");

							secondeNumber = input.nextInt();

						} while ((secondeNumber < 0) || (secondeNumber > 2));// number<0 or number>5일때 다시
						
						if (secondeNumber == 2) {// 2번 입력시 추가입력 정보 종료

							System.out.println("추가입력이 종료됩니다.");

							break;

						}
						
						switch (secondeNumber) {
						
						case 0:
							
							System.out.println("총 3개의 전화버호까지 입력할 수 있습니다.");
							
							if(map2.containsKey(name)) {
								
								System.out.println("두 번째 전화번호가 추가되어있습니다.");
								
								if(map3.containsKey(name)) {
									
									System.out.println("세 번째 전화번호가 추가되어있습니다.");
									System.out.println("더 이상 추가할 수 없습니다.");
									
								}else {
									
									// 세 번쨰 번호 삽입
									
									System.out.println("세 번째 번호를 추가 등록합니다.");

									input();

									map3.put(name, temp);
									
									System.out.println("세 번째 번호가 추가등록 되었습니다.");
									
								}
								
							}else {
								
								// 두 번쨰 번호 삽입
								
								System.out.println("두 번째 번호를 추가 등록합니다.");

								input();

								map2.put(name, temp);
								
								System.out.println("두 번째 번호가 추가등록 되었습니다.");
							}
							
							break;
							
						case 1:
							
							// 수정
							
							System.out.println("수정을 원하는 번호를 입력해주세요");
							System.out.println("1번 : " + map.get(name));
							System.out.println("2번 : " + map2.get(name));
							System.out.println("3번 : " + map3.get(name));
							System.out.println("번호 입력 >>>");
							
							number = input.nextInt();

							if(number == 1) {
								
								update();

								map.put(name, temp);
								
								System.out.println("수정되었습니다.");
								
							}else if (number == 2) {
								
								update();

								map2.put(name, temp);
								
								System.out.println("수정되었습니다.");
								
							}else if (number == 3) {
								
								update();

								map3.put(name, temp);
								
								System.out.println("수정되었습니다.");
								
							}

							break;
							
						}
					}
					
				}else {
					
					System.out.println("존재하지 않는 이름입니다.");
					
				}
				
				break;

			case 3:
				
				Iterator<String> it = map.keySet().iterator();
				Iterator<String> it2 = map2.keySet().iterator();
				Iterator<String> it3 = map3.keySet().iterator();

				// 전체보기(입력된 모든 데이터 출력)

				while (it.hasNext()) {

					String key1 = (String)it.next();
					String key2 = (String)it2.next();
					String key3 = (String)it3.next();

					String value1 = map.get(key1);
					System.out.println(key1 + ", " + value1);
					
					String value2 = map2.get(key2);
					System.out.println(key2 + ", " + value2);
					
					String value3 = map3.get(key3);
					System.out.println(key3 + ", " + value3);

				}

				break;

			}

		}
	}

	public static void main(String[] args) {
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.println("전화번호 관리 프로그램을 시작합니다.");

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Test test = new Test();
		
		test.test();

	}

}