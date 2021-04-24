package _07_binary_converter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_converter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField answer = new JTextField(10);
	JButton button = new JButton();

	public static void main(String[] args) {
		new binary_converter().run();
	}
	
	private void run() {
		
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		answer = new JTextField(20);
		button = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(answer);
		panel.add(button);
		button.setText("convert");
		button.addActionListener(this);
		panel.add(label);
		frame.setSize(new Dimension(400,100));
		
	}

	//void Method() {
	//	button.addActionListener((ActionListener) this);
	//}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str =convert(answer.getText());
		label.setText(str);
	}
}
