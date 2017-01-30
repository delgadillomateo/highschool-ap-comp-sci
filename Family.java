/**
 * Family: A program that aims to display the total probability of having a 
 * family with two children (e.g. two girls, two boys or one of each) based 
 * on the size entered by the user.
 * 
 * @author Mateo Delgadillo
 * @version July 22th 2014
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        //counters
        double twoBoys = 0;            //establishing the variables
        double twoGirls = 0;           //they will count themselves
        double oneEach = 0;
       
        String combinations = "";
        
        Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        while (inFile.hasNext())
        {
            combinations = inFile.nextLine( );
            
            if (combinations.equalsIgnoreCase("GG"))
                {
                    twoGirls++;
                } else if (combinations.equalsIgnoreCase("BB"))
                    {
                        twoBoys++;
                    } else if (combinations.equalsIgnoreCase("GB"))
                        {
                            oneEach++;
                        } else if (combinations.equalsIgnoreCase("BG"))
                            {
                                oneEach++;
                            }
        }
        // PERCENT CALCULATIONS
        double total = twoBoys + twoGirls + oneEach;
        
        double boysPer1 = twoBoys / total;
        double girlsPer1 = twoGirls / total;
        double bothPer1 = oneEach /total;
        double boysPercent = (double)(int)(boysPer1 * 100);
        double girlsPercent = (double)(int)(girlsPer1 * 100);
        double bothPercent = (double)((int)((bothPer1 * 1000))) /10;
        inFile.close();
        System.out.println("total sample size: " + (int)total);
        System.out.println("Two boys: " + (int)twoBoys + " or " + boysPercent + " % chance");
        System.out.println("Two girls: " + (int)twoGirls + " or " + girlsPercent + " % chance");
        System.out.println("One Boy and One Girl: " + (int)oneEach + " or " + bothPercent + " % chance");
        
    }
}
