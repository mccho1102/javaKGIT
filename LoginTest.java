package java5;

import javax.swing.JOptionPane;

public class LoginTest {

	public static void main(String[] args) {
		String id2 = "root";
		String pw2 = "abcd";
		
		String id = JOptionPane.showInputDialog("ID 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		
		if(id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 ok");
		}else {
			System.out.println("로그인 not");
		}
		
	}

}
