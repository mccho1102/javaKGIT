package java6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		
		double a = sc.nextDouble(); 
		a = 3.14;
		double b = (a*a*a) + ((double)4/3);
		
		System.out.println("부피는 >> " + b);
		
	}
}
