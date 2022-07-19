import java.util.InputMismatchException;
import java.util.Scanner;

public class gameDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello! What is your name?");
		Scanner input = new Scanner(System.in);
		PlayerInfo player = new PlayerInfo(input.nextLine());
		boolean playAgain = true;
		
		while (playAgain) {
			RandomNumberGame game = new RandomNumberGame();
			System.out.println("Well, " + player.getName() + ", I am thinking of a number between 1 and 20.");
			do {
				int guess;
				while (true){
				System.out.println("Take a guess: ");
				try {
				guess = input.nextInt();
				if (guess > 20 || guess < 0) {
						System.out.println("Invalid Guess, outside of game range.");
					} else {
						game.isHigher(guess, player);
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please enter an Int.");
					input.nextLine();
					}
				}
			}while (game.isGameEnd());
			boolean endGameDecision = true;
			while(endGameDecision) {
				System.out.println("Would you like to play again? (Y or N)");
				input.nextLine();
				String playAgainTemp = input.nextLine();
				switch(playAgainTemp) {
				case "Y":
				case "y":
					endGameDecision = false;
					break;
				case "N":
				case "n":
					System.exit(0);
				default: System.out.println("Input not Accepted, try again. (Y/N)");
				}
			}
		}
	}
	
}
