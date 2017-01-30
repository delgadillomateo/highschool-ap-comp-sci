/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: (Mateo Delgadillo)
 * Date: (June 16th, 2014)
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      //number of feet per 1 mile
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable
        //Welcome
        System.out.println("******************* MEASUREMENT CONVERSION *******************");
        System.out.println("**                                                          **");
        System.out.println("**                   by: Mateo Delgadillo                   **");
        System.out.println("**                                                          **");
        System.out.println("******************* MEASUREMENT CONVERSION *******************");
        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 5;
        feet = miles * feetPerMile;
        System.out.println(miles + " mi. = " + feet + " ft.");
        
        double kilometers;
        double milesPerKilometer = 1.60934;
        double kilometersPerMile = 0.621371;
        
        //kilometers to miles
        kilometers = 20;
        miles = kilometers * kilometersPerMile;
        System.out.println(kilometers + " km. = " + miles + " mi.");
        
        //miles to kilometers
        miles = 15;
        kilometers = miles * milesPerKilometer;
        System.out.println(miles + " mi. = " + kilometers + " km.");
        
        double pound;
        double kilogram;
        double poundPerKilogram = 0.453592;
        double kilogramPerPound = 2.20462;
        
        //pound to kilogram
        pound = 50;
        kilogram = pound * poundPerKilogram;
        System.out.println(pound + " lb. = " + kilogram + " kg.");
        
        //kilogram to pound
        kilogram = 180;
        pound = kilogram * kilogramPerPound;
        System.out.println(kilogram + " kg. = " + pound + " lb.");
        
        double gallon;
        double liter;
        double literPerGallon = 0.264172;
        
        //gallon to liter
        gallon = 10;
        liter = gallon / literPerGallon;
        System.out.println(gallon + " Gal. = " + liter + " L.");
        
        //liter to gallon
        liter = 42;
        gallon = liter * literPerGallon;
        System.out.println(liter + " L = " + gallon + " Gal.");
        
        // extra conversion
        double days;
        double years;
        double daysPerYear = 365;
        
        //days to years
        days = 1000;
        years = 1000 / daysPerYear;
        System.out.println(days + " days = " + years + " years");
        //years to days
        years = 16;
        days = years * daysPerYear;
        System.out.println(years + " years = " + days + " days");
    }//end of main method
}//end of class
