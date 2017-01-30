
/**
 * 7.06 Challenge Program: A program designed to calculate the value of Pi by simulating throwing darts at a dart board.
 * 
 * Mateo Delgadillo
 * November 23rd 2014
 */
import java.util.*;
import java.io.*;
public class Darts
{
    //how many times will the dart be thrown
    public static int numberOfTrials()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Times Darts are Thrown: ");
        int times = in.nextInt();
        //System.out.println(times);
        return times;
    }
    //generating random numbers (depending on the user input)
    public static double[] xPointsOnACircle(int times)
    {
        int counter = 1;
        double[] x = new double [times + 1];
        double[] xSquared = new double [times + 1];
        while (counter <= times)
        {
            x[counter] = (Math.random() * 2) - 1 ;
            //System.out.println("This is x" + counter + " " + x[counter]);
            xSquared[counter] = x[counter] * x[counter];
            
            counter++;
        }
        return xSquared;
    }
    // Y values
    public static double[] yPointsOnACircle(int times)
    {
        int counter = 1;
        double[] y = new double [times + 1];
        double[] ySquared = new double [times + 1];
        while (counter <= times)
        {
            y[counter] = (Math.random() * 2) - 1;
            //System.out.println("This is y" + counter + " " + y[counter]);
            ySquared[counter] = y[counter] * y[counter];
            
            counter++;
        }
        return ySquared;
    }
    //sorting out whether the point is within the boundery or not or not
    public static int withinBounds(int times, double[] xSquared, double[] ySquared)
    {
        int counter = 1;
        int yes = 0;
        int no = 0;
        boolean[] ifIn = new boolean [times + 1];
        while (counter <= times)
        {
            if(xSquared[counter] + ySquared[counter] <= 1)
            {
                ifIn[counter] = true;
                yes++;
            } 
            counter++;
        }
        //System.out.println(yes);
        return yes;
    }
    //equation to find pi
    public static double findPi(int times, int yes)
    {
        //System.out.println(times);
        //System.out.println(yes);
        double ratio = (double)(yes)/(double)(times);
        //System.out.print(ratio);
        double approxPi = (4 * ratio);
        return approxPi;
    }
    
    //final
    public static void main(String [] Args) throws IOException
    {
        int times = numberOfTrials();
        double [] xSquared = xPointsOnACircle(times);
        double [] ySquared = yPointsOnACircle(times);
        int yes = withinBounds(times, xSquared, ySquared);
        double approxPi = findPi(times, yes);
        System.out.println(approxPi);
    }
}
