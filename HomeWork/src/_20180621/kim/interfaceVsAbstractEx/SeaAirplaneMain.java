package _20180621.kim.interfaceVsAbstractEx;

public class SeaAirplaneMain {
	public static void main(String[] args) {
		SeaAirplane sea =new SeaAirplane("CS110");
		Plane p=sea;
		Ship  s=sea;
		SeaAirplaneUtil.show(sea);
		SeaAirplaneUtil.show(p);
		SeaAirplaneUtil.show(s);
		SeaAirplaneUtil.showOnly(sea);
		SeaAirplaneUtil.showPlane(sea);
	}
}