package java6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일값 입력 : ");
		
		double a = sc.nextDouble();
		double b = (a * 1.609);
		
		System.out.print("킬로미터는 >> " + b);
	}
}
