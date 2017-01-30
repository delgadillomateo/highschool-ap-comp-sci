
/**
 * This program works alongside CarV7 to calculate various statistics about specific cars fuel efficiencies.
 * 
 * Mateo Delgadillo
 * November 29th 2014
 */
public class CarV7Tester
{
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
        CarV7 myCar = new CarV7("01 Honda Accord", 131542, 131631, 5.2, 2.73);
        myCar.calcDistance(myCar.getStartMiles(), myCar.getEndMiles());
        myCar.calcMPG(myCar.getDistance(), myCar.getGallons());
        myCar.calcGPM(myCar.getDistance(), myCar.getGallons());
        myCar.calcTotalCost(myCar.getPricePerGallon(), myCar.getGallons());
        
        CarV7 car2 = new CarV7("14 Audi R8     ", 2367, 2542, 12, 3.12);
        car2.calcDistance(myCar.getStartMiles(), car2.getEndMiles());
        car2.calcMPG(car2.getDistance(), car2.getGallons());
        car2.calcGPM(car2.getDistance(), car2.getGallons());
        car2.calcTotalCost(car2.getPricePerGallon(), car2.getGallons());
        
        CarV7 car3 = new CarV7("14 Tesla Mode S", 1273, 1492, 2.5, 2.81);
        car3.calcDistance(myCar.getStartMiles(), car3.getEndMiles());
        car3.calcMPG(car3.getDistance(), car3.getGallons());
        car3.calcGPM(car3.getDistance(), car3.getGallons());
        car3.calcTotalCost(car3.getPricePerGallon(), car3.getGallons());
        //Tesla Model S (85kW-hr) used. Note that 1 gallon of gas is equivalent to 33.7 kW.
        
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
            //second car
            System.out.printf("\n%10s", car2.getCarType());
            System.out.printf("%11d", car2.getStartMiles());
            System.out.printf("%14d", car2.getEndMiles());
            System.out.printf("%10d", car2.getDistance());
            System.out.printf("%12.1f", car2.getGallons());
            System.out.printf("%9.2f", car2.getPricePerGallon());
            System.out.printf("%9.2f", car2.getTotalCost());
            System.out.printf("%10.1f", car2.getMPG());
            System.out.printf("%13.3f", car2.getGPM());
            //third car
            System.out.printf("\n%10s", car3.getCarType());
            System.out.printf("%11d", car3.getStartMiles());
            System.out.printf("%14d", car3.getEndMiles());
            System.out.printf("%10d", car3.getDistance());
            System.out.printf("%12.1f", car3.getGallons());
            System.out.printf("%9.2f", car3.getPricePerGallon());
            System.out.printf("%9.2f", car3.getTotalCost());
            System.out.printf("%10.1f", car3.getMPG());
            System.out.printf("%13.3f", car3.getGPM());
        
    }
}
