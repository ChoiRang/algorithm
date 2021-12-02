package beakjun;

import java.util.Scanner;

public class Main1008 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();
		System.out.println(String.format("%.9f", a / b));	//소숫점 자르기 9까지
	}
}
