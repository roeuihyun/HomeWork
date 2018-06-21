package _20180621.kim.interfaceVsAbstractEx;

public class SeaAirplane extends Plane implements Ship {
	private String id="Air Balls";
	public SeaAirplane(String id){
		this.id=id;
	}
	public SeaAirplane(){
		this("LeeMass");
	}
	
	public  void fly(){
		System.out.println("엔진과 날개를 이용해서 날아감");
	}
	public  int power(){
		return 10000;
	}
	
	public int move(){
		return 5;
	}
	public int carry(){
		return 300;
	}
	
	public String toString(){
		return this.id+"가  "+power()+"마력으로  "+move()+"명을 나른다.";
	}
}
