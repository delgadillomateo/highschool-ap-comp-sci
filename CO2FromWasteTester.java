/**
 * @purpose: Calculate the CO2 from household waste 8.11
 *
 * @author: Mateo Delgadillo
 * @version: December 29th 2014
 */
import java.util.ArrayList;

public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWaste> cO2 = new ArrayList<CO2FromWaste>();
           // add households to the arraylist
           cO2.add(new CO2FromWaste(2, true, false, false, true));   //2 people
           cO2.add(new CO2FromWaste(3, true, false, true, true));    //3 people
           cO2.add(new CO2FromWaste(5, false, true, true, false));   //5 people
           cO2.add(new CO2FromWaste(1, true, true, true, true));     //1 person
           cO2.add(new CO2FromWaste(8, false, false, false, true));  //8 people
           cO2.add(new CO2FromWaste(1, false, true, false, false));  //1 person
           cO2.add(new CO2FromWaste(5, true, false, false, true)); //1 person
           
       for(CO2FromWaste dataRecord : cO2)
       {
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteReduction();
       }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2FromWaste dataRecord;

       for(int index = 0; index < cO2.size(); index ++)
       {
           dataRecord = cO2.get(index);
           System.out.printf("|   %1d   |    %2d  |   %-5b  |  %-5b   |  %-5b  |  %-5b  |  %8.2f  |   %7.2f   |   %8.2f |%n", index, dataRecord.getNumPeople(), dataRecord.getPaper(), dataRecord.getPlastic(), dataRecord.getGlass(), dataRecord.getCans(), dataRecord.getEmissions(), dataRecord.getReduction(), dataRecord.getNetEmissions());
       }
   }
}
