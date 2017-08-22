package Package;

import javax.swing.JOptionPane;

public class NumbersOfNames {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("ENter A NAme!");
	String number = JOptionPane.showInputDialog("GimmE A NUmber!");
	int number2 = Integer.parseInt(number);
	for (int i = 0; i < number2; i++) {
		System.out.println(name);
	}
	
}
}
