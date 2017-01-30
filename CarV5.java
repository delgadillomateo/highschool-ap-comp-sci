
/**
 * Calculate the fuel economy of a vehicle for one fill-up.
 * 
 * Mateo Delgadillo
 * November 25th 2014
 */
public class CarV5
{
    private String carType1;
    private int sMiles1;
    private int eMiles1;
    private int dist1;
    private double MPG1;
    private double GPM1;
    private double gallons1;
    private double pricePerGallon1;
    private double totalCost1;
    //new object
    public CarV5( String carType, int sMiles, int eMiles, double gallons, double pricePerGallon )
    {
         carType1 = carType;
         sMiles1 = sMiles;
         eMiles1 = eMiles;
         gallons1 = gallons;
         pricePerGallon1 = pricePerGallon;
    }
    
    public String getCarType()
    {
        return carType1;
    }
    
    public int getStartMiles()
    {
        return sMiles1;
    }
    
    public int getEndMiles()
    {
        return eMiles1;
    }
    
    public double getGallons()
    {
        return gallons1;
    }
    
    public double getPricePerGallon()
    {
        return pricePerGallon1;
    }
    //calculate distance
    public void calcDistance(int sMiles, int eMiles)
    {
        dist1 = Math.abs(eMiles1-sMiles1);
    }
    public int getDistance()
    {
        return dist1;
    }
    //calculate MPG
    public void calcMPG(int dist, double gallons)
     {
        MPG1 = dist/gallons;
     }
    public double getMPG()
    {
        return MPG1;
    }
    //calculate gallon per mile
    public void calcGPM(int dist, double gallons)
    {
        GPM1 = gallons/dist;
    }
    public double getGPM()
    {
        return GPM1;
    }
    //calculate total cost
    public void calcTotalCost(double gallons, double pricePerGallon)
    {
        totalCost1 = pricePerGallon * gallons;
    }
    public double getTotalCost()
    {
        return totalCost1;
    }
    
    //print results
    public static void printTable()
    {
        System.out.printf("%53s" ,"Gas Mileage Calculations\n");
        System.out.printf("\n%12s", "Type of Car");
        System.out.printf("%17s", "Start Miles");
        System.out.printf("%13s", "End Miles");
        System.out.printf("%11s", "Distance");
        System.out.printf("%11s", "Gallons");
        System.out.printf("%8s", "Price");
        System.out.printf("%8s", "Cost");
        System.out.printf("%13s", "Miles/Gal");
        System.out.printf("%13s", "Gal/Mile\n");
        for(int i = 0; i < 108 ; i++)
        {
            System.out.print("=");
        }
        
    }
    
    
    public static void main(String [] Args)
    {
        printTable();        
        CarV5 myCar = new CarV5("01 Honda Accord", 131542, 131631, 5.2, 2.73);
        myCar.calcDistance(myCar.getStartMiles(), myCar.getEndMiles());
        myCar.calcMPG(myCar.getDistance(), myCar.getGallons());
        myCar.calcGPM(myCar.getDistance(), myCar.getGallons());
        myCar.calcTotalCost(myCar.getPricePerGallon(), myCar.getGallons());
        //print out the results
            System.out.printf("\n%10s", myCar.getCarType());
            System.out.printf("%11d", myCar.getStartMiles());
            System.out.printf("%14d", myCar.getEndMiles());
            System.out.printf("%10d", myCar.getDistance());
            System.out.printf("%12.1f", myCar.getGallons());
            System.out.printf("%9.2f", myCar.getPricePerGallon());
            System.out.printf("%9.2f", myCar.getTotalCost());
            System.out.printf("%10.1f", myCar.getMPG());
            System.out.printf("%13.3f", myCar.getGPM());
        
    }
}
