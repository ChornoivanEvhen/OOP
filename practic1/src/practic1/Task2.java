package practic1;

import java.util.Scanner;

public class Task2 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = sc.nextInt();
		System.out.println("The next number for the number " + a + " is " + (a + 1) + ".");
		System.out.println("The previous number for the number " + a + " is " + (a - 1) + ".");
	}

}
