
/**
 * 4.05 Body Mass Index; calculates body mass index based off users height and weight
 * 
 * @author Mateo Delgadillo
 * @version July 14, 2014
 */

import java.util.Scanner;

public class BMI
{
    public static void main (String [] Args)
    {
     Scanner in = new Scanner(System.in);       //import Scanner 
     // user name (first and last)
     System.out.print("Enter your name (first last): ");
     String firstName = in.next();
     String lastName = in.next();
     //user weight
     System.out.print("Enter your weight in pounds (e.g. 175): ");
     String userWeightString = in.next();
     int userWeight = Integer.parseInt(userWeightString);
     double weight1 = (int)((userWeight * 0.453592) * 10);
     double weight = weight1 / 10;
     //user height
     System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
     String userFeet = in.next();
     String extraInchesString = in.next();
     int feet = Integer.parseInt(userFeet);
     int extraInches = Integer.parseInt(extraInchesString);
     int feetInInches = feet * 12;
     int totalHeightInches = feetInInches + extraInches;
     //inches to meters conversion
     double height1 = (int)((totalHeightInches * 0.0254) * 10);
     double height = height1 / 10;
     //body mass index
     double BMI1 = (int)(weight / (height * height) * 10);
     double BMI = BMI1 / 10;
     //if else if statements
     String status = "normal";
     if (BMI < 18.5)
        status = "underweight";
     else if (BMI <= 24.9)
        status = "normal";
     else if (BMI <=29.9)
        status = "overweight";
     else if (BMI > 30)
        status = "obese";
     
     //     FINAL   RESULTS
     System.out.println();                      // blank lines for aesthetics.
     System.out.println("Body Mass Index Calculator");
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
     System.out.println(firstName + " " + lastName);
     System.out.println("Height (m): " + height);
     System.out.println("Weight (kg): " + weight);
     System.out.println("BMI: " + BMI);
     System.out.println("Category: " + status);
     System.out.println();
    }
}
