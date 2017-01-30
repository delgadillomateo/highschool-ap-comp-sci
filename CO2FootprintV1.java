/**
 * CO2FootprintV1Tester: Calculates the amount of Carbon Dioxide 
 * emitted for each gallon of gas consumed.
 * 
 * @author Mateo Delgadillo
 * @version December 25th 2014
 */
public class CO2FootprintV1
{
    private double myGallonsUsed;
    private double myTonsCO2;
    private double myPoundsCO2;
    
    /**
     * Constructor for the object of CO2FootprintV1.
     * @param gals the projected annual gallons of gas.
     */
    
    CO2FootprintV1(double gals)
    {
        myGallonsUsed = gals;
    }
    
    /**
     * Getter method to return the gallons used.
     * @return The amount of gas used in gallons.
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }
    
    /**
     * Mutator method to calculate tons of CO2 based on gallons used.
     */
    public void calcTonsCO2(double myGallonsUsed)
    {
        myTonsCO2 = (8.78 * Math.pow(10,-3)) * myGallonsUsed;
    }
    
    /**
     * Getter method to return the tons of CO2 calculated (no parameters).
     * @return amount of CO2 emitted in Tons
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }
    
    /**
     * Mutator method to convert the amount of CO2 emitted in tons to pounds.
     * 
     */
    public void convertTonsToPoundsCO2(double myTonsCO2)
    {
        myPoundsCO2 = myTonsCO2 * 2000;
    }
    
    /**
     * Getter method to return the amount of CO2 emitted in pounds.
     * @return amount of CO2 emitted in pounds.
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
    
}
