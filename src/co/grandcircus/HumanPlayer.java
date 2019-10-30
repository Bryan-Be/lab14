package co.grandcircus;



public class HumanPlayer extends Player {
	public HumanPlayer() {
	}

	public HumanPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String userChoice;

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	public String getUserChoice() {
		return userChoice;
	}

	/*
	 * public Roshambo generateRoshambo(String input) { if(userChoice) {
	 * 
	 * } return null;
	 */
	/*
	 * public String getUserChoice() { return userChoice; }
	 * 
	 * public void setUserChoice(String userChoice) { this.userChoice = userChoice;
	 * }
	 */

	@Override
	public Roshambo generateRoshambo() {
		if(userChoice.equalsIgnoreCase("rock")) {
			return Roshambo.ROCK;
		}else if (userChoice.equalsIgnoreCase("scissors")) {
			return Roshambo.SCISSORS;
		}else {
			return Roshambo.PAPER;
		}
	}

	@Override
	public String toString() {
		return "HumanPlayer userChoice=" + userChoice;

	}

	/*
	 * Scanner scan = new Scanner(System.in); String X =
	 * " 1. Rock \n 2. Paper \n 3. Scissors "; scan.close();
	 */

}
