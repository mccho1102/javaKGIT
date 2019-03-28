package java5;

import javax.swing.JOptionPane;

public class DlalogTest {

	public static void main(String[] args) {
		//입력 - 다이얼로그
		String name = JOptionPane.showInputDialog("당신의 이름을 입력:");
		//출력-콘솔
		System.out.println("당신이 입력한 이름은: " + name);
		String age = JOptionPane.showInputDialog("당신의 나이는: ");
		System.out.println("당신의 나이는: " + age);
		String c = JOptionPane.showInputDialog("당신의 소속을 입력:");
		System.out.println("당신의 소속은: " + c);

	}

}
