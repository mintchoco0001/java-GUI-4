package G0528;

import javax.swing.*;
import java.awt.*;

public class E02_DrawPaintPanel extends JFrame {
	
	private MyPanel panel = new MyPanel();
	public E02_DrawPaintPanel(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}
	}
	public static void main(String[] args) {
		new E02_DrawPaintPanel();
	}

}
