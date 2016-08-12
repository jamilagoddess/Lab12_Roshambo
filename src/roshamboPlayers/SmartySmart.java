package roshamboPlayers;

import java.util.Random;

public class SmartySmart extends Players {

	// private String[] choice = {"rock", "paper", "scissors"};
	// private String random;
	// private String randomChoice;
	// private Random x;

	// create new random object and create method
	// public String getRandom() {
	// return random.toString();
	// return result = random.toString();
	// }
	// public void setRandom(String[] random) {
	// String randomChoice = (choice[new Random().nextInt(choice.length)]);
	// this.random = randomChoice;
	/*
	 * Random x = new Random(); int index = x.nextInt(choice.length); this.x =
	 * x;
	 */
	// }
	public String getRandomValue() {
		String randomValue = "";

		Random rand = new Random();
		int randomNum = rand.nextInt(3) + 1;
		if (randomNum == 1) {
			randomValue = "Rock";
		} else if (randomNum == 2) {
			randomValue = "Paper";
		} else {
			randomValue = "scissors";
		}
		return randomValue;
	}

	@Override
	public String playRoshambo() {
		// return random.toString();
		return getRandomValue();
	}
}
