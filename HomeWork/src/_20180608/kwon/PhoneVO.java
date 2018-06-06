package _20180608.kwon;

public class PhoneVO {

	private String Name;
	private String PhoneNumber;
	private String PhoneType;
	private String Addrs;

	// get 메소드 설정 : 각각의 변수값을 읽음
	public String getName() {
		return Name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getPhoneType() {
		return PhoneType;
	}

	public String getAddrs() {
		return Addrs;
	}

	public PhoneVO() {
		// TODO Auto-generated constructor stub
	}

	public PhoneVO(String phoneNumber, String phoneType) {
		super();
		this.PhoneNumber = phoneNumber;
		this.PhoneType = phoneType;
	}

	public PhoneVO(String name, String phoneNumber, String phoneType, String addr) {
		super();
		this.Name = name;
		this.PhoneNumber = phoneNumber;
		this.PhoneType = phoneType;
		this.Addrs = addr;
	}

}
