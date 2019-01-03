package _20190103.answers.dto;

public class PersonDto {

	public PersonDto() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonDto(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
