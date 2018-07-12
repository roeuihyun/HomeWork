package _20180713.kim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CarManager {
	String name = "";
	String car = "";
	String carNo = "";
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	public void carCreate (String name, ArrayList<Car> carInfoCard) {
		try {
			System.out.print("차종 >>");
			car = br.readLine();
			System.out.print("차량번호 >>");
			carNo = br.readLine();

			carInfoCard.add(new Car(name,car,carNo));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void carSearch(String name, ArrayList<Car> carInfoCard) {
		for (int i = 0; i < carInfoCard.size(); i++) {
			if (name.equals(carInfoCard.get(i).getName())) {
				name = carInfoCard.get(i).getName();
				System.out.println(
						"차주 : " + carInfoCard.get(i).getName() + " | " +
						"차종 : " + carInfoCard.get(i).getCar() + " | " +
						"차량번호 : " + carInfoCard.get(i).getCarNo()
						);
			}
		}
	}
	
	public void carUpdate(String name, ArrayList<Car> carInfoCard) {
		System.out.print("정보 변경 차종 >>");
		
		try {
			car = br.readLine();
			for (int i = 0; i < carInfoCard.size(); i++) {
				if (name.equals(carInfoCard.get(i).getName()) && car.equals(carInfoCard.get(i).getCar())) {
					System.out.print("변경 된 차량번호 입력 >>");
					carNo = br.readLine();
					carInfoCard.get(i).setCarNo(carNo);
					System.out.println("수정이 완료되었습니다. ");
					break;
				}	
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void carDelete(String name, ArrayList<Car> carInfoCard) {
		System.out.print("삭제 대상 차종 >>");
		try {
			car = br.readLine();
			for (int i = 0; i < carInfoCard.size(); i++) {
				if (name.equals(carInfoCard.get(i).getName()) && car.equals(carInfoCard.get(i).getCar())) {
					System.out.println("사용자 " + carInfoCard.get(i).getName() + "의 "+carInfoCard.get(i).getCar()+"정보가 삭제되었습니다.");
					carInfoCard.remove(i);
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
