package co.grandcircus;

public class RockPlayer extends Player {
	 
	public RockPlayer() {
		
	}
	
	
	public RockPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}@Override
	public String toString() {
		return "Rocky" + getName();
	}

}
