
/**
 * Write a description of class BasalMetabolicRate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BasalMetabolicRate
{
   public static void main (String [] Args)
   {
       //Scanner Method
       Scanner in = new Scanner(System.in);
        //name, user input
       System.out.print("Name: ");
       String name = in.next();
        //sex, user input
       System.out.print("Sex (M or F): ");
       String userSex = in.next();
       System.out.println();
        //age, user input
       System.out.print("Age: ");
       int age = in.nextInt();
        //Height, user input
       System.out.print("Height (inches): ");
       String userHeight = in.next();
       int height = Integer.parseInt(userHeight);
        //Weight, user input
       System.out.print("Weight (pounds): ");
       String userWeight = in.next();
       int weight = Integer.parseInt(userWeight);
       System.out.println();        //blank space for aesthetics
       //CONVERSIONS
       double heightCentimeters = height * 2.54;
       double weightKilograms = weight * 0.453592;
       double BasalMetabolicRate = (88.362) + (13.397 * weightKilograms) + (4.799 * heightCentimeters) - (5.677 * age);
       if (userSex.equalsIgnoreCase("M"))
            BasalMetabolicRate = BasalMetabolicRate;
       else 
            BasalMetabolicRate = (447.593) + (9.247 *weightKilograms) + (3.098 * heightCentimeters) - (4.330 * age);
       //rounding weight height and bmr
       //TAKE THE EXTENDED DECIMAL AND MULTIPLY BY 10 THEREFORE EXTENDING IT FURTHUR, CUT OFF THE REST BY CASTING 
       //INTO AN INTEGER, THEN MULTIPLY BY 100 AS A DOUBLE
       double heightCentimetersFinal = (double)((int)((heightCentimeters * 10)) / 10);
       double weightKilogramsFinal = (double)((int)((weightKilograms * 10))) / 10;
       double BasalMetabolicRateFinal = (double)((int)((BasalMetabolicRate * 10))) /10;
       //output results
       System.out.println("Calculating Your Basal Metabolism...");
       System.out.println();        //blank space for aesthetics
       System.out.println("Name: " + name);
       System.out.println("Sex: " + userSex);
       System.out.println("Age: " + age);
       System.out.println("Height (Centimeters): " + heightCentimetersFinal);
       System.out.println("Weight (kilograms): " + weightKilogramsFinal);
       System.out.println("Your Basal Metabolic Rate: " + BasalMetabolicRateFinal + " calories per day");
       System.out.println();
    }
}
