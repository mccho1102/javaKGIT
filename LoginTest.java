package java5;

import javax.swing.JOptionPane;

public class LoginTest {

	public static void main(String[] args) {
		String id2 = "root";
		String pw2 = "abcd";
		
		String id = JOptionPane.showInputDialog("ID �Է�");
		String pw = JOptionPane.showInputDialog("pw �Է�");
		
		if(id.equals(id2) && pw.equals(pw2)) {
			System.out.println("�α��� ok");
		}else {
			System.out.println("�α��� not");
		}
		
	}

}
