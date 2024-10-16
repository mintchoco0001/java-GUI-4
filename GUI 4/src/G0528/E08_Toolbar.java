package G0528;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class E08_Toolbar extends JFrame {
	public Container contentpane;

	public E08_Toolbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createTollBar();
		contentpane = getContentPane();
		setSize(300, 300);
		setVisible(true);
	}

	public void createTollBar() {
		JToolBar bar = new JToolBar("Kitae Menu");
		bar.setBackground(Color.white);
		JButton newbtn = new JButton("New");
		newbtn.setToolTipText("파일을 생성합니다");
		bar.add(newbtn);

		JButton openbtn = new JButton(new ImageIcon("src/images/open.jpg"));
		openbtn.setToolTipText("파일을 엽니다.");
		bar.add(openbtn);
		bar.addSeparator();

		JButton savebtn = new JButton(new ImageIcon("src/images/save.jpg"));
		savebtn.setToolTipText("파일을 저장합니다.");
		bar.add(savebtn);

		bar.add(new JLabel("search"));

		JTextField tf = new JTextField("text field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요");
		bar.add(tf);
		contentpane.add(bar);

	}

	public static void main(String[] args) {
		new E08_Toolbar();
	}
}
