package Package;

import javax.swing.JOptionPane;

public class AgeForMovies {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int user = Integer.parseInt(age);
	if (user >= 18) {
		JOptionPane.showMessageDialog(null, "You Can Watch All Of The Moovies!");
	}
	if (user <=17) {
		JOptionPane.showMessageDialog(null, "You're Too Little To Watch By Yourself!");
	}
	if (user < 0) {
		JOptionPane.showMessageDialog(null, "WHAT ARE YOU THINKING! YOU CAN'T LIVE IN THE NEGATIVES!!");
	}
}
}
