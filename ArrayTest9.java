import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest9 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���Ǳ׸�2");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton button = new JButton();
		ImageIcon icon = new ImageIcon("csj.jpg");
		button.setIcon(icon);
		
		f.add(button);
		
		
		
		f.setSize(1500, 1500);
		f.setVisible(true);
	}
}
