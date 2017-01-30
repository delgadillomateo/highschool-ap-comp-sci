/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate. (Updated to allow user input for conversions).
 *
 *
 * ©CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 * @Editor Mateo Delgadillo
 * June 25th 2014
 */

import java.util.Scanner;
public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;     // local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        Scanner pesoExchangeRate;
        pesoExchangeRate = new Scanner(System.in);
        System.out.print("Please enter the Mexican peso exchange rate from 1 USD:  ");
        double pesoExchangeRateUserInput = pesoExchangeRate.nextDouble();;       // local variable for exchange rate of US Dollars to Pesos (Scanner Method)
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here
        double yenSpent = 99939.75;
        //Yen Exchange Rate
        Scanner yenExchange;
        yenExchange = new Scanner(System.in);
        System.out.print("Please enter the Yen exchange rate from 1 USD:  ");
        double yenExchangeRate = yenExchange.nextDouble();
        double dollarsSpentInJapan = 0.0;
        double eurosSpent = 624.95;
        double euroExchangeRate = 0.737994;
        double dollarsSpentInEurope = 0.0;
        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        //CONVERSION RATES  PROVIDED BY EXCHANGERATE.COM
        
        
        // conversion for Mexican pesos
        dollarsSpentInMexico = pesosSpent * pesoExchangeRateUserInput;
        remainingUsDollars = startingUsDollars - dollarsSpentInMexico;
        // conversion for Japanese yen
        dollarsSpentInJapan = yenSpent / yenExchangeRate;
        remainingUsDollars -= dollarsSpentInJapan;
        // conversion for Euros
        dollarsSpentInEurope = eurosSpent / euroExchangeRate;
        remainingUsDollars -= dollarsSpentInEurope;
        

        //print output to the screen
        System.out.println("Starting US Dollars: " + startingUsDollars);
        System.out.println("US dollars spent in Mexico: " + dollarsSpentInMexico);
        System.out.println("US dollars spent in Japan: " + dollarsSpentInJapan);
        System.out.println("US dollars spent in France: " + dollarsSpentInEurope);
        System.out.println("======================================================");
        System.out.println("Remaining US dollars: " + remainingUsDollars);
        System.out.println();
        System.out.println();
        
        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 4;                          //cost per item of first souvenir
        int budget1 = 50;                           //budget for first item
        int totalItem1 = (int) (budget1 / costItem1);         //how many items can be purchased
        double fundsRemaining1 = (budget1 % costItem1);  //how much of the budget is left
        
        //to get the items that can be purchased it's the budget divided by the cost 
        //funds remaining can be found by subtracting the budget by the cost of the totalItems
        //can't use subtraction, add negative value instead
        
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);

        //Calculations for Souvenir #2
        double costItem2 = 32.55;                       //cost per item of second souvenir
        int budget2 = 713;                              //budget for second item
        int totalItem2 = (int) (budget2 / costItem2);     //how many items can be purchased
        double fundsRemaining2 = budget2 / costItem2;   //how much of the budget is left
        
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
