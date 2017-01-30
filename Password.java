
/**
 * A program designed to generate a password according to the users preference of characters.
 * 
 * Mateo Delgadillo
 * September 12 2014
 */

import java.util.Scanner;
import java.util.Random;
public class Password
{
    public static void main (String Args[])
    {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        // Variables
        String password = "";
        
        String i ="                 Password Generation Menu                ";
        String a ="#########################################################";
        String b ="#   [1] Lowercase Letters                               #";
        String c ="#   [2] Lowercase and Uppercase Letters                 #";
        String d ="#   [3] Lowercase, Uppercase, and Numbers               #";
        String e ="#   [4] Lowercase, Uppercase, Numbers, and Punctuation  #";
        String f ="#   [5] Quit                                            #";
        String g ="#########################################################";
        System.out.println(i + "\n\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n");
        System.out.print("Please enter a number that corresponds to the menu above: ");
        int userInput = in.nextInt();
        
        if (userInput == 1)
        {
            System.out.print("Please select the length of your password:");
            int passLength = in.nextInt();
            for (int characters = 0; characters < passLength; characters ++)
             {
                   int randNum = ran.nextInt(25) + 97; 
                   boolean withinLimit = randNum >= 97 && randNum <= 122;
                   if (withinLimit = true)
                    {
                      char randChar = (char)randNum;
                      password += randChar;  
                    }
                   
             }
            System.out.println(password); 
        } else if (userInput == 2)
            {
                System.out.print("Please select the length of your password:");
                int passLength = in.nextInt();
                for (int characters = 0; characters < passLength; characters ++)
                {
                   double decidingNum = Math.random();
                   if (decidingNum > .5)
                   {
                       int randNum = ran.nextInt(25) + 65;
                       
                       char randChar = (char)randNum;
                       password += randChar;
                    } else if (decidingNum < .5)
                        {
                            int randNum2 = ran.nextInt(25) + 97;
                            
                            char randChar = (char)randNum2;
                            password += randChar;
                        }
                }
                System.out.println("\n" + password);
            } else if (userInput == 3)
                {
                    System.out.print("Please select the length of your password:");
                    int passLength = in.nextInt();
                    for (int characters = 0; characters < passLength; characters ++)
                    {
                       double decidingNum = Math.random();
                       boolean test = decidingNum < 0.33333333333333;
                       boolean test1 = (decidingNum > 0.33333333333333) && (decidingNum < 0.66666666666667);
                       boolean test2 = decidingNum > 0.66666666666667;
                       if (test)
                         {
                            int randNum = ran.nextInt(25) + 65;
                            
                            char randChar = (char)randNum;
                            password += randChar;
                          } else if (test1)
                              {
                                  int randNum2 = ran.nextInt(25) + 97;
                                  
                                  char randChar = (char)randNum2;
                                  password += randChar;
                               } else if (test2)
                                    {
                                        int randNum3 = ran.nextInt(9) + 48;
                                        
                                        char randChar = (char)randNum3;
                                        password += randChar;
                                    }
                    }
                    System.out.println("\n" + password);
                } else if (userInput == 4)
                    {
                        System.out.print("Please select the length of your password:");
                        int passLength = in.nextInt();
                        
                        for (int characters = 0; characters < passLength; characters ++)
                        {
                            double decidingNum = Math.random();
                            boolean test = decidingNum < 0.2;
                            boolean test1 = (decidingNum > 0.2) && (decidingNum < 0.4);
                            boolean test2 = (decidingNum > 0.4) && (decidingNum < 0.6);
                            boolean test3 = (decidingNum > 0.6) && (decidingNum < 0.8);
                            boolean test4 = decidingNum > 0.8;
                            if (test)
                                {
                                    int randNum = ran.nextInt(25) + 65;
                                    
                                    char randChar = (char)randNum;
                                    password += randChar;
                                } else if (test1)
                                    {
                                        int randNum2 = ran.nextInt(25) + 97;
                                        
                                        char randChar = (char)randNum2;
                                        password += randChar;
                                    } else if (test2)
                                        {
                                            int randNum3 = ran.nextInt(9) + 48;
                                            
                                            char randChar = (char)randNum3;
                                            password += randChar;
                                        } else if (test3)
                                            {
                                                int randNum4 = ran.nextInt(2) + 91;
                                                
                                                char randChar = (char)randNum4;
                                                password += randChar;
                                            } else if (test4)
                                                {
                                                    int randNum5 = ran.nextInt(2) + 123;
                                                    
                                                    char randChar = (char)randNum5;
                                                    password += randChar;
                                                }
                                }
                        
                         System.out.println(password); 
                    } else if (userInput == 5)
                        {
                            System.out.println("\nThank you and goodbye!\n");
                        } else 
                            {
                                System.out.println("Error: You did not select a valid number\nError: Please try again.");
                                
                            }
        
        
    }
}
