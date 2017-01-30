/**
 * Annual Climate description: A Program designed to provide the monthly temperatures and the precipitation of each month 
 * of a specific city. The temperature and precipitation is measured in fahrenheit or celsius and inches or centimeters, respectively.
 *
 * @author: Mateo Delgadillo
 * @version: September 27th 2014
 *
 */

import java.util.Scanner;
import java.util.Formatter;

class AnnualClimate2
{
    public static void main (String [ ] args)
    {

        //Declare and intialize variables - programmer to provide initial values
        Scanner in = new Scanner(System.in);
        String city = "Miami";      
        String state = "Florida";

        String month [] ={"Jan", "Feb" , "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double temperature [] ={68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9}; //initialize with Fahrenheit values
        double precipitation [] ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};  //initialize with inches values
        // try Daytona Beach... 58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8
        //precipitation values:   3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7
        String tempLabel = "F";   //initialize to F
        String precipLabel = "(in)"; //initialize to cm


        //INPUT - ask user for temp and preciptation scale choice
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempChoice = in.next();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String precipChoice = in.next();


        //PROCESSING - convert from F to C and in to cm based on user's choices
        // remember 5/9 = 0, 5.0/9 = .5555

        if(tempChoice.equalsIgnoreCase("C"))
        {
            tempLabel="(C)";
            for( int index = 0; index < temperature.length; index++)
            {
                temperature[index] = (temperature[index]-32) * (5.0/9.0);
            }

        } else
            {
                tempLabel="(F)";
            }

        //Convert in values to cm; replace the current values in precipitation
        if(precipChoice.equalsIgnoreCase("c"))
        {
            precipLabel="(cm)";
            int index2 = 0;
            while ( index2 < 12)
            {
                precipitation[index2] = precipitation[index2] * 2.54;
                index2++;
            }
        }

        //OUTPUT - print table using printf to format and align data

        System.out.println();
        System.out.printf("%30s\n","Climate Data");
        System.out.printf("%35s\n\n","Location: " + city +", " + state);
        System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.println();
        System.out.println("***************************************************");
        for (int counter = 0; counter < 12; counter++)
        {
            System.out.printf("%4s %18.4s %s %18.4s %s",month[counter],temperature[counter],tempLabel,precipitation[counter],precipLabel + "\n");
            //System.out.printf("%5s %18s %s %18s %s", month[counter],temperature[counter],precipitation[counter]);
          }
        System.out.printf("***************************************************");
        System.out.println();
        // temp and precipitation averages
        double tempAverage = 0;
        double precipAverage = 0;
        for (int index = 0; index < 12; index++)
         {
             tempAverage += temperature[index];
             precipAverage += precipitation[index];
         }
        tempAverage = tempAverage / 12;
        precipAverage = precipAverage / 12;
        System.out.printf("%16s %2.4s %14s %2.4s", "Average:", tempAverage + tempLabel, "Annual:", precipAverage + precipLabel);
          
    }//end main
}//end Annual Climate