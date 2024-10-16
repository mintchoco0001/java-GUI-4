package G0528;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class E09_TooltipDelay extends JFrame {

	public E09_TooltipDelay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel cherryLabel = new JLabel(new ImageIcon("src/images/cherry.jpg"));
		cherryLabel.setToolTipText("체리 이미지 어때요");
		JLabel appleLabel = new JLabel(new ImageIcon("src/images/apple.jpg"));
		appleLabel.setToolTipText("사과이미지 어때요");
		c.add(cherryLabel);
		c.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(1000);
		m.setDismissDelay(1000);
		
		setSize(300, 300);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new E09_TooltipDelay();
	}
}
