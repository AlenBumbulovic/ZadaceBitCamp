package homework;

public class Task3 {

	public static void main(String[] args) {
		
		System.out.println(getCountOfNumbers("413nn"));
		

	}
	/**
	 * Counts the number of digits in a string[]
	 * @param s a string
	 * @return the number of digits in a string
	 */
	public static int getCountOfNumbers(String s){
		int counter = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= 48 && 57 >= s.charAt(i)){
				counter++;
			}
		}
			return counter;
	}
	

}
