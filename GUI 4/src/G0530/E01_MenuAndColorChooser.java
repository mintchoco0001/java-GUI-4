package G0530;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class E01_MenuAndColorChooser extends JFrame {
	private JLabel label = new JLabel("Hello");

	public E01_MenuAndColorChooser() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie",Font.ITALIC, 30));
		c.add(label,BorderLayout.CENTER);
		createMenu();
		setSize(300,300);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenu = new JMenuItem("Color");
		JMenu file = new JMenu("Text");
		colorMenu.addActionListener(new MenuActionListener());
		file.add(colorMenu);
		mb.add(file);
		this.setJMenuBar(mb);
	}

	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.equals("Color")) {
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);
			
			if(selectedColor != null) {
				label.setForeground(selectedColor);
			}}
		}

	}

	public static void main(String[] args) {
		new E01_MenuAndColorChooser();
	}

}
