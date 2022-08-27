package practic1;

import java.util.Scanner;

public class Task3 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		float N, K;
		System.out.println("Кількість учнів");
		N = sc.nextInt();
		System.out.println("Кількість яблук");
		K = sc.nextInt();
		System.out.println("Яблук на учня: " + (Math.floor(K/N)));
	}

}
