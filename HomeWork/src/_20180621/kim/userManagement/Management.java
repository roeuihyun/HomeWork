package _20180621.kim.userManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Management {
//	Menu menu = new Menu();
	
	InputStreamReader isr = new InputStreamReader(System.in);
	OutputStreamWriter osw = new OutputStreamWriter(System.out);

	BufferedReader br = new BufferedReader(isr);
	
//	static String listfilepath = "//Users//maru//dev//homework//UserInfo.txt";
	static String listfilepath = File.separator + "Users" + File.separator + "maru" + File.separator + "dev" + File.separator + "homework" + File.separator + "UserInfo.txt";
//	static String listfilepath = File.separator + "devtest" + File.separator + "UserInfo.txt";	
	
	public void userCreate (ArrayList<User> userList) {
	
		try {
			FileWriter fw = new FileWriter(listfilepath);
			
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
//			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(fw);
		
			System.out.println("사용자의 이름을 입력해주세요.\n입력>>");
			String name = br.readLine().trim();
			
			System.out.println("\n사용자의 전화번호를 입력해주세요.");
			System.out.print("입력 >>");
			String telNum = br.readLine().trim();
			
			System.out.println("\n사용자의 주소를 입력해주세요.");
			System.out.print("입력 >>");
			String address = br.readLine().trim();
			
			System.out.println("\n사용자의 생일 입력해주세요.");
			System.out.print("입력 >>");
			String birth = br.readLine().trim();
			
			userList.add(new User( name, telNum, address, birth ));
			
//			for (int i = 0; i < userList.size(); i++) {
//				System.out.println("\""+userList.get(i) + "\"을 입력하셨습니다.");
//			}
		
//			System.out.println("\""+t+"\"을 입력하셨습니다.");
			
			bw.write(name);
			bw.flush();
			bw.close();
//			fw.close();
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
