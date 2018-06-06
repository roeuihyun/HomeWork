package _20180525.Answers;

/**
 * @author roeuihyun
 */
public class PhoneDTO {
	
	private String Name;
	private String PhoneNumber;
	private String PhoneType;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return PhoneType;
	}

	public void setPhoneType(String phoneType) {
		PhoneType = phoneType;
	}

	public PhoneDTO() {
		// TODO Auto-generated constructor stub
	}

	public PhoneDTO(String name, String phoneNumber, String phoneType) {
		super();
		Name = name;
		PhoneNumber = phoneNumber;
		PhoneType = phoneType;
	}
	
}
