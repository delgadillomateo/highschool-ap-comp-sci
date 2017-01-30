
/**
 * CatapultTester: calculate the trajectory of a projectile based on launch angles and launch velocities.
 * 
 * @author Mateo Delgadillo 
 * @version December 30th 2014
 */
import java.util.*;

public class CatapultTester
{
    static final int ROWS = 7;      // speed in MPH from 20 - 80 
    static final int COLS = 7;   // angle from 0 - 90 degrees
  
    
    

    public static void main(String[] Args)
    {
        
        int [] myAngles = {15, 25, 30, 45, 60, 75, 80};
        int [] speed = {20, 30, 40, 50, 60, 70, 90};
    
        Catapult angulosVelocidad = new Catapult(myAngles,speed);
        double [] radians = angulosVelocidad.degreesToRadians(myAngles);
        double [] velocity = angulosVelocidad.mphToMetersPerSecond(speed);
        double [] [] results1 = angulosVelocidad.calcTrajectory(radians,velocity);
        double [] [] results = angulosVelocidad.calcMetersToFeet(results1);
        System.out.println("\t\t\tProjectile Distance (feet)");
        System.out.printf("%5s", "MPH");
        System.out.printf("%9s", "15 deg");
        System.out.printf("%9s", "25 deg");
        System.out.printf("%9s", "30 deg");
        System.out.printf("%9s", "45 deg");
        System.out.printf("%9s", "60 deg");
        System.out.printf("%9s", "75 deg");
        System.out.printf("%10s", "80 deg\n");
        System.out.println("======================================================================");
        
        for(int row = 0; row < ROWS; row ++)
         {
           System.out.printf("%5s ",speed[row]);
             for(int col = 0; col < COLS; col ++)
           {
               
               System.out.printf("%8.2f" + " " , results[row][col]);
           }
           System.out.println();
        }
    }
}    
    
