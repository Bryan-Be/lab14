package co.grandcircus;

public class RandomPlayer extends Player {
	
	public RandomPlayer() {
		super();
	}
	

	public RandomPlayer(String name) {
		super(name);
		
	}


	@Override
	public Roshambo generateRoshambo() {
		
		int num = (int) (Math.random() * 3) + 1;
		
		switch(num) {
		case 1:
			return Roshambo.PAPER;			
		case 2:
			return Roshambo.SCISSORS;
		default:
			return Roshambo.ROCK;
				
		}
		
	}
}
