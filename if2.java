package ifTest;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
//		저기요!!!
		Scanner sc = new Scanner(System.in);
		System.out.println("저기요!!!");
//		-----------------------------
		System.out.println("-----------------------");
//		메뉴를 고르세요.
		System.out.println("메뉴를 고르세요.");
//		----------------------------
		System.out.println("-----------------------");
//		1) 짜장면, 2)짬뽕, 3)우동
		System.out.println("1)짜장면 2)짬뽕 3)우동");
//		-----------------------------
		System.out.println("-----------------------");
//		당신의 선택은? 1
		System.out.print("당신의 선택은?");
		int choice = sc.nextInt();
		
		String food = null;
		
		if(choice == 1) {
			food = "짜장면";
		}else if(choice == 2) {
			food = "짬뽕";
		}else {
			food = "우동";
			
			System.out.print("당신은" + food + "을 선택하셨군요.");
			}
//		당신은 짜장면을 주문하셨습니다.
	}

}
