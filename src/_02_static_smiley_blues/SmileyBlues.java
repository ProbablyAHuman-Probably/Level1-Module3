package _02_static_smiley_blues;

import javax.swing.*;

public class SmileyBlues {
	void start() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		Smiley.setColor(Smiley.RED);
		Smiley smiley_01 = new Smiley();
		Smiley smiley_02 = new Smiley();
		Smiley smiley_03 = new Smiley();
		panel.add(smiley_01);
		panel.add(smiley_02);
		panel.add(smiley_03);
		frame.pack();
	}
}
