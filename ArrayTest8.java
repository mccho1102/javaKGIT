import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest8 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의그림");
		JLabel l = new JLabel();
		f.add(l);
		
		
		
		ImageIcon icon = new ImageIcon("csj.jpg");
		l.setIcon(icon);
		
		
		
		f.setSize(800, 800);
		f.setVisible(true);
	}
}
