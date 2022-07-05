package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;						
		
		System.out.println("--------------------");
		x++;		// x에 먼저 수 대입하고 그 뒤에 하나씩 더함
		++x;		// x(10)이고 밑 줄에서 하나씩 더 함
		System.out.println("x=" + x);	    //x = 12
		
		System.out.println("--------------------");
		y --; //y=10이니까 --(하나씩 내려가서 8이 나오는 거)
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
