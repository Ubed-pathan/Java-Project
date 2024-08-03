import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        Random random =new Random();
        int NumberGuess;
        NumberGuess = random.nextInt(100)+1;
        int tries=0;
        int guess=0;
        boolean win = false;

        while (!win) {
            System.out.println("Enter your guess (1-100)");
            guess=kb.nextInt();
            tries++;

            if (guess < 1 || guess >100)
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
            else if(guess < NumberGuess)
                System.out.println("Guess is to low");
            else if(guess > NumberGuess)
                System.out.println("Guess is to high");
            else 
                win=true;

        }
        System.out.println("Congratulations! You guessed the number in " + tries + " tries.");
        kb.close();
    }
    
}
