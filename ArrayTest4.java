package array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String[] name = new String[5];
			int[] num = new int[5];
			
			//1. 5���� �л��鿡 ���� ������ �Է¹ް� �;��.
			//2. �̸� : �̸� + ����
			//3. ��ü �л��� ����� ���� �ͽ��ϴ�.
			
			for (int i = 0; i < 5; i++) {
				System.out.print("�̸��� �Է��ϼ���...");
				name[i] = sc.next();
				
				System.out.print("������ �Է��ϼ���...");
				num[i] = sc.nextInt();
			}
			for (int i = 0; i < num.length; i++) {
				System.out.println(name[i] + ":" + num[i]);
			}
			int sum = num[0] + num[1] + num[2] + num[3] + num[4];
			System.out.println("�л����� ����� : " + sum/5.0);
	}
	}
