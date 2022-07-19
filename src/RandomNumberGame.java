import java.util.Random;

public class RandomNumberGame {
	
	public RandomNumberGame() {
		this.gameSetup();
	}
	
	
	private boolean gameEnd = true;
	public boolean isGameEnd() {
		return gameEnd;
	}
	
	
	private int targetNumber;
	public int getTargetNumber() {
		return targetNumber;
	}

	
	private int guessCounter = 1;
	public int getGuessCounter() {
		return guessCounter;
	}
	public void setGuessCounter(int guessCounter) {
		this.guessCounter = guessCounter;
	}
	
	
	public void gameSetup() {
		Random rand = new Random();
		this.targetNumber = 1 + rand.nextInt(21);
	}
	
	public void isHigher(int guess,PlayerInfo player) {
		if (this.guessCounter < 6) {	
			if (guess > this.targetNumber) {
				System.out.println("The guess is higher than the target number." + this.guessCounter);
				this.guessCounter += 1;
			} else if(guess < this.targetNumber) {
				System.out.println("The guess is lower than the target number." + this.guessCounter);
				this.guessCounter += 1;
			} else{
				System.out.println("Good job, " + player.getName() +", you guessed my number in " + this.getGuessCounter() + " tries!");
				this.gameEnd = false;
			} 
		} else {
			System.out.println("Unfortunately, you lost the game. You ran out of tries");
			this.gameEnd = false;
		}
	}

	

	
}
