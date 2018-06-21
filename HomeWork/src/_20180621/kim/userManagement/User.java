package _20180621.kim.userManagement;

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
	
	public String gettelNum() {
		return telNum;
	}
	
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddres(String address) {
		this.address = address;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
//	public User() {
//		super();
//	}
	
	public User(String name, String telNum, String address, String birth) {
		super();
		this.name = name;
		this.telNum = telNum;
		this.address = address;
		this.birth = birth;
	}

}
