package sec08.exam01_method_declarartion;

public class Calculator {
	
	//�޼ҵ� = �Լ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

}