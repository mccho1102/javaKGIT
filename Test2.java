package java6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		
		double a = sc.nextDouble(); 
		a = 3.14;
		double b = (a*a*a) + ((double)4/3);
		
		System.out.println("���Ǵ� >> " + b);
		
	}
}
