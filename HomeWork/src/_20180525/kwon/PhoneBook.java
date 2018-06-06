package _20180525.kwon;
import java.util.Scanner;

class PhoneInfo{
	String name;
	String phoneNumber;
	String addr;
		
	public PhoneInfo(String name, String num, String addr){
		this.name = name;
		this.phoneNumber = num;
		this.addr = addr;
	}
	
	public PhoneInfo(String name, String num){
		this.name = name;
		this.phoneNumber = num;
	}

	public void showPhoneInfo(){
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phoneNumber);
		
		if(addr != null){
			System.out.println("주소 : " + addr);
		}
		
		System.out.println("==========================="); //구분을 주기위해서
	}
}
	
class PhoneBookManager {
	
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	
	public void inputData(){
		
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("주소 : " );
		String addr = MenuViewer.keyboard.nextLine();
		
		infoStorage[curCnt++] = new PhoneInfo(name, phone, addr);
		System.out.println("입력이 완료되었습니다. \n");
	}
	
	public void searchData(){
		System.out.println("조회를 시작합니다.");
		
		System.out.println("번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(phone);
			if(dataIdx<0){
				System.out.println("입력한 번호가 없습니다.");
			}else{
				System.out.println("번호를 입력해주세요.");
				infoStorage[dataIdx].showPhoneInfo();
				System.out.println("조회가 완료되었습니다. \n");
			}
		}
	
	public void deleteData() {
		
		System.out.println("번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(phone);
			if(dataIdx<0){
				System.out.println("입력한 번호가 없습니다.");
			}else{
				for(int idx=dataIdx; idx<(curCnt-1); idx++)
					infoStorage[idx] = infoStorage[idx+1];
					System.out.println("삭제할 번호를 입력해주세요.");
					curCnt--;

					System.out.println("삭제가 완료되었습니다. \n");
				}
		}
	
	public void updateData() {
		
		System.out.println("번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(phone);
		if(dataIdx<0){
			System.out.println("입력한 번호가 없습니다.");
		}else{
			for(int idx=dataIdx; idx<curCnt; idx++){
				PhoneInfo curInfo = infoStorage[idx];
				if(phone.compareTo(curInfo.phoneNumber) == dataIdx)
					System.out.println("이름 : ");
					String name = MenuViewer.keyboard.nextLine();
					System.out.println("주소 : " );
					String addr = MenuViewer.keyboard.nextLine();
					infoStorage[curCnt] = new PhoneInfo(name, phone, addr);
					infoStorage[idx] = infoStorage[idx];
					System.out.println("수정이 완료되었습니다.");
			}
		}
	}
	private int search(String phone){
		for(int idx=0; idx<curCnt; idx++){
			PhoneInfo curInfo = infoStorage[idx];
			if(phone.compareTo(curInfo.phoneNumber)==0)
				return idx;
		}
		return -1;
	}
}

class MenuViewer{
	
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("선택하세요");
		System.out.println("1. 조회");
		System.out.println("2. 등록");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("선택 : ");
	}
}

class PhoneBook {

	static PhoneBookManager manager = new PhoneBookManager();
	int choice;
	
	public static void main(String[] args) {
		
		int choice;
		while(true){
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			switch(choice){
			case 1:
				manager.searchData();
				break;
			case 2:
				manager.inputData();
				break;
			case 3:
				manager.updateData();
				break;
			case 4:
				manager.deleteData();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}	
	}
}