package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			String[] name = new String[3];
			int[] num = new int[3];
			
			for (int i = 0; i < 3; i++) {
				System.out.print("���������� �Է��ϼ��� :");
				name[i] = sc.next();
			
				System.out.print("���������� �Է��ϼ��� :");
				num[i] = sc.nextInt();
			}
			for (int i = 0; i < num.length; i++) {
				System.out.println(name[i] + ":" + num[i]);
			}
			int sum = num[0] + num[1] + num[2];
			System.out.println("�������� ����� : "+ sum/3.0);	
			// �ٽ� ���� �̤�
	}
	}
