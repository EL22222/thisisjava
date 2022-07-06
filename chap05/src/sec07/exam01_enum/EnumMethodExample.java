package sec07.exam01_enum;

import javax.sound.midi.Soundbank;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name �޼ҵ� | ���� ���� ����
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() �޼ҵ� | �� ��° ������ �ִ���
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() �޼ҵ� | day2 �������� day1�� �� | day1�� �������� day2 ��
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ� | valueOf ����� ���ڿ��� �ִ��� (equals�� ���)
		Week WeekDay = Week.valueOf("SUNDAY");
		 if(WeekDay == Week.SATURDAY || WeekDay == Week.SUNDAY) {
		 	System.out.println("�ָ� �̱���");
		 	}else {
		 		System.out.println("���� �̱���");
		 	}
		 
		
/*		if(args.length == 1) {
			String strDay = args[0];
			Week WeekDay = Week.valueOf(strDay);
			if(WeekDay == Week.SATURDAY || WeekDay == Week.SUNDAY) {
				System.out.println("�ָ� �̱���");{	
				}  {
					System.out.println("���� �̱���");
				}
			}
		}
*/	
		 
		//values() �޼ҵ� | for���̶� ���� | �ȿ� �ִ� ������ ����
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
