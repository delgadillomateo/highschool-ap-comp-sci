
/**
 * GradeV2 Assignment
 * Calculating Average Test Scores
 * 
 * @author Mateo Delgadillo 
 * @version June 17th 2014
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {
    //local variables
    int numTests = 0;   //counts number of tests
    int testGrade = 0;  //individual test grade
    int totalPoints = 0;//total points for all tests
    double average = 0.0; //average grade
    
    //calculate total average grades
    //first test
    testGrade = 97;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average); 
    
    //second test
    testGrade = 79;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    
    //third test
    testGrade = 83;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    
    //fourth test
    testGrade = 88;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    
    //Extra Tests
    //One
    testGrade = 98;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    //Two
    testGrade = 92;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    //Three
    testGrade = 100;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    //Four
    testGrade = 79;
    totalPoints += testGrade;
    numTests++;
    average = (double)totalPoints / numTests;
    System.out.println("Test: " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
    }
}
