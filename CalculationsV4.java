
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * ©FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
       //Addition
        int iNum1 = 25;
        int iNum2 = 9;
        System.out.println("Addition");
        System.out.print(iNum1 + " plus " + iNum2 + " equals ");
        System.out.println(iNum1 + iNum2); //two integers
        
        //original decimals
        System.out.println("43.21 plus pi plus 5.0 equals " + (43.21 + 3.14 + 5.0) );
        System.out.println();
        //Subtraction
        int iNum3 = 16;
        int iNum4 = 9;
        int iNum5 = 25;
        System.out.println("Subtraction");
        System.out.print(iNum3 + " minus " + iNum4 + " minus " + iNum5 + " equals ");
        System.out.println(iNum3 - iNum4 - iNum5);
        
        //Decimals
        System.out.println("Pi minus 5 equals " + (3.14 - 5.0) );
        System.out.println();
        //Multiplication
        int iNum6 = 25;
        int iNum7 = 9;
        System.out.println("Multiplication");
        System.out.print(iNum6 + " times " + iNum7 + " equals ");
        System.out.println(iNum6 * iNum7);
        
        //Decimals
        System.out.println("Pi times 5 times 5 equals " + (3.14 * 5.0 * 5.0) );
        System.out.println();
        //Division
        int iNumDiv1 = 9;
        int iNumDiv2 = 25;
        System.out.println("Division");
        System.out.print(iNumDiv1 + " Divided by " + iNumDiv2 + " equals ");
        System.out.println(iNumDiv1 / iNumDiv2);
        
        //Decimals
        System.out.println("43.21 divided by 5 equals " + (43.21 / 5.0) );
        System.out.println();
        //Modulus Operator
        int iNumMod1 = 16;
        int iNumMod2 = 9;
        System.out.println("Modulus");
        System.out.print(iNumMod1 + " modulus " + iNumMod2 + " equals ");
        System.out.println(iNumMod1 % iNumMod2);
        
        //Decimals
        System.out.println("5 modulus pi equals " + (5.0 % 3.14) );
        System.out.println();
        //Arithmetic Expressions (User Added)
        int NumExp1 = 4;
        int NumExp2 = 36;
        int NumExp3 = 20;
        int NumExp4 = 18;
        int NumExp5 = 9;
        
        System.out.println("Arithmetic Expressions from Mateo");
        System.out.print(NumExp1 + " plus " + NumExp2 + " divided by " + NumExp4 + " modulus " + NumExp5 + " equals ");
        System.out.println(NumExp1 + NumExp2 / NumExp4 % NumExp5);
        
        System.out.print(NumExp3 + " minus " + NumExp1 + " times " + NumExp2 + " plus " + NumExp4 + " equals ");
        System.out.println(NumExp3 - NumExp1 * NumExp2 + NumExp4);
        System.out.println();
        
        
        System.out.println("2.02 Lab Equations");
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.println("15 divided by 2.5 times -2 plus 10 / 5 equals " + ( 15 / 2.5 * -2 + 10 / 5 ) );
        // 234 minus (234 divided by 6 modulus 12) + 3
        System.out.println("234 minus (234 divided by 6 modulus 12) + 3 equals " + (234 - ( 234 / 6 % 12) + 3 ));
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.println("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) equals " + ((46.2 / 11) - 3 + 24 % ( 17 - 2 * 3 )));
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println("480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8 equals " + (480 / 10 / 12 + 200 * .5 - 20 % 8 ));
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class