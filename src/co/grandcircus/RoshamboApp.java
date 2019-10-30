package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		Player opponent;
		
		System.out.println("Please Enter Your Name");
		String name = Validator.getString(scan, " ");

		int choice = Validator.getInt(scan, "Would you like to play against \n1. RandySav \n2. Rocky Rock");
		
		if(choice ==1) {
			opponent = new RandomPlayer("RandySav");
		}else {
			opponent = new RockPlayer("Rocky Rock");
		}

		while (cont.equalsIgnoreCase("y")) {
			
			String input = Validator.getString(scan, "Rock, Paper, or Scissors?");
			
			HumanPlayer user = new HumanPlayer(name);
			
			user.setUserChoice(input);
			
			Roshambo userRo = user.generateRoshambo();
			Roshambo opponentRO = opponent.generateRoshambo();
			
			System.out.println(name+": "+userRo);
			System.out.println(opponent.getName()+": "+opponentRO);
			
			Player winner = getWinner(opponent, user, userRo, opponentRO);
			if(winner == null) {
				System.out.println("Draw!!!");
			}else {
				System.out.println(winner.getName()+"Wins!!!");
			}
			
			System.out.println("");
			
			cont = Validator.getString(scan, "Play again? y to continue");

		}
		
		
		System.out.println("Thanks for playing?");

		scan.close();

	}
	public static Player getWinner(Player player1, Player player2, Roshambo r1, Roshambo r2 ) {
		/*
		 * Roshambo r1 = player1.generateRoshambo(); Roshambo r2 =
		 * player2.generateRoshambo();
		 */
		if(r1.equals("Rock")&& r2.equals("Scissors")|| r1.equals("Scissors")&& r2.equals("Paper")||
				r1.equals("Paper")&&r2.equals("Rock")) {
			return player1;
			}else if(r1.equals(r2)) {
				return null;
			}else {
				return player2;
			}
		
		
	}

}
