package java5;

import javax.swing.JOptionPane;

public class DlalogTest {

	public static void main(String[] args) {
		//�Է� - ���̾�α�
		String name = JOptionPane.showInputDialog("����� �̸��� �Է�:");
		//���-�ܼ�
		System.out.println("����� �Է��� �̸���: " + name);
		String age = JOptionPane.showInputDialog("����� ���̴�: ");
		System.out.println("����� ���̴�: " + age);
		String c = JOptionPane.showInputDialog("����� �Ҽ��� �Է�:");
		System.out.println("����� �Ҽ���: " + c);

	}

}
