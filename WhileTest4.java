package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		// ��Ʈ�� + ����Ʈ + f (�ڵ�����)
		// � ��: Random
		Random random = new Random();

		int target = random.nextInt(100); // int�� �ƹ��ų� ������ִ°�

		Scanner sc = new Scanner(System.in);
		int count = 0; //try�� Ƚ��
		while (true) {
			count++;
			// ��� �Է¹ް�,
			System.out.print("������ ���ڸ� �Է�.");
			int input = sc.nextInt();
			// �Է°��� �������� Ȯ��.
			if (input == target) {
				System.out.println("�����Դϴ�. �����մϴ�!!!");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
				if(input > target) {
					System.out.println("���������� �Է����ּ���...");
				}else {
					System.out.println("�� ū���� �Է����ּ���.");
				}//else
			}//else
		}//while
	System.out.println("����� �õ�Ƚ����:" + count +"ȸ �Դϴ�.");
	}//main
}//class
