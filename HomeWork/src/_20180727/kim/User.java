package _20180727.kim;

public class User {
	private String name;
	private String telNum;
	private String address;
	private String age;
	
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
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public User() {
		super();
	}
	
	public User(String name, String telNum, String address, String age) {
		super();
		this.name = name;
		this.telNum = telNum;
		this.address = address;
		this.age = age;
	}
}
