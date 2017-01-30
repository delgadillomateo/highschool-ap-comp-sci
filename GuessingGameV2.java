
/**
 * GuessingGameV1: a simple guessing game implementing while loops.
 * 
 * @author Mateo Delgadillo
 * @version July 18th 2014
 */
import java.util.Scanner;

public class GuessingGameV2
{
   public static void main(String [] Args)
   {
       Scanner in = new Scanner(System.in);
       //intro, rules, etcc
       String intro = "Welcome to the guessing game!";
       String instructions = "To play, enter a number between 1 - 100";
       String goal = "The goal is to guess the number in fewest attempts";
       System.out.println(intro);
       System.out.println(instructions);
       System.out.println(goal);
       //setting up the parameter
       System.out.print("Enter the beginning range (any reasonable positive integer): ");
       int beginning = in.nextInt();
       System.out.print("Enter the end range (any reasonable positive integer): ");
       int end = in.nextInt();
       //number generator
       int guess = 101;
       double number1 = Math.random();
       double number2 = number1 * 10;
       int number = (int)(number2);
       int attempts = 0;
       
       
       while(guess != number)
        {
            System.out.print("Enter your guess: ");
            int userGuess = in.nextInt();
            
            if (userGuess > number)
                {
                    System.out.println("try guessing lower");
                } else if (userGuess < number)
                    {
                        System.out.println("try guessing higher");
                    }
            guess = userGuess;
            attempts ++;
        }
       System.out.println("Congratulations you've guessed correctly!");
       System.out.println("Your Score: " + attempts + " guesses");
   }
}
