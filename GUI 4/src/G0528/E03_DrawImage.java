package G0528;

import javax.swing.*;
import java.awt.*;

public class E03_DrawImage extends JFrame {
	
	private MyPanel panel = new MyPanel();
	public E03_DrawImage(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,450);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("src/images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
	}
	public static void main(String[] args) {
		new E03_DrawImage();
	}

}
