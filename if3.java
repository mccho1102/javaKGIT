package ifTest;

import java.util.Scanner;

public class if3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("������");
		System.out.println("-----------------------");
		System.out.println("�޴��� ������.");
		System.out.println("-----------------------");
		System.out.println("1)¥��� 2)«�� 3)�쵿");
		System.out.println("-----------------------");
		System.out.print("����� ������?");
		int choice = sc.nextInt();
		System.out.print("�ֹ�������?");
		int count = sc.nextInt();
		
		int jajang = 4500;
		int jambong = 5000;
		int woodong = 5500;
		
		String food = null;
		int price = 0;
		
		if(choice == 1) {
			food = "¥���";
			price = jajang * count;
		}else if(choice == 2) {
			food = "«��";
			price = jambong * count;
		}else {
			food = "�쵿";
			price = woodong * count;
		}
			System.out.print("�����" + food + "�� �����ϼ̱���.");
			System.out.println("����� ������ �ݾ���" + price + "���Դϴ�.");
			System.out.println("---------------------------");
			
			//������ �ݾ��� 10000���̻��̸�, 2000�� ����.
			
			if(price >= 10000); {
				System.out.println("����� ������ �ݾ��� �����ص帮�ڽ��ϴ�.");
				System.out.println("����� ���� ������ �ݾ���" + (price-2000) + "���Դϴ�.");
			
					System.out.println("����� ���� ������ �ݾ���" + price + "���Դϴ�");
			}
			}
			
	}

