package G0528;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class E13_JFileChooser extends JFrame {
	private JLabel imgla = new JLabel();

	public E13_JFileChooser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imgla);
		creatMenu();
		setSize(500, 500);
		setVisible(true);
	}

	private void creatMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openitem = new JMenuItem("Open");

		openitem.addActionListener(new OpenActionListener());
		fileMenu.add(openitem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}

	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;

		public OpenActionListener() {
			chooser = new JFileChooser();
		}

		// actionPerformed 메서드 이름 수정 및 JOptionPane.showMessageDialog 인자 수정
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF images", "jpg", "gif");
			chooser.setFileFilter(filter);

			int result = chooser.showOpenDialog(null);
			if (result != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "No file selected!", "Warning", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String filePath = chooser.getSelectedFile().getPath();
			imgla.setIcon(new ImageIcon(filePath));
		}
	}

	public static void main(String[] args) {
		new E13_JFileChooser();
	}
}
