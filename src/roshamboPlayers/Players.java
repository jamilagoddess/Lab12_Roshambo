package roshamboPlayers;

public abstract class Players {

	//
	private String humanName;
	private String humanPlay;
	private String opponentName;
	private String opponentPlay;
	//private String playRoshambo;
	
	//getters and setters
	public String getHumanPlay() {
		return humanPlay;
	}
	/*public void sethumanPlay(String humanPlay) {
		this.humanPlay = humanPlay;
	}*/
	public String getHumanName() {
		return humanName;
	}
	public void setHumanName(String name) {
		this.humanName = name;
	}
	public String getOpponentName() {
		return opponentName;
	}
	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}
	public String getOpponentPlay() {
		return opponentPlay;
	}
	public void setOpponentPlay(String opponentPlay) {
		this.opponentPlay = opponentPlay;
	}
	
	//create abstract method
	public abstract String playRoshambo();

}


