
/**
 * PopulationRatio: a simulation of the male to female population in Colombia.
 * 
 * @author Mateo Delgadillo
 * @version July 18th 2014
 */
import java.util.Scanner;
public class PopulationRatio
{
    public static void main(String [] Args)
    {
        int males = 0;
        int females = 0;
        int counter = 1;
        double randomNumber = 0.0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is the population of Colombia? ");
        int pop = in.nextInt();
        
        while (counter <= pop)
        {
            randomNumber = Math.random();
            System.out.print(counter + "\t" + randomNumber);
            
            if (randomNumber < .494)
            {
                males ++;
                System.out.println("\t female");
            } else 
                {
                    females ++;
                    System.out.println("\t male");
                }
            counter ++;
        }
        System.out.println();       //aesthetics
        System.out.println("Male population: " + males);
        System.out.println("Female population: " + females);
    }
}
