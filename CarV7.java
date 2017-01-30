
/**
 * Calculate the fuel economy of specific vehicles
 * 
 * Mateo Delgadillo
 * November 29th 2014
 */
public class CarV7
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
    public CarV7( String carType, int sMiles, int eMiles, double gallons, double pricePerGallon )
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
    
}
