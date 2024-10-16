package G0528;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class E12_OptionPane extends JFrame {
	public E12_OptionPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500, 200);
		c.add(new MyPanel(), BorderLayout.NORTH);
		setVisible(true);
	}

	class MyPanel extends Panel {
		private JButton input = new JButton("Input Name");
		private JTextField tf = new JTextField(10);
		private JButton confirm = new JButton("Confirm");
		private JButton msg = new JButton("Message");

		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(input);
			add(confirm);
			add(msg);
			add(tf);
			input.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					if (name != null) {
						tf.setText(name);
					}
				}
			});

			confirm.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "계속 할 것입니까", "Confirm", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.CLOSED_OPTION) {
						tf.setText("Just Closed without Selection");
					} else if (result == JOptionPane.YES_OPTION) {
						tf.setText("Yes");
					} else {
						tf.setText("No");
					}
				}
			});

			msg.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}

	public static void main(String[] args) {
		new E12_OptionPane();
	}
}
