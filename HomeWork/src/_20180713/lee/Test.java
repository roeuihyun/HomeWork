package _20180713.lee;

public class Test {
	
	public static void main(String args[]){
		
		String input;
		
		ComService service = new ComService();
		
		
		
		while(true){
			
			input = service.conStart();
			String result = service.conRepeat(input);
			if(result != null && result.equals("exit"))break;
		}

	}
	
	
	
}
