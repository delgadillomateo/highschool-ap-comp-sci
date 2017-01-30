
/**
 * Write a description of class CO2FootprintTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CO2FootprintTester
{
    public static void main(String[] Args)
    {
       // Waste emissions and recycling
       ArrayList<CO2Footprint> cO2 = new ArrayList<CO2Footprint>();
            //households
       cO2.add(new CO2Footprint(1, false, false, false, false, 1,  40));  //1 person
       cO2.add(new CO2Footprint(2, true , false, false, false, 5,  72));
       cO2.add(new CO2Footprint(3, false, true , true , false, 8,  63));
       cO2.add(new CO2Footprint(4, true , true , true , true, 10, 36));
       cO2.add(new CO2Footprint(1, false, false, false, true , 3,  22));
       CO2Footprint dataRecord;
       //double emissionsFromWaste = dataRecordRecord.getEmissions();
       //end of waste and recycling part
       //  Electricity CO2 Emissions and cost
       double gallons;
       
        double gallonsUsed[]=new double [cO2.size()];
        for(int index = 0; index < cO2.size(); index++)
        {
             dataRecord = cO2.get(index);
             gallons = dataRecord.calcTonsCO2();
             gallonsUsed[index]= dataRecord.calcPoundsCO2(gallons);
         }
        double bulbs[]=new double [cO2.size()];
        for(int index = 0; index < cO2.size(); index++)
         {
             dataRecord=cO2.get(index);
             
             bulbs[index]= dataRecord.lightbulbReduction();
         }
            double wastes[]=new double [cO2.size()];
         for(int index = 0; index < cO2.size(); index++)
        {
          dataRecord=cO2.get(index);
          dataRecord.calcGrossWasteEmission();
          dataRecord.calcWasteReduction();
       
          dataRecord.calcNetWasteReduction();
        }
       int size=12;
       double bills[] = new double [size];
       double prices[] = new double [size];
       double CO2s[] = new double [cO2.size()];
       double bill = 0;
       double price = 0;
          for(int index = 0; index < cO2.size(); index++)
        {
          for(int i = 0; i < 12; i ++)                                  
          {
            bill = (double)(Math.random() * 100)+201;                   //random number from 0 - 99             
                   bills[i]=bill;                                       //inserts the first random number into the first ArrayList                             
            price = (double)(Math.random() * 1000)+2001; 
            price = bill/price*1000;                                     //second random number from 0 - 99
            prices[i] = price;                                            //inserts the second random number into the second ArrayList
          }
          double totalPrice=0;
          int i;
          for ( i = 0; i<12 ; i++)
            {
                totalPrice = totalPrice + prices[i];
           
            }
          
            double averagePrice = totalPrice / (i+1);
            double totalBill = 0;
      
       
            for ( i = 0; i<12 ; i++)
            {
                totalBill = totalBill + bills[i];
           
            }
            double averageBill = totalBill / (i+1);
       
          CO2s[index] = averageBill * averagePrice * 16.44;
        }
        
        double footprint[]=new double [cO2.size()];
                for(int index = 0; index < cO2.size(); index++)
        {
          dataRecord = cO2.get(index);
          footprint[index] = dataRecord.getNetEmissions() + CO2s[index] + gallonsUsed[index] - bulbs[index];
        }
        
       /**
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
       double avgBill = CO2Footprint.calcAverageBill(monthlyBill);
       double avgPrice = CO2Footprint.calcAveragePrice(monthlyPrice);
       double emissions = CO2Footprint.calcElectricityCO2(avgBill, avgPrice);
       **/
       //end of electricity 
       //CO2 from gasoline based on annual fuel consumption
       /**
       CO2Footprint myGallons = new CO2Footprint(260.7);
        myGallons.calcTonsCO2(myGallons.getGallons());
        myGallons.convertTonsToPoundsCO2(myGallons.getTonsCO2());
       double poundsCO2FromGas = myGallons.getPoundsCO2();
       double tonsCO2FromGas = myGallons.getTonsCO2();
       double gallonsUsed = myGallons.getGallons();
       **/
       //end of CO2 based on annual gas usage.
       //Incandescent light bulbs 
       
       
       System.out.println("|              Pounds of CO2             |      Pounds of CO2      |             |");
       System.out.println("|              emmitted from             |      Reduced from       |             |");
       System.out.println("|                                        |                         |     CO2     |");
       System.out.println("|   Gas    |    Electricity   |  Waste   | Recycling |  New Bulbs  |  Footprint  |");
       System.out.println("|----------|------------------|----------|-----------|-------------|-------------|");
       for (int index = 0; index < cO2.size(); index++)
       {
           dataRecord = cO2.get(index);
           System.out.printf("|%9.2f |%17.2f |%9.2f |%10.0f |%12.2f |%12.2f |\n", gallonsUsed[index], CO2s[index], dataRecord.getMyNetEmissions(), dataRecord.getMySavings() ,bulbs[index], footprint[index]); 
       }
    }
}
