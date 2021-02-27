package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String type = JOptionPane.showInputDialog("What flavor would you like the popcorn to be?");
		Popcorn bag = new Popcorn(type);
		Microwave wave = new Microwave();
		String min = JOptionPane.showInputDialog("How long do you want to cook the popcorn for?");
		int intmin = Integer.parseInt(min);
		wave.putInMicrowave(bag);
		wave.setTime(intmin);
		wave.startMicrowave();
		
	}
}
