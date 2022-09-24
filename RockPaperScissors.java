import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //scanner to get input
		while(true) {
			String[] rps = {"r","p","s"}; // list of rock paper scissors 
			
			String computerMove = rps[new Random().nextInt(rps.length)]; // Create random generator
			
			String playerMove; //declare player move 
			
			while(true) { // play again loop 
				System.out.println("Please enter your move('r' for Rock, 'p' for Paper, or 's' for Scissors)"); // ask for input
				playerMove = scanner.nextLine(); // read in player move
				if (playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + " is not a valid move."); // error message for invalid input 
			}	
				
			System.out.println("Computer played:" + computerMove); // display computer move
			
			
			//display results 
			if (playerMove.equals(computerMove)) {
				System.out.println("The game was a tie!!"); 
			}
			else if (playerMove.equals("r")) {
				if (computerMove.equals("p")){
					System.out.println("Paper beats rock! You lose!!");
				}
				else if (computerMove.equals("s")){
					System.out.println("Rock beats Scissors! You win!!");
				}
			}
			else if (playerMove.equals("p")) {
				if (computerMove.equals("s")){
					System.out.println("Scissors beats paper! You lose!!");
				}
				else if (computerMove.equals("r")){
					System.out.println("Paper beats rock! You win!!");
				}
			}
			else if (playerMove.equals("s")) {
				if (computerMove.equals("r")){
					System.out.println("Rock beats Scissors! You lose!!");
				}
				else if (computerMove.equals("p")){
					System.out.println("Scissors beats paper! You win!!");
				}
			}
			
		System.out.println("Play Again? (y/n)"); // ask if play again 
		String playAgain = scanner.nextLine(); // read input
		
		if (!playAgain.equals("y")) {
			break; // if play again not equal to yes then break loop
			}
		}
		scanner.close(); // Close scanner
	}
}
