package ifTest;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
//		�����!!!
		Scanner sc = new Scanner(System.in);
		System.out.println("�����!!!");
//		-----------------------------
		System.out.println("-----------------------");
//		�޴��� ������.
		System.out.println("�޴��� ������.");
//		----------------------------
		System.out.println("-----------------------");
//		1) ¥���, 2)«��, 3)�쵿
		System.out.println("1)¥��� 2)«�� 3)�쵿");
//		-----------------------------
		System.out.println("-----------------------");
//		����� ������? 1
		System.out.print("����� ������?");
		int choice = sc.nextInt();
		
		String food = null;
		
		if(choice == 1) {
			food = "¥���";
		}else if(choice == 2) {
			food = "«��";
		}else {
			food = "�쵿";
			
			System.out.print("�����" + food + "�� �����ϼ̱���.");
			}
//		����� ¥����� �ֹ��ϼ̽��ϴ�.
	}

}
