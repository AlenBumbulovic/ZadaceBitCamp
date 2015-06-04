package homework;

public class Task4 {
	// prints the percentage
	public static double getPercentage(int N, int M){
		return (double) N * 100.0 / (double)M;
	}

	public static void main(String[] args) {
		System.out.println(getPercentage(25, 100));
	}

}
