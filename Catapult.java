
/**
 * Catapult: calculate the trajectory of a projectile based on launch angles and launch velocities.
 * 
 * @author Mateo Delgadillo
 * @version December 30th 2014
 */
public class Catapult
{
    
    private int [] speed1;
    private int [] myAngles1;
    private double [] [] trajectory = new double [7] [7];
    
    Catapult(int [] myAngles, int [] speed)
    {
        
    }
    
    public double [] degreesToRadians(int [] myAngless)
    {
        double [] radians = new double [7];
        for( int index = 0; index < 7; index++)
        {
            radians[index] = Math.toRadians(myAngless[index]);
        }
        return radians;
    }
    
    public double [] mphToMetersPerSecond(int [] speed)
    {
        double [] speedMeters = new double [7];
        for( int i = 0; i < 7; i++)
        {
            speedMeters[i] = speed[i] * 0.44704;
        }
        return speedMeters;
    }
    
    public double [][] calcTrajectory(double [] radians, double [] velocity)
    {
        //use Math.sin(radianshere) and Math.toRadians(degrees here)
        //gravity is 9.8 m/s
        
        for(int row = 0; row < 7; row++)
        {
            
            for(int col = 0; col < 7 ; col ++)
            {
                trajectory[row][col] = ((Math.pow(velocity[row],2)) * (Math.sin(2 * radians[col])))/(9.8);
            }
    
        }
        return trajectory;
    }
    
    public double [] [] calcMetersToFeet(double [] [] results1)
    {
        double [] [] realResults = new double [7] [7];
        for(int row = 0; row < 7; row++)
        {
            
            for(int col = 0; col < 7 ; col ++)
            {
                realResults[row][col] = results1[row][col] * 3.2808;
            }
    
        }
        return realResults;
    }
    
}
