
/**
 * TDEE: calculate total dialy energy expenditure
 * 
 * @author Mateo Delgadillo
 * @version July 16th 2014
 */
import java.util.Scanner;
public class TDEE
{
   public static void main (String [] Args)
   {
       Scanner in = new Scanner(System.in);
       //variables and stuff
       double TDEE = 0;
       double resting = 1.0;
       double sedentary = 1.3;
       double light = 1.6;
       double moderate = 1.7;
       double veryActive = 2.1;
       double extremelyActive = 2.4;
       double activityFactor = 1.0;
       //name
       System.out.print("Name: ");
       String firstName = in.next();
       String lastName = in.next();
       //BMR
       System.out.print("BMR: ");
       int userBMR = in.nextInt();
       //Sex
       System.out.print("Sex (M or F): ");
       String userSex = in.next();
       //male female variations
       if (userSex.equalsIgnoreCase("M") || userSex.equalsIgnoreCase("male"))
       {
           
        } else if  (userSex.equalsIgnoreCase("F") || userSex.equalsIgnoreCase("female"))       
            {   
                light = 1.5;
                moderate = 1.6;
                veryActive = 1.9;
                extremelyActive = 2.2;
            } else
                {   
                    System.out.println("Please type your sex (e.g. \"M\" or \"F\" or \"male\" or \"female\"");
                }
       System.out.println();
       //activity levels
       System.out.println("Choose Your Activity Level From Below: ");
       System.out.println("[0] Resting (Sleeping, Reclining)");
       System.out.println("[1] Sedentary (Minimal Movement)");
       System.out.println("[2] Light (Sitting, Standing)");
       System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
       System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
       System.out.println("[5] Extremely Active (Full-Time Athlete, Heavy Manual Labor)");
       System.out.println();
       System.out.println("Please Enter The Number That Corresponds To Your Activity: ");
       int choice = in.nextInt();
       
       if (choice == 0)
       {
           TDEE = resting * userBMR;
           activityFactor = resting;
        } else if (choice == 1)
            {
                TDEE = sedentary * userBMR;
                activityFactor = sedentary;
            } else if (choice == 2)
                {
                    TDEE = light * userBMR;
                    activityFactor = light;
                } else if (choice == 3)
                    {
                        TDEE = moderate * userBMR;
                        activityFactor = moderate;
                    } else if (choice == 4)
                        {
                            TDEE = veryActive * userBMR;
                            activityFactor = veryActive;
                        } else if (choice == 5)
                            {
                                TDEE = extremelyActive * userBMR;
                                activityFactor = extremelyActive;
                            } else
                                {
                                    System.out.println("Please choose a number from 0-5 based on you level of activity");
                                }
       //TDEE rounding
       double finalTDEE = ((int)(TDEE * 10));
       double realFinalTDEE = finalTDEE / 10;
       System.out.println();        //aesthetics
       //calculations
       System.out.print(firstName + " " + lastName);
       System.out.print("\t" + "Gender: " + userSex);
       System.out.println();
       System.out.print("BMR: " + userBMR);
       System.out.print("\t" + "Activity Factor: " + activityFactor);
       System.out.println();
       System.out.println("TDEE: " + realFinalTDEE);
   }
}
