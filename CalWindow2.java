package java08;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalWindow2 {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField result;
	private static JTextField result2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().setBackground(Color.BLUE);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("숫자1>>");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label = new JLabel("숫자2>>");
		label.setForeground(Color.RED);
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBackground(Color.WHITE);
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 26));
		n2.setColumns(10);
		f.getContentPane().add(n2);
		
		JButton add = new JButton("빼기 연산");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼을 누르셨군요.!!!!");
				String num1 = n1.getText(); //입력값 가지고 옴.
				String num2 = n2.getText(); //입력값 가지고 옴.
				System.out.println("입력한 숫자가1: " + num1);
				System.out.println("입력한 숫자가2: " + num2);
				
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sum = n11 - n22;
				System.out.println("두수를 뺀 값은" + sum);
				result.setText(sum + "");
				
			}
		});
		add.setForeground(Color.LIGHT_GRAY);
		add.setBackground(Color.MAGENTA);
		add.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(add);
		
		result = new JTextField();
		result.setForeground(Color.RED);
		result.setBackground(Color.YELLOW);
		result.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnNewButton = new JButton("더하기 연산");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼을 누르셨군요.!!!!");
				String num1 = n1.getText(); //입력값 가지고 옴.
				String num2 = n2.getText(); //입력값 가지고 옴.
				System.out.println("입력한 숫자가1: " + num1);
				System.out.println("입력한 숫자가2: " + num2);
				
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sum = n11 + n22;
				System.out.println("두수를 뺀 값은" + sum);
				result2.setText(sum + "");
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btnNewButton);
		
		result2 = new JTextField();
		result2.setForeground(Color.LIGHT_GRAY);
		result2.setBackground(Color.GREEN);
		result2.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(result2);
		result2.setColumns(10);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\cal.jpg"));
		f.setTitle("나의계산기");

		f.setSize(317, 656);
		f.setVisible(true);
	}

}
