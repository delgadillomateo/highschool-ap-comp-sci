/**
 * Description for 5.05 Dice Probability project
 *
 * @author Mateo Delgadillo
 * @version Auguest 12th
 *
 * All the code for this project is provided. Your task is to rearrange it and put it in the correct order.
 * The final program should be indented properly and each section documented.
 *
 */

import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
        Random randNum = new Random();
        Scanner in = new Scanner(System.in);      
        //Declare and initialize variables and objects
        int sum = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0; //Number of times sum of dice matches the current sum
        int die2 = 0;
        int die1 = 0;
        double probability = 0.0;
        match = 0;
        match++;
        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("Please enter the number of rolls: ");
        numSides = in.nextInt();
        System.out.print("Please enter the number of sides on a die: ");
        numRolls = in.nextInt();
        //Print heading for output table
        System.out.print("\n Sum of dice \t Probability \n");
        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************
        //Loop to increment through the possible sums of the dice
        if ( die1 + die2 == sum )
            {
                
            } // end if    
        //Loop to throw dice given number of times
        for( int roll  = 0; roll < numRolls; roll++ )
            {
                
            } //end for        
        //Randomly generate values for two dice
        die2 = randNum.nextInt( numSides ) +1;
        die1 = randNum.nextInt( numSides ) +1;        
        //Check if the sum of dice is equal to the given sum
        for( sum = 2; sum <= (numSides * 2); sum++ )
            {
                
            } //end for    
        //After all throws, calculate percentage of throws that resulted in the given sum
        probability = (double)match / numRolls * 100;    
        //Print results
        System.out.println("    " + sum + "\t\t" + probability );
        // Use the code below to complete the program. All statements are complete and when placed in the proper order, the program will work!
        // Be sure to indent code properly and include documation for each section..  
    
    } //end main
}//end class DiceProbability