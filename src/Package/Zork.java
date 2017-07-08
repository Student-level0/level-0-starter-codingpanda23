package Package;

import java.util.Scanner;

public class Zork {
	public static void main(String[] args) {
		Scanner stuff = new Scanner(System.in);
		System.out.println(
				"So nice to have you joining us in this wonderfully wonderful land called Zork-y! My name is Director because I direct you on your journey.");
		System.out.println(
				"In this game, you use verbs to control what you do. For example, to walk south, say '' walk south .'' ");
		System.out.println(
				"I assume that you are a wonderfully wonderful person because this is a wonderfully wonderful land!!");
		String input = stuff.nextLine();
		System.out.println(
				"You are looking north and there is a  paper in your face. I would recommend taking it off your face. ");
		input = stuff.nextLine();
		if (input.equals("Take paper off")) {
			System.out.println("Now the paper is in your hands. It says:");
			System.out.println("So nice to have you joining us in this wonderfully wonderful land called Zork-y! "
					+ "Your guide's name is Director because he/she directs you on your journey. "
					+ "Zork-y may throw some obstacles in your way, but you will have the grandest time!"
					+ "-Sincerely," + "The Creator of Zork-y!!!!!");

		}
	}
}
