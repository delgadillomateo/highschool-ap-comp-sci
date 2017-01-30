/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @ Mateo Delgadillo
 * @ July 14th 2014
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("[A] BMI");
        System.out.println("[B] Healthy Eating");
        System.out.println("[C] Food Pyramid");
        System.out.println("[D] Fitness Training");
        System.out.println("[E] Quit");
        System.out.println("Please Select a letter corresponding to a menu option: ");
        // provide menu item for BMR
        // provide menu item for Healthy Eating
        // provide menu item for Food Pyramid
        // provide menu item for Fitness Training
        // prompt user to enter A, B, C, D, or E: ");
        // accept user choice with a Scanner class method
        String choice = in.next();
        System.out.println();
        
        if(choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("Option A (BMI) was selected");
            
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
            System.out.println("Thank you for choosing this program.");
        }
        else if(choice.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            System.out.println("Option B (Healthy Eating) was selected");
            System.out.println();
            System.out.println("1. Start slow and make changes to your eating habits over time.");
            System.out.println("2. Water and exercise are just as important as eating healthy.");
            System.out.println("3. Try not to think of certain foods as \"off-limits.\"");
            System.out.println("4. Think smaller portions.");
            System.out.println("5. Take time to chew your food and enjoy mealtimes.");
            System.out.println("6. Eat breakfast, and eat smaller meals throughout the day.");
            System.out.println("7. Avoid eating at night.");
            System.out.println("8. Fill up on colorful fruits and vegetables.");
            System.out.println("9. Eat more healthy carbs and whole grains.");
            System.out.println("10. Limit sugar and salt.");
            System.out.println("Thank you for choosing this program.");
        }
        else if (choice.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            System.out.println("Option C (Food Pyramid) was selected");
            System.out.println("A food guide pyramid is a pyramid shaped guide of healthy foods divided");
            System.out.println("into sections to show the recommended intake for each food group.");
            System.out.println("Thank you for choosing this program.");
        }
        else if (choice.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            System.out.println("Option D (Fitness Training) was selected");
            System.out.println("Fitness training balances five elements of good health. Make sure your");
            System.out.println("routine includes aerobic fitness, muscular fitness, stretching, core");
            System.out.println("exercise and balance training.");
            System.out.println("Thank you for choosing this program.");
        }
        else if (choice.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            System.out.println("Option E (Quit) was selected");
            System.out.println("Thank you for choosing this program.");
        }
        else //default choice for an invalid entry
        {
            System.out.println("Oops, you did not choose a menu item! Please try again");
        }
        
    }
}