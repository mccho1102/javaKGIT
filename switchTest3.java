package switchTest;

import java.util.Date;
import java.util.Scanner;

public class switchTest3 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth();
		System.out.println("�̹�����? " + (month+1));
		
		switch (month+1) { //�Ǽ�x, ����(longX)
		case 2: 
			System.out.println("28��");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30��");
			break;
		default:
			System.out.println("31��");
			break;

		}
		
	}

}
