package inPut;

import java.util.Scanner;

public class InStart4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int age = sc.nextInt();
//		���̸� �Է¹޾Ƽ�,
//		18���̻��̸� �����Դϴ�.
//		18��̸��̸� �̼����Դϴ�.
		
		if(age >= 18) {
			//������ ���� ����
			System.out.println("����� �����̱���.");
		}else {
			//�ƴϸ� ���� ����
			System.out.println("����� �̼����̱���.");
			
		}
	
	
	}

}
