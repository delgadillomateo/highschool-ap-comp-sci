
/**
 * Calculate the fuel economy of a vehicle for one fill-up.
 * 
 * Mateo Delgadillo
 * November 25th 2014
 */
public class CarV3
{
    CarV3()
    {
    }
    //calculate distance
    public static int[] calcDistance(int[] sMiles1, int[] eMiles1)
    {
        int[] dist = new int[3];
        for(int index = 0; index < 3; index++)
        {
            dist[index] = Math.abs(eMiles1[index]-sMiles1[index]);
        }
        return dist;
    }
    //calculate MPG
    public static double[] calcMPG(int[] dist, double[] gallons)
     {
        double[] MPG = new double[3];
         for(int index = 0; index < 3; index++)
        {
            MPG[index] = dist[index]/gallons[index];
        }
         return MPG;
     }
    //print results
    public static void printResults()
    {
        System.out.printf("%53s" ,"Gas Mileage Calculations\n");
        System.out.printf("\n%13s", "Type of Car");
        System.out.printf("%16s", "Start Miles");
        System.out.printf("%13s", "End Miles");
        System.out.printf("%13s", "Distance");
        System.out.printf("%13s", "Gallons");
        System.out.printf("%11s", "MPG\n");
        for(int i = 0; i < 79 ; i++)
        {
            System.out.print("=");
        }
        
    }
     
    public static void main(String [] Args)
    {
        printResults();
        String carType = "01 Honda Accord";
        int[] sMiles1 = new int[3];
        sMiles1[0] = 131542;
        sMiles1[1] = 131631;
        sMiles1[2] = 131729; 
        int[] eMiles1 = new int[3];
        eMiles1[0] = 131631;
        eMiles1[1] = 131729;
        eMiles1[2] = 131806; 
        int [] dist = calcDistance(sMiles1, eMiles1);
        double[] gallons = new double[3];
        gallons[0] = 5.2;
        gallons[1] = 5.6;
        gallons[2] = 4.2; 
        double [] MPG = calcMPG(dist, gallons);
        for(int index = 0; index < 3; index++)
        {
            System.out.printf("\n%10s", carType);
            System.out.printf("%11d", sMiles1[index]);
            System.out.printf("%14d", eMiles1[index]);
            System.out.printf("%12d", dist[index]);
            System.out.printf("%14.1f", gallons[index]);
            System.out.printf("%12.1f", MPG[index]);
        }
    }
}
