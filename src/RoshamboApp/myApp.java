package RoshamboApp;

import java.util.Scanner;

import roshamboPlayers.RockHead;
import roshamboPlayers.SmartySmart;

public class myApp {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		RockHead rockHead = new RockHead();
		SmartySmart smartySmart = new SmartySmart();

		String humanName = "";
		String opponentName = "";
		String humanPlay = "";
		String choice = "yes";

		System.out.println("Welcome to Rock Paper Scissors!\nPlease enter your name: ");
		humanName = scan1.nextLine();

		System.out.println("Hi, " + humanName + "! Would you like to play against RockHead or SmartySmart? ");
		opponentName = scan1.nextLine();

		System.out.println("Awesome! " + opponentName + " is ready to go.");

		// insert while loop here for continued play
		//PROBLEM: returns "rock" immediately after user input; does not return value of computer player
		if (opponentName.equalsIgnoreCase("rockHead")) {
			while (choice.equalsIgnoreCase("yes")) {
				System.out.println("Rock, Paper or Scissors?");
				humanPlay = scan1.nextLine();
				System.out
						.println(humanName + ":\t\t" + humanPlay + "\n" + opponentName + ":\t" + rockHead.playRoshambo());
				System.out.println("Would you like to play RockHead again? (yes or no): ");
				choice = scan1.nextLine();
			}
			if (choice.equalsIgnoreCase("no")) {
				System.out.println("Wow, that RockHead sure is consistent. Hope you had fun playing!");
				scan1.close();
			}
		} if (opponentName.equalsIgnoreCase("smartySmart")) {
			while (choice.equalsIgnoreCase("yes")) {
				System.out.println("Rock, Paper or Scissors?");
				humanPlay = scan1.nextLine();
				System.out.println(
						humanName + ":\t" + humanPlay + "\n" + opponentName + ":\t" + smartySmart.playRoshambo());
				System.out.println("Would you like to play SmartySmart again? (yes or no): ");
				choice = scan1.nextLine();
			}
			if (choice.equalsIgnoreCase("no"));
			System.out.println("You really gave SmartySmart a run for her money. Thanks for playing!");
			scan1.close();
		}
	}
}
// insert for loop to compare user input and computer player result
