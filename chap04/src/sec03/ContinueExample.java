package sec03;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(1%2 != 1) {
				continue;
			}
			System.out.println(i);
		}

	}

}
