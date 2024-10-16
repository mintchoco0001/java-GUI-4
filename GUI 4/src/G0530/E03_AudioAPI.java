package G0530;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.event.*;

public class E03_AudioAPI extends JFrame {
	private JButton btn[] = { new JButton("play"), new JButton("stop"), new JButton("play again") };
	private Clip clip;

	public E03_AudioAPI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyActionListener ai = new MyActionListener();
		for (int i = 0; i < btn.length; i++) {
			c.add(btn[i]);
			btn[i].addActionListener(ai);
		}
		setVisible(true);
		loadAudio("src/audio/애국가1절.wav");
	}

	private void loadAudio(String pathName) {
		try {
			clip = AudioSystem.getClip();
			File audioFile = new File(pathName);
			AudioInputStream audiostream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audiostream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "play":
				clip.start();
				break;
			case "stop":
				clip.stop();
				break;
			case "play again":
				clip.setFramePosition(0);
				clip.start();
				break;

			}

		}
	}

	public static void main(String[] args) {
		new E03_AudioAPI();
	}

}
