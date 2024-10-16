package G0528;

import javax.swing.*;
import java.awt.*;

public class E01_ColorFont extends JFrame {
	private MyPanel panel = new MyPanel();

	public E01_ColorFont() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400, 500);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawString("I Love Java~~", 30, 30);
			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How Much?", 30, 60);
			g.setColor(Color.magenta);
			for (int i = 0; i <= 5; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i * 10));
				g.drawString("This much!!", 30, 60 + i * 60);

			}
		}
	}

	public static void main(String[] args) {
		new E01_ColorFont();
	}

}
