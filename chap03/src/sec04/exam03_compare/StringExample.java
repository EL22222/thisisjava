package sec04.exam03_compare;

public class StringExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");	// new String ���� ���� ���Ƶ� �ּҰ� �޶� �ٸ� ������ ���
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));	//equals�� �ּҰ� �޶� ���¸� ������ ���� ������ ���

	}

}
