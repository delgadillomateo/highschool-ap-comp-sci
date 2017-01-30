/**
 * Description for 5.04 Lottery project : Generates a random three digit number and asks the user to input the number,
 * then compares the user input to the number generated and outputs any matching number(s).
 * 
 * Mateo Delgadillo
 * August 6th 2014
 */
 
import java.util.Scanner;

public class LotteryV2
{
    public static void main(String[] args)
    {
         //declare and initialized variables and objects
         Scanner input = new Scanner(System.in);
        
         String lotteryNum = "";
         String userGuess = "";  
        
        
         //Generate a 3-digit "lottery" number composed of random numbers
         //Simulate a lottery by drawing one number at a time and 
         //concatenating it to the string
         //Identify the repeated steps and use a for loop structure
        
        
         //Compare the user's guess to the lottery number and report results
         // for loops = (any variables needed for the loop ;when to stop loop ;what to do after each loop )
         String winner= "";
         for(int i = 0; i < 3; i++)
         { 
             winner += (int)( 10 * Math.random() );
            }
         String firstNumberString1 = winner.substring(0,1);
         String secondNumberString1 = winner.substring(1,2);
         String thirdNumberString1 = winner.substring(2);
         int firstNumberString = Integer.parseInt(firstNumberString1);
         int secondNumberString = Integer.parseInt(secondNumberString1);
         int thirdNumberString = Integer.parseInt(thirdNumberString1);
         //Input: Ask user to guess 3 digit number
         System.out.println("Please enter your three numbers : " + winner);
         System.out.print("\tWinner: ");
         int userInput = input.nextInt();
         //user number evaluated
         String userNumber = Integer.toString(userInput);
         String firstDigit1 = userNumber.substring(0,1);
         String secondDigit1 = userNumber.substring(1,2);
         String thirdDigit1 = userNumber.substring(2);
         int firstDigit = Integer.parseInt(firstDigit1);
         int secondDigit = Integer.parseInt(secondDigit1);
         int thirdDigit = Integer.parseInt(thirdDigit1);
         
         
         if (firstNumberString == firstDigit && secondNumberString == secondDigit && thirdNumberString == thirdDigit)
            {
              System.out.println("Congratulations, all numbers match.");
           } else if (firstNumberString == firstDigit && secondNumberString == secondDigit)
               {
                  System.out.println("Congratulations, the first two numbers matched!");
               } else if (secondNumberString == secondDigit && thirdNumberString == thirdDigit)
                   {
                       System.out.println("Congratulations, the last two numbers matched matched!");
                   } else if (firstNumberString == firstDigit && thirdNumberString == thirdDigit)
                    {
                        System.out.println("Congratulations, the first and last numbers matched!");
                    } else if (firstNumberString == firstDigit)
                       {
                           System.out.println("Congratulations, the first number matched!");
                      } else if (secondNumberString == secondDigit)
                            {
                                System.out.println("Congratulations, the middle number matched!");
                            } else if (thirdNumberString == thirdDigit)
                                {
                                    System.out.println("Congratulations, the last number matched!");
                                } else 
                                    {
                                        System.out.println("Hmm, seems like the numbers don't match!");
                                    }
         
         
        

        
    } //end main
}//end class Lottery