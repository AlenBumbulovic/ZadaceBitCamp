package homework;

public class Task5 {
	// a program prints only the numbers from a string
	public static String getNumbersOnly(String str){
		String s = "";
		
		for (int i = 0; i < s.length(); i++){
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
				s += s.charAt(i);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(getNumbersOnly("alen1"));

	}

}
