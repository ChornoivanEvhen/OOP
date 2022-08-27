package practic1;

import java.util.Scanner;

public class Task1 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;
		System.out.println("Перший катет");
		a = sc.nextInt();
		System.out.println("Другий катет");
		b = sc.nextInt();
		System.out.println("Гіпотенуза: " + (Math. sqrt(a*a + b*b)));
	}

}
