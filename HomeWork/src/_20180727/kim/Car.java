package _20180727.kim;

public class Car {
	private String name;
	private String car;
	private String carNo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	public String getCarNo() {
		return carNo;
	}
	
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	
	public Car() {
		super();
	}
	
	public Car(String name, String car, String carNo) {
		super();
		this.name = name;
		this.car = car;
		this.carNo = carNo;
	}
}
