
/**
 * This class tests CO2FootprintV1 class.
 * 
 * A single object is created to hold a single variable (gallons of gas).
 * 
 * The object is then manipulated using basic math to result in the Tons of CO2 and
 * pounds of CO2.
 * 
 * @author Mateo Delgadillo
 * @version December 25th 2014
 */
public class CO2FootprintV1Tester
{
    public static void printTable()
    {
        System.out.printf("\t%s","CO2 Emissions");
        System.out.printf("\n%s"," Gallons    Pounds    Tons");
        System.out.printf("\n%s"," of Gas    from Gas  from gas");
        System.out.printf("\n%s","==============================");
        
    }
    
    public static void main(String[] Args)
    {
        printTable();
        CO2FootprintV1 myGallons = new CO2FootprintV1(260.7);
        myGallons.calcTonsCO2(myGallons.getGallons());
        myGallons.convertTonsToPoundsCO2(myGallons.getTonsCO2());
        
        System.out.printf("\n %4.1f   ", myGallons.getGallons());
        System.out.printf("   %4.1f", myGallons.getPoundsCO2());
        System.out.printf("    %4.1f", myGallons.getTonsCO2());
    }
}