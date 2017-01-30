
/**
 * This program demonstrates how to accept user input as a String
 * with the next() method, then convert the String into a double value
 * or an int value
 * 
 * ©FLVS 2007 
 * @author B. Jordan 
 * @version 03/07/07
 */
import java.util.Scanner;           //import methods of the Scanner class
public class ParsePractice
{
    public static void main(String[ ] args)
    {
        //declare local variables
        String userInput;           //user input as String
        double doubleValue;         //String converted to double     
        double doubleAnswer = 0;    //answer to calculation with doubleValue
        
        int intValue;               //String converted to int
        int intAnswer;              //answer to calculation with int
        
        //construct a Scanner object called in
        Scanner in = new Scanner(System.in);
        
        //parse a String to a double
        System.out.println("Enter a decimal value: ");                                          //request user to enter a decimal number
        userInput = in.next();                                                                  //input accepted as a String
        System.out.println("Try to add the userInput variable: " + (userInput + userInput));    //try to add the userInput variable      
        doubleValue = Double.parseDouble(userInput);                                            //String parsed to a double
        System.out.println("Try to add the parsed input: " + (doubleValue + doubleValue));      //try to add the parsed input data
        System.out.println();
        
        
        //parse a String to an int
        System.out.println("Enter an integer value: ");                                         //request user to enter a decimal number
        userInput = in.next();                                                                  //input accepted as a String
        System.out.println("Try to add the userInput variable: " + (userInput + userInput));    //try to add the userInput variable      
        intValue = Integer.parseInt(userInput);                                                 //String parsed to a double        
        System.out.println("Try to add the parsed input: " + (intValue + intValue));   //print answer to arithmetic expression
        
        
        //testing
        //date
        System.out.print("Enter the date checked out (mm/dd/yyyy): ");
        Scanner userInputDate = new Scanner(System.in);
        String date = userInputDate.next();
        System.out.println();
     
        //variables for date
        int intMonth;
        int intDay;
        int intYear;
        //date evaluation for concluding the days late
        String month = date.substring( 0 , 2 );
        intMonth = Integer.parseInt(month);
     
        String day = date.substring( 3 , 5 );
        intDay = Integer.parseInt(day);
     
        String year = date.substring( 6 );
        intYear = Integer.parseInt(year);
        
        //current date
        //variables
        int curMonth;
        int curDay;
        int curYear;
        
        String currentDate = "07/01/2014";
        
        String currentMonth = currentDate.substring( 0 , 2 );
        curMonth = Integer.parseInt(currentMonth);
        
        String currentDay = currentDate.substring( 3 , 5 );
        curDay = Integer.parseInt(currentDay);
        
        String currentYear = currentDate.substring( 6 );
        curYear = Integer.parseInt(currentYear);
        
        //calculations
        //months calculated into days approximately
        int monthDifference = curMonth - intMonth;
        int monthInDays = (monthDifference * 30);   //month turned to days
        
        //days 
        int dayDifference = curDay - intDay;
        
        //years calculated to days
        int yearDifference = curYear - intYear;     //year difference
        int yearsToMonths = (yearDifference * 12);  //years to months
        int yearMonthsToDays = (yearsToMonths * 30);//the months from the years turned to days
        //total days late
        int totalDaysLate = (yearMonthsToDays + monthInDays + dayDifference ); //adding total days late
        //print the total days late
        System.out.println("Book overdue by" + totalDaysLate + "days");
        
    }//end of main method
}//end of class