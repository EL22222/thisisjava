package sec07.exam01_enum;

import javax.sound.midi.Soundbank;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name 메소드 | 안의 실제 내용
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드 | 몇 번째 순서에 있는지
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드 | day2 기준으로 day1을 비교 | day1을 기준으로 day2 비교
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드 | valueOf 비슷한 문자열이 있는지 (equals랑 비슷)
		Week WeekDay = Week.valueOf("SUNDAY");
		 if(WeekDay == Week.SATURDAY || WeekDay == Week.SUNDAY) {
		 	System.out.println("주말 이군요");
		 	}else {
		 		System.out.println("평일 이군요");
		 	}
		 
		
/*		if(args.length == 1) {
			String strDay = args[0];
			Week WeekDay = Week.valueOf(strDay);
			if(WeekDay == Week.SATURDAY || WeekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");{	
				}  {
					System.out.println("평일 이군요");
				}
			}
		}
*/	
		 
		//values() 메소드 | for문이랑 같음 | 안에 있는 내용을 나열
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
