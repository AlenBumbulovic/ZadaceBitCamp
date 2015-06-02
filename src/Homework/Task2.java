package Homework;

import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("Input file ");
		String bitcamp = input.next();
		
		TextIO.readFile(bitcamp);
		 
		String sNum = TextIO.getWord();
		int num = Integer.parseInt(sNum);
		long factorial = 1;
		
		
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		
		System.out.println("Factorial of " + num + " is: " + factorial);
		
		input.close();
	} catch (NumberFormatException e) {
		
		System.out.println("Number is not the firs sign in this file!");
	} catch (IllegalArgumentException e) {
		 
		System.out.println("Entered file doesn't exist");
		
		}
	}

}
