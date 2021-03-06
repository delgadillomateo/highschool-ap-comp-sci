
/**
 * HeatIndex: A program that calculates the monthly heat index for a specific city (specifically Key West for demonstartional purposes)
 * 
 * @author Mateo Delgadillo 
 * @version October 4th 2014
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
        //initialize and declare vars

        PrintWriter outFile = new PrintWriter(new File("HeatIndex.txt"));
        
        String location = "Key West, Florida";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


        //INPUT - read in data for temp and humidity from files

        int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.println (temperature[n]); //debug statement - uncomment to see values assignned to temperature
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                //System.out.println (humidity[n]);  //debug statement - uncomment to see values assignned to humidity
                n++;
        }
        inFileHumid.close();
        
        //PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete

        double t = 0.0;
        int h = 0;
        
        
        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
                t = temperature[n];
                h = humidity[n];
                
                hI[n] = -42.379 + 2.04901523*t + 10.14333127*h - .22475541*t*h - .00683783*t*t 
                      - .05481717*h*h +  .00122874*t*t*h +  .00085282*t*h*h - .00000199*t*t*h*h;
                
      
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }
        

        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;
        n = 0;
        for(double average : temperature)
        {
            tempSum += temperature[n];
            n++;
        }

        double tempAvg = tempSum/temperature.length;
        n = 0;
        for(double average2 : humidity)
        {
            humidSum += humidity[n];
            n++;
        }
        double humidAvg = humidSum/humidity.length;
        n = 0;
        for(double average3 : hI)
        {
            hISum += hI[n];
            n++;
        }
        double hiAvg = hISum/hI.length;
        n = 0;
        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.printf("                                   Heat Index: %15s \n ", location);
        System.out.println();


        System.out.println("                                               Months ");
        System.out.println();
        System.out.print("            ");
        for(String m : month)
        {
            System.out.printf("   %3.3s", m);
        }


        System.out.println("   Avg");
        System.out.println("******************************************************************************************");

        n = 0;
        System.out.print("Temp (F)      ");
        //for:each loop to print temperature
        for(double tempList : temperature)
        {
           System.out.printf("%2.1f  ", temperature[n]);
           n++;
        }
        //print average
        System.out.printf(" %2.1f", tempAvg);
        System.out.println();

        System.out.print("Humidity (%)   ");
        //for:each loop to print humidity
        n = 0;
        for(int humidList : humidity)
        {
            System.out.printf("%d    ", humidity[n]);
            n++;
        }
        System.out.printf("%2.0f", humidAvg);
        System.out.println();

        System.out.print("HI (F)        ");
        n = 0;
        //for:each loop to print HI
        for(double hIList : hI)
        {
            System.out.printf("%2.1f  ", hI[n]);
            n++;
        }
        System.out.printf(" %2.1f", hiAvg);
        System.out.println();
        System.out.println();
        
        //output to a txt file
        
        outFile.println("Heat Index Data:");
        
                for(n = 0; n < humidity.length; n++)
                {
                    
                    outFile.printf("%2.1f\n", hI[n]);
                }
        
        outFile.close();
        
        
        
    } //end main()
}//end HeatIndex
