package Package;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Give me a number.");
		int m = Integer.parseInt(n);
		for (int i = 2; i < m; i++) {
			if (m % i == 0) {
				JOptionPane.showMessageDialog(null,"Number not PRIME!");
				break;
			}
			else if (m % i == 1) {
				JOptionPane.showMessageDialog(null,"Number is PRIME!");
				break;
			}
		}
	}
	/*******************************************************************************
	 *    Copyright (c) The League of Amazing Programmers 2013-2017
	 *    Level 0
	 *    Prime or not
	 *    Duration=.00
	 *    Platform=Eclipse
	 *    Type=Teacher
	 *    Objectives=nested for loop, difficult logic
	 *    Optional=Yes
	 *    
	 ******************************************************************************/

	/**	
	 Write a program that takes a number from a user and tells them whether it is prime.		
	*/			


}

