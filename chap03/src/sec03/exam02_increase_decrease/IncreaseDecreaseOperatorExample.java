package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;						
		
		System.out.println("--------------------");
		x++;		// x�� ���� �� �����ϰ� �� �ڿ� �ϳ��� ����
		++x;		// x(10)�̰� �� �ٿ��� �ϳ��� �� ��
		System.out.println("x=" + x);	    //x = 12
		
		System.out.println("--------------------");
		y --; //y=10�̴ϱ� --(�ϳ��� �������� 8�� ������ ��)
		--y;
		System.out.println("y=" + y);     //
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("--------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("--------------------");
		z = ++x; y++;  // x = 04
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);	
	}

}
