package java08;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\csj.jpg"));
		f.setBackground(Color.YELLOW);
		f.setSize(569, 733);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("나를 눌러요");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("나를 누르셨군요!!!");
			}
		});
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		button.setToolTipText("내가 보이나요.");
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\csj2.jpg"));
		f.getContentPane().add(button_1);
		
		
		
		
		
		f.setVisible(true);
	}

}
