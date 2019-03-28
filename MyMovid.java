package java09;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyMovid {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 영화 앨범");
		f.setSize(400, 639);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("돈");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\csj\\java09\\src\\java09\\돈.png"));
		f.getContentPane().add(lblNewLabel);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("어스");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1)어스 이미지를 라벨에 icon으로 집어넣는다.
				ImageIcon icon = new ImageIcon("어스.png");
				lblNewLabel.setIcon(icon);
				
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("마블");
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		f.getContentPane().add(lblNewLabel_1);
		
		f.setVisible(true);
		
	}

}
