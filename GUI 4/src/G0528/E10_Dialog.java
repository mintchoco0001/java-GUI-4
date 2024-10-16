package G0528;

import java.awt.event.*;
import javax.swing.*;

import java.awt.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okbtn = new JButton("OK");

	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okbtn);
		setSize(200, 100);
		okbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}

public class E10_Dialog extends JFrame {
	private MyDialog dialog;

	public E10_Dialog() {
		super("Dialog 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog");
		dialog = new MyDialog(this, "Test Dialog");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new E10_Dialog();
	}
}
