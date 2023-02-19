import java.util.Random;//Random number generator
import java.util.Scanner;//Scanner for user input import

public class HighorLow {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(10) + 1;
        //System.out.println("Random number is " + randomNumber);

        int tryCount = 0;
        while(true) {
            System.out.println("Enter your guess (1-10):");

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            }
            else if(randomNumber > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again.");
            }
            else {
                System.out.println("Nope! The number is lower. Guess again.");
            }
        }



        scanner.close();

    }
}