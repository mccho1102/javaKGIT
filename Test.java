package java6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도를 입력 : ");
		int a = sc.nextInt();
		int b = (5/9)+(a-32);
		System.out.print("섭씨온도는 >>> " + b + "도 이다.");
	}

}
