/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author: Mateo Delgadillo
 * @version: December 29th 2014
 */
import java.util.ArrayList;
public class CO2FromElectricity
{
   private double avgBill1;
   private double avgPrice1;
   private double billSum;
   
   
   //constructor to create an object from class
   CO2FromElectricity()
   {
       
   }
   //calculates the average annual electricity bill
   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       billSum = 0.0;
       for(int i = 0; i < monthlyBill.size(); i++)
            billSum += monthlyBill.get(i);
       avgBill1 = billSum/monthlyBill.size();
       return avgBill1;
   }
   //calculates the average annual price of electricity per kilowatt hour
   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
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
}
