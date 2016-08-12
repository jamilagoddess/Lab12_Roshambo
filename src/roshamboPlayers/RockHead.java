package roshamboPlayers;

public  class RockHead extends Players {
	
	private String rock;

	
	public String getRock() {
		return rock = "rock";
	}
	public void setRock(String rock) {
		this.rock = rock;
	}

	@Override
	public String playRoshambo() {
		//System.out.println("rock");
		return getRock();
	}
}
	