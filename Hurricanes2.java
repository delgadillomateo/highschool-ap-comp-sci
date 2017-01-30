/**
 * Hurricane description: The purpose of this program is to assign the names of five
 * hurricanes to a String array and their corresponding categories
 * to a numeric array. The program prints out the name and
 * category of each hurricane and prints the average category.
 *
 * @author: Mateo Delgadillo
 * @version: October 11th, 2014
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
        //declare and initialize variables
        PrintWriter outFile = new PrintWriter(new File("Summary.txt"));
        
        int arrayLength = 59;
        int [] year = new int[arrayLength];                 //year of hurricane
        String [] month = new String[arrayLength];          //month of hurricane   
        int [] pressure = new int[arrayLength];             //pressure (to be converted into mb)
        int [] windSpeed = new int[arrayLength];            //windspeed (to be converted to mph)
        String [] name = new String[arrayLength];           //hurricane name
        int [] category = new int[arrayLength];             //category of the hurricane
        double [] mphWindspeed = new double [arrayLength];  //windspeed post conversion in MPH
        
        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);
        
        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windSpeed[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();

        
        //PROCESSING - calculate and convert values
        // convert windspeed from knots to MPH
        for(index = 0; index <= 58 ; index++)
        {
            mphWindspeed[index] = windSpeed[index] * 1.15078;
            
        }
        // determine category
        
        for(index = 0; index <= 58 ; index++)
        {
            if (mphWindspeed[index] >= 157)
                {
                    category[index] = 5;
                } else if (mphWindspeed[index] >=130)
                    {
                        category[index] = 4;
                    } else if (mphWindspeed[index] >= 111)
                        {
                            category[index] = 3;
                        } else if (mphWindspeed[index] >= 96)
                            {
                                category[index] = 2;
                            } else 
                                {
                                    category[index] = 1;
                                }
        }
        // count number of each category
        

        //Find min, max and average for category, windspeed and pressure
        //min
        Integer categoryMin = Integer.MAX_VALUE;
        for (index = 0; index < arrayLength; index++ )
        {
            if (category[index] < categoryMin)
            {
                categoryMin = category[index];
            }
        }

        Integer pressureMin = Integer.MAX_VALUE;
        for (index = 0; index < arrayLength; index++ )
        {
            if (pressure[index] < pressureMin)
            {
                pressureMin = pressure[index];
            }
        }
        
        Double windMin = Double.MAX_VALUE;
        for (index = 0; index < arrayLength; index++ )
        {
            if (mphWindspeed[index] < windMin)
            {
                windMin = mphWindspeed[index];
            }
        }
        //MAX
        Integer categoryMax = Integer.MIN_VALUE;
        for (index = 0; index < arrayLength; index++)
        {
            if (category[index] > categoryMax)
            {
                categoryMax = category[index];
            }
        }
        
        Integer pressureMax = Integer.MIN_VALUE;
        for (index = 0; index < arrayLength; index++)
        {
            if (pressure[index] > pressureMax)
            {
                pressureMax = pressure[index];
            }
        }
        
        Double windMax = Double.MIN_VALUE;
        for (index = 0; index < arrayLength; index++)
        {
            if (mphWindspeed[index] > windMax)
            {
                windMax = mphWindspeed[index];
            }
        }
        //avg
        double catSum = 0.0;
        double windSum = 0.0;
        double pressureSum = 0.0;
        index = 0;
        for (double average: category)
        {
            catSum += category[index];
            index++;
        }
        double catAvg = catSum/category.length;
        
        index = 0;
        for(double average1: mphWindspeed)
        {
            windSum += mphWindspeed[index];
            index++;
        }
        double windAvg = windSum / mphWindspeed.length;
        
        index = 0;
        for(double average2: pressure)
        {
            pressureSum += pressure[index];
            index++;
        }
        double pressureAvg = pressureSum/pressure.length;
        //System.out.println(catAvg + " space " + windAvg + " space " + pressureAvg); check
        //Output - print table using printf to format the columns
        

        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for (index = 0; index <= 58; index++)
        {
            System.out.printf("%4d", year[index]);
            System.out.printf("%12s",name[index]);
            System.out.printf("%10d", category[index]);
            System.out.printf("%16d", pressure[index]);
            System.out.printf("%19.0f", mphWindspeed[index]);
            System.out.println();
        }
        System.out.println("=====================================================================");
        //printing average
        System.out.printf("%s", "Average");
        System.out.printf("%19.0f", catAvg);
        System.out.printf("%16.0f", pressureAvg);
        System.out.printf("%19.0f", windAvg);
        System.out.println();
        //printing minimum
        System.out.printf("%s", "Minimum");
        System.out.printf("%19d",categoryMin);
        System.out.printf("%16d", pressureMin);
        System.out.printf("%19.1f", windMin);
        System.out.println();
        //printing maximum
        System.out.printf("%s", "Maximum");
        System.out.printf("%19d", categoryMax);
        System.out.printf("%16d", pressureMax);
        System.out.printf("%19.1f", windMax);
        System.out.println();
        
        //output to a txt file
        
        int cat1counter = 0;
        int cat2counter = 0;
        int cat3counter = 0;
        int cat4counter = 0;
        int cat5counter = 0;
        
        outFile.println("SUMMARY STATISTICS");
        
        for(index = 0; index < arrayLength; index++)
           {
              if(category[index] == 1)
              {
                cat1counter++;
                }
            }
            
        for(index = 0; index < arrayLength; index++)
           {
              if(category[index] == 2)
              {
                cat2counter++;
                }
            }
        
        for(index = 0; index < arrayLength; index++)
           {
              if(category[index] == 3)
              {
                cat3counter++;
                }
            }
            
        for(index = 0; index < arrayLength; index++)
           {
              if(category[index] == 4)
              {
                cat4counter++;
                }
            }
            
        for(index = 0; index < arrayLength; index++)
           {
              if(category[index] == 5)
              {
                cat5counter++;
                }
            }    
        
        outFile.printf("%s", "Number of Category 1 Hurricanes: ");  
        outFile.printf("%d", cat1counter);
        outFile.println();
        outFile.printf("%s", "Number of Category 2 Hurricanes: ");  
        outFile.printf("%d", cat2counter);
        outFile.println();
        outFile.printf("%s", "Number of Category 3 Hurricanes: ");  
        outFile.printf("%d", cat3counter);
        outFile.println();
        outFile.printf("%s", "Number of Category 4 Hurricanes: ");  
        outFile.printf("%d", cat4counter);
        outFile.println();
        outFile.printf("%s", "Number of Category 5 Hurricanes: ");  
        outFile.printf("%d", cat5counter);
        outFile.println();
        outFile.close();
        
    }//end main()
}//end Hurricanes2