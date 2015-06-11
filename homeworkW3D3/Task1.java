package homework;

public class Task1 {

	public static void main(String[] args) {
		int[][] matrix = { {1, 3, 6}, {3, 5, 8}, {7, 3, 11} };
		int num = 3;
		
		System.out.println(repeatNum(matrix, num));

	}
	public static int repeatNum(int[][] matrix, int num){
		int counter = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(num == matrix[i][j]){
					counter++;
				}
			}
		}
		return counter;
	}

}
