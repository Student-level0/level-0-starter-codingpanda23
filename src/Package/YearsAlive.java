package Package;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(answer);
		for (int i = 2017 - age; i <= 2017; i++) {
			System.out.println(i);
		}
	}
}
