package _20180628.kim;

public class User {
	private String name;
	private String telNum;
	private String address;
	private String birth;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelNum() {
		return telNum;
	}
	
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public User() {
		super();
	}
	
	public User(String name, String telNum, String address, String birth) {
		super();
		this.name = name;
		this.telNum = telNum;
		this.address = address;
		this.birth = birth;
	}
	
	public String toString() {
		return "이름 :" + name + "전화번호 : " + telNum + "주소 : " + address  + "생일 : " + birth;
	}
	
}
