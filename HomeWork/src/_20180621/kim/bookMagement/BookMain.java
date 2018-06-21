package _20180621.kim.bookMagement;

import java.util.HashMap;
//import java.util.Set;
import java.util.Iterator;

public class BookMain {
	public static void main (String[] args) {

		HashMap<String, String> menu = new HashMap<String, String>();
		
		menu.put("001","아메리카노");
		menu.put("002","카페라떼");
		menu.put("003","더치커피");
		menu.put("004","더치라떼");
		
//		Set<String> keySet = menu.keySet();
		Iterator<String> menuNo = menu.keySet().iterator();
		
		while (menuNo.hasNext()) {
			String key = menuNo.next();
            System.out.println( String.format("키 : %s, 값 : %s", key, menu.get(key)) );
		}
	}
}
