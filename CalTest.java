package java5;

import javax.swing.JOptionPane;

public class CalTest {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("����1 �Է�");
		String num2 = JOptionPane.showInputDialog("����2 �Է�");
		//parseInt �м�
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null, n1 + n2);

		int result= JOptionPane.showConfirmDialog(null, n1 + n2);
		System.out.println(result);
		
	}

}
