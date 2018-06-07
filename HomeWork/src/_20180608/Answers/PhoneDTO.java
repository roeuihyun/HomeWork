package _20180608.Answers;

/**
 * @author roeuihyun
 */
public class PhoneDTO {
	 
	private String name;
	private String phoneNumber;
	private String phoneType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	public PhoneDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PhoneDTO(String name, String phoneNumber, String phoneType) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
	}
	
}
