package switchTest;

import java.util.Scanner;

public class switchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���α׷��� ����� ������ Ÿ���� String�̴�.!!!!
		System.out.print("������ ������>>>> ");
		String input = sc.next();
		System.out.println("����� �Է°���" + input);
		
		switch (input) {
		case "sun":
			System.out.println("���ڸ� ì�ܰ���.");
			break;
		case "rain":
			System.out.println("����� ì�ܰ���.");
			break;
		default:
			System.out.println("����ũ�� ������.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
