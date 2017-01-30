/**
 *  7.04 Weight project: A program that calculates your weight on each planet in the solar system.
 *
 * Mateo Delgadillo
 * November 23rd 2014
 */
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WeightOnPlanetsV1
{
    // write static methods here
    // Note: formula for finding weight on a planet:  Earth weight divided by Gravity constant times surface gravity
    public static double[] getGravity() throws IOException
    {
        Scanner inFile = new Scanner(new File("gravity.txt"));
        double[] surfaceGravity = new double[9];
         for (int index = 0; index < 9; index++)
         {
             surfaceGravity[index] = inFile.nextDouble();
         }
        return surfaceGravity;
    }
    
    public static double[] calcWeight(double earthWeight, double gravity[])
    {
        double newWeight[] = new double[9];
        for (int index = 0; index < 9; index++)
         {
             newWeight[index] = (earthWeight * gravity[index]);
         }
        return newWeight;
    }

    public static void printResults(String[] names, double[] surfaceGravity, double[] newWeight)
    {
        System.out.printf("%33s","My Weight on the Planets");
        System.out.printf("\n%8s", "Planet");
        System.out.printf("%14s", "Gravity");
        System.out.printf("%18s", "Weight (lbs)");
        System.out.printf("\n%s", "------------------------------------------");
        for (int index = 0 ; index < 9; index++)
        {
            System.out.printf("\n%8s", names[index]);
            System.out.printf("%13.2f", surfaceGravity[index]);
            System.out.printf("%16.2f", newWeight[index]);
        }
        
    }
    
    public static void main(String[] args)throws IOException
    {

        // Extension idea... instead of hard codeing the weight, you may propt the user for input.

        double earthWeight = 100.0; // initalize Earth weight to 100 lbs.

        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        double[] gravity = getGravity();                            // static method you write
        double[] weight = calcWeight(earthWeight, gravity);  // static method you write
        printResults(names, gravity, weight);                   // static method you write

    } //end main
}//end class