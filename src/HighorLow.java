import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber =  rand.nextInt(10) + 1;

        System.out.print("Enter your guess between (1-10): ");
        Scanner num = new Scanner(System.in);
        int playerGuess = Scanner.nextInt();
        if (playerGuess == randomNumber){
            System.out.println("Correct! You Win!");
        } else if (randomNumber > playerGuess) {
            System.out.println("Nope! The number is higher. Guess again.");
        }else {
            System.out.println("Nope! The number is lower. Guess again.");
        }


    }
}