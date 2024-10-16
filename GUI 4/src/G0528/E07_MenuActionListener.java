package G0528;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class E07_MenuActionListener extends JFrame {
	public JLabel imglabel = new JLabel();

	public E07_MenuActionListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(300, 300);
		setVisible(true);
	}

	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = { "Load", "Hide", "ReShow", "Exit" };
		JMenu screenMenu = new JMenu("Screen");

		for (int i = 0; i < itemTitle.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					System.out.println(cmd);
					switch (cmd) {
					case "Load":
						if (imglabel.getIcon() != null)
							return;						
						imglabel.setIcon(new ImageIcon("./images/img.jpg"));
						break;
					case "Hide":
						imglabel.setVisible(false);
						break;
					case "ReShow":
						imglabel.setVisible(true);
						break;
					case "Exit":
						System.exit(0);
						break;
					}
				}
			});
			screenMenu.add(menuItem[i]);
		}

		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));

		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new E07_MenuActionListener();
	}
}
