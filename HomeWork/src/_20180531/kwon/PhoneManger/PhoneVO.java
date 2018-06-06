package _20180531.kwon.PhoneManger;

public class PhoneVO {

	private String name;
	private String PhoneNumber1;
	private String PhoneNumber2;
	private String PhoneNumber3;
	
	public PhoneVO(String name, String PhoneNumber1, String PhoneNumber2, String PhoneNumber3){ //전체다있는경우
		this.name = name;
		this.PhoneNumber1 = PhoneNumber1;
		this.PhoneNumber2 = PhoneNumber2;
		this.PhoneNumber3 = PhoneNumber3;
	}
	
	public PhoneVO(String name, String PhoneNumber1, String PhoneNumber2){ // 번호 2개있는경우
		this.name = name;
		this.PhoneNumber1 = PhoneNumber1;
		this.PhoneNumber2 = PhoneNumber2;
	}
	
	public PhoneVO(String name, String PhoneNumber1){ 
		this.name = name;
		this.PhoneNumber1 = PhoneNumber1;
	}
	
	//get 메소드 설정 : 각각의 변수값을 읽음
	public String getName() {
		return name;
	}

	public String getPhoneNumber1() {
		return PhoneNumber1;
	}

	public String getPhoneNumber2() {
		return PhoneNumber2;
	}

	public String getPhoneNumber3() {
		return PhoneNumber3;
	}

}
