package homework;

public class Task1 {
	//task1 progrogram that prints a minimal number of two numbers
	public static int getMin2(int a, int b){
		if (a > b){
			return b;
		}else{
			return a;
		}
	}
	//return the smallest of three numbers
	public static int getMin3(int a, int b, int c) {
		if (c < getMin2(a, b)){
			return c;
		}else{
			return getMin2(a, b);
		}
		
		}
	

	public static void main(String[] args) {
		System.out.println(getMin3(12, 21, 4));

	}

}
