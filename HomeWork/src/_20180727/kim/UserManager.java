package _20180727.kim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import _20180727.kim.User;

public class UserManager {
	String name = "";
	String telNum = "";
	String address = "";
	String age = "";
	String nogo = "";
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	public void userCreate (ArrayList<User> userInfoCard) {
		try {
			System.out.print("이름 >>");
			name = br.readLine();
			System.out.print("전화번호 >>");
			telNum = br.readLine();
			System.out.print("주소 입력 >>");
			address = br.readLine();
			System.out.print("나이 입력 >>");
			age = br.readLine();
			System.out.print("\n");
			userInfoCard.add(new User(name,telNum,address,age));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String userSearch( String name, ArrayList<User> userInfoCard) {
		
			if ( userInfoCard.size() == 0 ) {
				System.out.println("등록된 회원이 없습니다. 회원을 등록 후 사용해 주세요.\n");
				name = "false";
			} else {
				try {
					System.out.print("회원이름 >>");
					name = br.readLine();
				
					for (int i = 0; i < userInfoCard.size(); i++) {
						if (name.equals(userInfoCard.get(i).getName())) {
							name = userInfoCard.get(i).getName();
							System.out.println(
									"이름 : " + userInfoCard.get(i).getName() + " | " +
									"전화번호 : " + userInfoCard.get(i).getTelNum() + " | " +
									"주소 : " + userInfoCard.get(i).getAddress() + " | " +
									"나이 : " + userInfoCard.get(i).getAge()
									);
							break;
						} else {
							System.out.println("등록된 회원이 아닙니다.\n");
							name = "false";
						}
					}
					
				} catch(IOException e) {
					e.printStackTrace();
				} 
			} return name;
	}
	
	public void userUpdate(ArrayList<User> userInfoCard) {
		System.out.print("정보 변경 회원 이름 >>");
		
		try {
			name = br.readLine();
				for (int i = 0; i < userInfoCard.size(); i++) {
					if (name.equals(userInfoCard.get(i).getName())) {
						System.out.print("변경 된 회원 전화번호 입력 >>");
						telNum = br.readLine();
						userInfoCard.get(i).setTelNum(telNum);
						System.out.print("변경 된 회원 주소 입력 >>");
						address = br.readLine();
						userInfoCard.get(i).setAddress(address);
						System.out.println("수정이 완료되었습니다. ");
						break;
					} else {
						System.out.println("등록된 회원이 아닙니다.\n");
					}
				}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void userDelete(ArrayList<User> userInfoCard, ArrayList<Car> carInfoCard) {
		System.out.print("삭제 대상 회원 이름 >>");
		try {
			name = br.readLine();
			for (int i = 0; i < userInfoCard.size(); i++) {
				if (name.equals(userInfoCard.get(i).getName())) {
					userInfoCard.remove(i);
					for (int j = 0; j < carInfoCard.size(); j++) {
						if (name.equals(carInfoCard.get(j).getName())) {
							carInfoCard.remove(j);
							break;
						}
					}
					break;
				} else {
					System.out.println("등록된 회원이 아닙니다.\n");
				}
			}
			System.out.println(name + "의 정보가 삭제되었습니다.\n");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
