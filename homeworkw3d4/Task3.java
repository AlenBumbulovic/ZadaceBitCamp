package homework;

public class Task3 {
	//checks if a string contains numbers
	public static boolean hasNumbers(String str){
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57 ){
				return true;
			}						
		}
		 return false;
	}

	public static void main(String[] args) {
		System.out.println(hasNumbers("P4rametar"));
		

	}

}
