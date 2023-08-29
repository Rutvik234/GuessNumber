package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(100+1);
		int tryCount = 0;
		System.out.println(randomNumber);
		
		while(true) {
			System.out.println("Enter Your Guess (1 to 100)");
			int guessNumber = sc.nextInt();
			tryCount++;
			
			if (guessNumber==randomNumber) {
				System.out.println("Correct! you are win");
				System.out.println("You Guess the number in "+tryCount+" Iteration");
				break;
			}
			else if(guessNumber>randomNumber) {
				System.out.println("Nope! The number is higer. Guess again");
			}
			else if (guessNumber<randomNumber) {
				System.out.println("Nope! The number is lower. Guess again");
			}
		}
	}
}
