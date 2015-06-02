package Homework;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// A program that tells us wich day it is an is it a work day
		// or weekend based on a number form 1 to 7 we input.
		System.out.println("Enter a number from 1 to 7!");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		switch (a) {
			case 1: System.out.println("It's monday, work day!");
				break;
			case 2: System.out.println("It's tuesday, work day!");	
				break;
			case 3: System.out.println("It's wednsday, work day!");	
				break;
			case 4: System.out.println("It's thursday, work day!");
				break;
			case 5: System.out.println("It's friday, work day!");
			    break;
			case 6: System.out.println("It's satrurday, weekend!");
				break;
			case 7: System.out.println("It's sunday, weekend!");	
				break;
			default: System.out.println("Enter a number from 1 to 7");	
				break;
		}
	}

}
