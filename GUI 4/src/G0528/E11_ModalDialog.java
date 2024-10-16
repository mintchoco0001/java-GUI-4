package G0528;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame,title, true); 
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	public String getInput() {
		if(tf.getText().length() == 0) {
			return null;
		} else {
			return tf.getText();
		}
	}
}

public class E11_ModalDialog extends JFrame {
	private MyModalDialog dialog;
 	public E11_ModalDialog() {
		super("DialogEx2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn  = new JButton("Show Modal Dialog");

		dialog = new MyModalDialog(this, "Test Modal Dialog");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				
				String text = dialog.getInput();

				if(text == null) return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new E11_ModalDialog();
	}
}

