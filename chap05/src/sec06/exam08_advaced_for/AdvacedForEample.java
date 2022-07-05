package sec06.exam08_advaced_for;

public class AdvacedForEample {

	public static void main(String[] args) {
		int[] scores= {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score :scores) {
			sum = sum + score;
		}
		System.out.println("Á¡¼ö ÃÑÇÕ = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("Á¡¼ö Æò±Õ = " + avg);

	}

}
