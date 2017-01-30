/**
 * BottleCapPrize: A program designed to use the Monte Carlo method of sampling to estimate the avergae number of bottles
 * of e-boost one would have to drink to win a prize. There is a 1 in 5 chance that a bottle cap will have a prize.
 * 
 * Mateo Delgadillo
 * August 23rd 2014 (Revised on September 12th)
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
public class BottleCapPrize
{
   public static void main(String [] Args) throws IOException
   {
       Scanner in = new Scanner (System.in);
       
       String welcome = "Welcome to the Bottle Cap Prize Simulator";
       
       PrintWriter outFile = new PrintWriter(new File("Results.txt")); //creating text file
                             
       System.out.print("How many trials? ");   //User input 
       int x = in.nextInt();                    //trials
       int attempts = 0;                        //setting counter (attempts)
       int winningNum = 0;
       for (int trial = 1; trial <= x ; trial++ )
        {
            
            while (winningNum == 0)
            {
                Random ranNum = new Random();
                Double selectedNum = ranNum.nextDouble();
                
                if (selectedNum < .2)
                {
                    outFile.println("It takes approximately " + attempts + " tries to find a winning cap");
                    winningNum=1;
                }
                
                //System.out.println(ranNum1);
                
                attempts ++;
            }
            
        }
       double ranNum1 =(double)(((int) Math.random() * 5)/10);
       
       outFile.close ();
       int numberofvalues; //this is equivalent to the number of trials 
       int sum =0;
       int value;
       // now read things from outfile with a while loop and add all the values up, then divide by the total amount of values
       
       /**
        * pseudo loop code
        * 
        * numberofvalues=0;
        * 
        * while(text file has next line)
        * {
        *     numberofvalues++;// counts values added
        *     
        *     value=nextline;
        *     sum= sum + value;
        *     
        *  }
        *  double average = sum/numberofvalues;
        */
       
       
    }
}