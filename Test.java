package java6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȭ���µ��� �Է� : ");
		int a = sc.nextInt();
		int b = (5/9)+(a-32);
		System.out.print("�����µ��� >>> " + b + "�� �̴�.");
	}

}
