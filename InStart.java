package inPut;

import java.util.Scanner;

public class InStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.println("내년의 나의 나이는: " + (age + 1));
		
		
	}

}
