package homework;

public class Task1 {

	public static void main(String[] args) {
		System.out.println(convertToKelvins(-15));

	}
	/**
	 * Converts Celsius to Kelvins
	 * @param cel a number of Celsius degrees that needs to be converted in to Kelvins
	 * @return Celsius converted in to Kalvins
	 */
	public static double convertToKelvins(double cel){
		
		double kel = 273.15;
		
		return (cel + kel);
	}

}
