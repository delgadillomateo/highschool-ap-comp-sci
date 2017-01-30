
/**
 * CO2Footprint: A model of my individual CO2 production and reduction.
 * 
 * @author Mateo Delgadillo
 * @version December 29th 2014
 */
import java.util.*;

public class CO2Footprint
{
   private double avgBill1, avgPrice1, billSum, priceSum;
   private int myNumPeople, myBulbs, myGallons;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myEmissions, myReduction, myNetEmissions;
   private double myTonsCO2;
   private double myPoundsCO2;
   private double lightbulbReductions;
   CO2Footprint(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans, int numBulbs, int gallons)
   {
       myNumPeople = numPeople;
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       myBulbs = numBulbs;
       myGallons = gallons;
       myEmissions = 0.0;
       myReduction = 0.0;
       myNetEmissions = 0.0;
   }
   //electricity
   public  double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       billSum = 0.0;
       for(int i = 0; i < monthlyBill.size(); i++)
            billSum += monthlyBill.get(i);
       avgBill1 = billSum/monthlyBill.size();
       return avgBill1;
   }
   //calculates the average annual price of electricity per kilowatt hour
   public  double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
       double priceSum = 0.0;
       for(int i = 0; i < monthlyPrice.size(); i++)
            priceSum += monthlyPrice.get(i);
       
       avgPrice1 = billSum/priceSum;
       return avgPrice1;
   }
   //calculates the annual home CO2 emissions
   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
        return (avgBill/avgPrice) * 16.44;
   }
   //end of electricity
   //waste and recycling portion
   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public void calcGrossWasteEmission()
   {
        myEmissions = myNumPeople * 1018;
   }
   
   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       if(myPaper)
       {
           myReduction += (184.0 * myNumPeople);
       }

       if(myPlastic)
       {
           myReduction += (25.6 * myNumPeople);
        }
        
       if(myGlass)
       {
           myReduction += (46.6 * myNumPeople);
        }

       if(myCans)
       {
           myReduction += (165.8 * myNumPeople);
        }
   }

   public double getMySavings()
   {
       return myReduction;
    }
   
   /**
    * Mutator method to calculate the net emissions (no paramters)
    */
   public void calcNetWasteReduction()
   {
        myNetEmissions = myEmissions - myReduction;
   }

   public double getMyNetEmissions()
   {
       return myNetEmissions;
    }
   
   /**
    * Getter method to return the number of people (no paramters)
    */
   public int getNumPeople()
   {
       return myNumPeople;
   }

   /**
    * Getter method to return paper's recycled status (true or false) (no paramters)
    */
   public boolean getPaper()
   {
       return myPaper;
   }

   /**
    * Getter method to return glass's recycled status (true or false) (no paramters)
    */
   public boolean getGlass()
   {
       return myGlass;
   }

   /**
    * Getter method to return plastic's recycled status (true or false) (no paramters)
    */
   public boolean getPlastic()
   {
       return myPlastic;
   }

   /**
    * Getter method to return cans' recycled status (true or false) (no paramters)
    */
   public boolean getCans()
   {
       return myCans;
   }

   /**
    * Getter method to return the total emissions (no paramters)
    */
   public double getEmissions()
   {
       return myEmissions;
   }

   /**
    * Getter method to return the reduction amount (no paramters)
    */
   public double getReduction()
   {
       return myReduction;
   }

   /**
    * Getter method to return the net emissions (no paramters)
    */
   public double getNetEmissions()
   {
       return myNetEmissions;
   }
   
   public double lightbulbReduction()
   {
        lightbulbReductions = myBulbs * 1.37 * 73;
        return lightbulbReductions;
   }
   
    // gasoline emissions

    /**
     * Getter method to return the gallons used.
     * @return The amount of gas used in gallons.
     */
    public double getGallons()
    {
        return myGallons;
    }
    
    /**
     * Mutator method to calculate tons of CO2 based on gallons used.
     */
    public double calcTonsCO2()
    {
        double tons = (8.78 * Math.pow(10,-3)) * myGallons;
        myTonsCO2 = tons;
        return myTonsCO2;
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
    public double calcPoundsCO2(double myTonsCO2)
    {
        myPoundsCO2 = myTonsCO2 * 2000;
        return myPoundsCO2;
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

