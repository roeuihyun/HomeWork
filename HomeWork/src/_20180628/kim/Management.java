package _20180628.kim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import _20180628.kim.User;

public class Management {
	String name = "";
	String telNum = "";
	String address = "";
	String birth = "";
	int selNum = 0;
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	public void userCreate (ArrayList<User> userList) {
		try {
			System.out.println("사용자의 이름을 입력해주세요.");
			System.out.print("입력 >>");
			name = br.readLine();
			System.out.println("사용자의 전화번호를 입력해주세요.");
			System.out.print("입력 >>");
			telNum = br.readLine();
			System.out.println("사용자의 주소를 입력해주세요.");
			System.out.print("입력 >>");
			address = br.readLine();
			System.out.println("사용자의 생년월일을 입력해주세요.");
			System.out.print("입력 >>");
			birth = br.readLine();

			userList.add(new User(name,telNum,address,birth));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void userSearch(ArrayList<User> userList) {
		
		try {
			System.out.print("조회 할 사용자의 이름을 입력하세요 : ");
			name = br.readLine();
			
			for (int i = 0; i < userList.size(); i++) {
				if (name.equals(userList.get(i).getName())) {
					System.out.println(
							"이름 : " + userList.get(i).getName() + " | " +
							"전화번호 : " + userList.get(i).getTelNum() + " | " +
							"주소 : " + userList.get(i).getAddress() + " | " +
							"생년월일 : " + userList.get(i).getBirth()
							);
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void userUpdate(ArrayList<User> userList) {
		System.out.print("변경 할 사용자의 이름을 입력하세요 : ");
		
		try {
			name = br.readLine();
			for (int i = 0; i < userList.size(); i++) {
				if (name.equals(userList.get(i).getName())) {
					System.out.print("변경 된 사용자의 전화번호을 입력하세요 : ");
					telNum = br.readLine();
					userList.get(i).setTelNum(telNum);
					System.out.print("변경 된 사용자의 주소를 입력하세요: ");
					address = br.readLine();
					userList.get(i).setAddress(address);
					System.out.println("수정이 완료되었습니다. ");
					break;
				}	
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void userDelete(ArrayList<User> userList) {
		System.out.print("삭제할 사용자의 이름을 입력하세요 : ");
		try {
			name = br.readLine();
			for (int i = 0; i < userList.size(); i++) {
				if (name.equals(userList.get(i).getName())) {
					System.out.println("사용자 " + userList.get(i).getName() + "의 정보가 삭제되었습니다.");
					userList.remove(i);
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
