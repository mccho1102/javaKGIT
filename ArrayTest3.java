import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5];

		System.out.println("��ȭ ���� ���α׷��Դϴ�.");
		System.out.println("");
		while (true) {
			for (int i = 0; i < 5; i++) {
				System.out.print("   " + i + "�� ");
			}
			System.out.println();
			System.out.println("------------------------");

			// i = ��(2��)
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + "��: ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "   ");
				} // for
				System.out.println();
			} // for
			System.out.println("------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.print("����� x, ���Ŵ� y >>");
			String input = sc.next();
			if(input.equals("x")) {
				System.out.println("���� �ý����� �����մϴ�.");
				System.out.println("�ȳ��� ������.");
				break;
			}else {
			System.out.print("���� ���� �Է�: ");
			int row = sc.nextInt();
			System.out.print("���� ���� �Է�: ");
			int col = sc.nextInt();
			// 0�� 0�� > �̹� ���ŵ� �ڸ����� Ȯ��!
			if (seat[row][col] == 0) {
				seat[row][col] = 1;
				System.out.println("��û�Ͻ� �ڸ��� ���Ű� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�̹� ����ó���� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ��� �������ּ���.");
			}//else
		}//else
		}//while
	}//main
}//class
