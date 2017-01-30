
/**
 * 4.03 Target Zone project: Calculate target heart rate.
 * 
 * 
 * @author Mateo Delgadillo
 * @version July 10th, 2014
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String target = "within";
        Scanner in = new Scanner(System.in);
        
        //Prompt user for input
        
            //age
        System.out.print("Age: ");
        String userAge = in.next();
        int ageNum = Integer.parseInt(userAge);

            //resting heart rate
        System.out.print("Resting Heart Rate: ");
        String userHeartRate = in.next();
        int heartRateNum = Integer.parseInt(userHeartRate);
            
            //heart rate after exercising
        System.out.print("Heart Rate after Exercising: ");
        String userPostHeartRate = in.next();
        int postHeartRateNum = Integer.parseInt(userPostHeartRate);
        
        //Calculate heart rate target zone min and max
        int maximumHeartRate = (220 - ageNum);
        int heartRateReserve = maximumHeartRate - heartRateNum;
        double lowHeartRate = (heartRateReserve * 0.50) + heartRateNum;
        double highHeartRate = (heartRateReserve * 0.85) + heartRateNum;
        
        //Determine if heart rate after exercise is between the min and max
        boolean heartRateIndicatorBelow;
        
        boolean heartRateIndicatorAbove;
        
        heartRateIndicatorBelow = heartRateNum <= lowHeartRate;  //below target heart rate?
        
        heartRateIndicatorAbove = heartRateNum >= highHeartRate; //above target heart rate?
        
        //If the heart rate is below, change the value of target to "below".
        if (heartRateIndicatorBelow)
            target = "below";
        System.out.println("Heart rate is " +target);
        //If the heart rate is above, change the value of target to "above".
        if (heartRateIndicatorAbove)
            target = "above";
        
        //Print two output statements
        
        //The first stating the heart rate target zone
        System.out.println("Your target heart rate lies between: " + (int)lowHeartRate + " bpm and " + (int)highHeartRate + " bpm");
        
        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. The variable "target" will have a value of within, above or below
        System.out.println("Your heart rate is " + target + " the targeted heart rate.");
        
        System.out.println();
    } //end main
}//end class TargetZone