package homework;

public class Task2 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, -2};
		System.out.println("The minimal number is " +getMin(arr));
		

	}
	/**
	 * Returns the smallest number of an array
	 * @param arr an array
	 * @return smallest number of an array
	 */
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

}
