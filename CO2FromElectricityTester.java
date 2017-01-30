/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author: Mateo Delgadillo
 * @version: December 29th 2014
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
   public static void main(String[] args)
   {
        CO2FromElectricity CO2 = new CO2FromElectricity();

        ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
        ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);
        //monthly bill
        monthlyBill.add(0, 250.60);
        monthlyBill.add(1, 198.68);
        monthlyBill.add(2, 183.49);
        //monthly price
        monthlyPrice.add(0, 1687.0);
        monthlyPrice.add(1, 989.0 );
        monthlyPrice.add(2, 1236.0);
        // Values to add to the monthly Price or use your own:
        // (209.70 / 2464), (249.68 / 2948), (222.59 / 2621)


       double avgBill = CO2.calcAverageBill(monthlyBill);
       double avgPrice = CO2.calcAveragePrice(monthlyPrice);

       double emissions = CO2.calcElectricityCO2(avgBill, avgPrice);

       System.out.printf("Average Monthly Electricity Bill: %6.2f%n", avgBill);
       System.out.printf("Average Monthly Electricity Price: %4.2f%n", avgPrice);
       System.out.printf("Annual CO2 Emissions from Electricity Usage:   %7.1f pounds", emissions);
   }
}
