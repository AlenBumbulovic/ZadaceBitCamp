package weekend3;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input hours");
		int N = input.nextInt();
		switchMethod(N);
	}
	
	public static void switchMethod(int N){
		switch (N){
		case 9:
		case 10:
		case 11:
		case 12:
		case 13: System.out.println("Lectures");
		break;
		case 14:
		case 15:
		case 16:
		case 17: System.out.println("Exercises");
		break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
		case 1: System.out.println("Homework");
		break;
		default: System.out.println("Sleep time");
		break;
		}
	}
}
