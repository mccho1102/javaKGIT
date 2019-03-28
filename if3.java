package ifTest;

import java.util.Scanner;

public class if3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("영수증");
		System.out.println("-----------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("-----------------------");
		System.out.println("1)짜장면 2)짬뽕 3)우동");
		System.out.println("-----------------------");
		System.out.print("당신의 선택은?");
		int choice = sc.nextInt();
		System.out.print("주문수량은?");
		int count = sc.nextInt();
		
		int jajang = 4500;
		int jambong = 5000;
		int woodong = 5500;
		
		String food = null;
		int price = 0;
		
		if(choice == 1) {
			food = "짜장면";
			price = jajang * count;
		}else if(choice == 2) {
			food = "짬뽕";
			price = jambong * count;
		}else {
			food = "우동";
			price = woodong * count;
		}
			System.out.print("당신은" + food + "을 선택하셨군요.");
			System.out.println("당신이 지불한 금액은" + price + "원입니다.");
			System.out.println("---------------------------");
			
			//내야할 금액이 10000원이상이면, 2000원 할인.
			
			if(price >= 10000); {
				System.out.println("당신이 내야할 금액을 할인해드리겠습니다.");
				System.out.println("당신이 최종 내야할 금액은" + (price-2000) + "원입니다.");
			
					System.out.println("당신이 최종 내야할 금액은" + price + "원입니다");
			}
			}
			
	}

