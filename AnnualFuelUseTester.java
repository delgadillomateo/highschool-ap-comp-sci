
/**
 * A program designed to calculate annual fuel costs.
 * 
 * Mateo Delgadillo
 * December 19th
 */
public class AnnualFuelUseTester
{
    public static void printTable()
    {
        System.out.printf("%78s" ,"Gas Mileage Calculations\n");
        System.out.printf("%81s", "Note: each fill up is done weekly");
        System.out.printf("\n\n%2s", "Fill Up");
        System.out.printf("%18s", "Type of Car");
        System.out.printf("%17s", "Start Miles");
        System.out.printf("%15s", "End Miles");
        System.out.printf("%13s", "Distance");
        System.out.printf("%12s", "Gallons");
        System.out.printf("%10s", "Price");
        System.out.printf("%9s", "Cost");
        System.out.printf("%13s", "Miles/Gal");
        System.out.printf("%13s", "Gal/Mile\n");
        for(int i = 0; i < 126 ; i++)
        {
            System.out.print("=");
        }
        
    }
    
    public static void main(String [] Args)
    {
        printTable();        
        AnnualFuelUse myCar = new AnnualFuelUse("01 Honda Accord", 1, 131542, 131631, 5.2, 2.73);
        myCar.calcDistance(myCar.getStartMiles(), myCar.getEndMiles());
        myCar.calcMPG(myCar.getDistance(), myCar.getGallons());
        myCar.calcGPM(myCar.getDistance(), myCar.getGallons());
        myCar.calcTotalCost(myCar.getPricePerGallon(), myCar.getGallons());
        
        AnnualFuelUse car2 = new AnnualFuelUse("01 Honda Accord", 2, 131631, 131729, 5.6, 3.12);
        car2.calcDistance(myCar.getStartMiles(), car2.getEndMiles());
        car2.calcMPG(car2.getDistance(), car2.getGallons());
        car2.calcGPM(car2.getDistance(), car2.getGallons());
        car2.calcTotalCost(car2.getPricePerGallon(), car2.getGallons());
        
        AnnualFuelUse car3 = new AnnualFuelUse("01 Honda Accord", 3, 131729, 131806, 4.2, 2.81);
        car3.calcDistance(myCar.getStartMiles(), car3.getEndMiles());
        car3.calcMPG(car3.getDistance(), car3.getGallons());
        car3.calcGPM(car3.getDistance(), car3.getGallons());
        car3.calcTotalCost(car3.getPricePerGallon(), car3.getGallons());
        
        
        //print out the results
            System.out.printf("\n%4s", myCar.getFillUp());
            System.out.printf("%22s", myCar.getCarType());
            System.out.printf("%13d", myCar.getStartMiles());
            System.out.printf("%16d", myCar.getEndMiles());
            System.out.printf("%12d", myCar.getDistance());
            System.out.printf("%13.1f", myCar.getGallons());
            System.out.printf("%11.2f", myCar.getPricePerGallon());
            System.out.printf("%11.2f", myCar.getTotalCost());
            System.out.printf("%9.1f", myCar.getMPG());
            System.out.printf("%13.3f", myCar.getGPM());
            //second fuel up
            System.out.printf("\n%4s", car2.getFillUp());
            System.out.printf("%22s", car2.getCarType());
            System.out.printf("%13d", car2.getStartMiles());
            System.out.printf("%16d", car2.getEndMiles());
            System.out.printf("%12d", car2.getDistance());
            System.out.printf("%13.1f", car2.getGallons());
            System.out.printf("%11.2f", car2.getPricePerGallon());
            System.out.printf("%11.2f", car2.getTotalCost());
            System.out.printf("%9.1f", car2.getMPG());
            System.out.printf("%13.3f", car2.getGPM());
            //third fuel up
            System.out.printf("\n%4s", car3.getFillUp());
            System.out.printf("%22s", car3.getCarType());
            System.out.printf("%13d", car3.getStartMiles());
            System.out.printf("%16d", car3.getEndMiles());
            System.out.printf("%12d", car3.getDistance());
            System.out.printf("%13.1f", car3.getGallons());
            System.out.printf("%11.2f", car3.getPricePerGallon());
            System.out.printf("%11.2f", car3.getTotalCost());
            System.out.printf("%9.1f", car3.getMPG());
            System.out.printf("%13.3f", car3.getGPM());
        
            // calculate minimum and maximum and total of distance
        Integer[] distances = {myCar.getDistance(), car2.getDistance(), car3.getDistance()};
        System.out.println();
        int totalDist = myCar.getDistance() + car2.getDistance() + car3.getDistance();
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
         
        for (int index = 0; index < distances.length; index++ )
        {
            if (distances[index] < minDistance)
            {
                minDistance = distances[index];
            }
        }
        for (int index = 0; index < distances.length; index ++)
        {
            if (distances[index] > maxDistance)
            {
                maxDistance = distances[index];
            }
        }
        
        // calculate minimum and maximum and total of MPG
        double[] mpgs = {myCar.getMPG(), car2.getMPG(), car3.getMPG()};
        double minMPG = Integer.MAX_VALUE;
        double maxMPG = Integer.MIN_VALUE;
        for (int index = 0; index < mpgs.length; index++ )
        {
            if (mpgs[index] < minMPG)
            {
                minMPG = mpgs[index];
            }
        }
        for (int index = 0; index < mpgs.length; index ++)
        {
            if (mpgs[index] > maxMPG)
            {
                maxMPG = mpgs[index];
            }
        }
        // calculate minimum and maximum and total of Price
        double[] gasPrices = {myCar.getPricePerGallon(), car2.getPricePerGallon(), car3.getPricePerGallon()};
        double minPrices = Integer.MAX_VALUE;
        double maxPrices = Integer.MIN_VALUE;
        for (int index = 0; index < gasPrices.length; index++ )
        {
            if (gasPrices[index] < minPrices)
            {
                minPrices = gasPrices[index];
            }
        }
        for (int index = 0; index < gasPrices.length; index ++)
        {
            if (gasPrices[index] > maxPrices)
            {
                maxPrices = gasPrices[index];
            }
        }
        //totals
        double totalGallons = myCar.getGallons() + car2.getGallons() + car3.getGallons();
        double totalCost = myCar.getTotalCost() + car2.getTotalCost() + car3.getTotalCost();
        int projDistance = (totalDist/21) * 365;
        double projGallons = (totalGallons/21) * 365;
        double projCost = (totalCost/21) * 365;
        double projMPG = (myCar.getMPG() + car2.getMPG() + car3.getMPG())/3;
        System.out.println();
        System.out.println();
        System.out.printf( "%35s" ,"Minimum:");
        System.out.printf("%32d", minDistance);
        System.out.printf("%24.2f" , minPrices);
        System.out.printf("%20.1f" , minMPG);
        System.out.printf( "\n%35s" ,"Maximum:");
        System.out.printf("%32d", maxDistance);
        System.out.printf("%24.2f" , maxPrices);
        System.out.printf("%20.1f" , maxMPG);
        System.out.println();
        System.out.printf("\n%35s", "Total:");
        System.out.printf("%32d", totalDist);
        System.out.printf("%13.1f", totalGallons);
        System.out.printf("%22.2f", totalCost);
        System.out.printf("\n%35s" ,"Annual Projection:");
        System.out.printf("%32d", projDistance);
        System.out.printf("%13.1f", projGallons);
        System.out.printf("%22.2f", projCost);
        System.out.printf("%9.1f" , projMPG);
    }
}
