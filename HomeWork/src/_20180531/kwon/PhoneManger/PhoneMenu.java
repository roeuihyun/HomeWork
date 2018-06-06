package _20180531.kwon.PhoneManger;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneMenu {

	public static void main(String[] args) {
		  ArrayList<PhoneVO> phoneList = new ArrayList<PhoneVO>();
		  Scanner sc = new Scanner(System.in);
		  PhoneBook phoneBook = new PhoneBook();
		  boolean phoneLoop = true;
		  while(phoneLoop){
		   System.out.println("메뉴를 선택하세요.");
		   System.out.println("1 : 등록 ");
		   System.out.println("2 : 조회 ");
		   System.out.println("3 : 변경 ");
		   System.out.println("4 : 삭제 ");
		   System.out.println("5 : 종료 ");
		   System.out.println("선택 : ");
		   String select = sc.nextLine();
		   
		   switch(Integer.parseInt(select)) {
		    case 1 :
		    	phoneBook.create(phoneList);
		     break;
		    case 2 :
		    	phoneBook.search(phoneList);
		     break;
		    case 3 :
		    	phoneBook.update(phoneList);
		     break;
		    case 4 :
		    	phoneBook.delete(phoneList);
		     break;
		    case 5 :
		     System.out.println("프로그램을 종료합니다.");
		     phoneLoop = false;
		     break;
		    default :
		     System.out.println("다시 입력해주세요");
		   } 
		   
		  }
		  sc.close();
		 }
}
