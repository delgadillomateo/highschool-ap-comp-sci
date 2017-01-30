/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class RandomNumbers
{
  public static void main(String[] args)
  {
        int randNum = 0;
        Random randNumList = new Random();
        for(int n = 1; n <= 10; n++)
        {
            randNum = randNumList.nextInt(6);
            System.out.println(randNum + " "); 
        } 
 
  }
}
