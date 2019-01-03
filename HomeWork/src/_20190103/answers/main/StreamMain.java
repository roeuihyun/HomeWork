package _20190103.answers.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import _20190103.answers.dto.PersonDto;

public class StreamMain {

	public StreamMain() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printDtoValues(PersonDto dto){
		if(dto != null){
			System.out.println("name : " + dto.getName() + " || age : " + dto.getAge());
		}else{
			System.out.println("0 count");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<PersonDto> list = new ArrayList<PersonDto>();
//		Stream<PersonDto> stream = list.stream();
		System.out.println("1 : Insert Sample");
		System.out.println("1.1 : Traditional Sample");
		list.add(new PersonDto("홍길동","20"));
		list.add(new PersonDto("김명자","21"));
		System.out.println("1.2 : Stream Sample");
		list = Stream.concat(list.stream(), Stream.of(new PersonDto("노의현","30"))).collect(Collectors.toList());
		list.stream().forEach(dto -> printDtoValues(dto));
		
		System.out.println("2 : Retive Sample");
		System.out.println("2.1 : Traditional Sample");
		for(int i = 0 ; i < list.size() ; i++){
			printDtoValues(list.get(i));
		}
		System.out.println("2.2 : Stream Sample");
		list.stream().forEach(dto -> printDtoValues(dto));
		
		System.out.println("3 : Update Sample");
		System.out.println("3.1 : Traditional Sample");
		for(int i = 0 ; i < list.size() ; i++){
			if("홍길동".equals(list.get(i).getName())){
				list.get(i).setName("구변경");
			}
		}
		for(int i = 0 ; i < list.size() ; i++){
			printDtoValues(list.get(i));
		}
		System.out.println("3.2 : Stream Sample");
		list.stream().filter(dto -> "구변경".equals(dto.getName())).forEach(dto -> dto.setName("신변경")); //;
		list.stream().forEach(dto -> printDtoValues(dto));
		
		System.out.println("4 : Delete Sample");
		System.out.println("4.1 : Traditional Sample");
		for(int i = 0 ; i < list.size() ; i++){
			if("노의현".equals(list.get(i).getName())){
				list.remove(i);
			}
		}
		for(int i = 0 ; i < list.size() ; i++){
			printDtoValues(list.get(i));
		}
		System.out.println("4.2 : Stream Sample");
		list.removeIf(dto -> "신변경".equals(dto.getName()));
		list.stream().forEach(dto -> printDtoValues(dto));		
	}

}
