 public class Person 
  { 
    private double myHeight; 
    private double myWeight; 
    private String myHair; 

    public Person( double height, double weight, String hair )  
    { 
      myHeight = height; 
      myWeight = weight; 
      myHair = hair; 
    } 

    public void sleep( int hours ) 
    { 
      for ( int i = 0 ; i < hours ; i++ ) 
        System.out.println( "Sleeping ... " ); 
    } 

    public void talk() 
    { 
      myWeight -= 0.01; 
      System.out.println( "Talking ... " ); 
    } 

    public void eat() 
    { 
      myWeight += 0.5; 
      System.out.println( "Eating ... " ); 
    } 

    public void walk( int meters ) 
    { 
      myWeight -= 0.05 * meters / 1000; 
      System.out.println( "Walking ... " ); 
    } 

    public void lecture() 
    { 
      for ( int i = 0 ; i < 10 ; i++ ) 
      { 
        talk(); 
      } 
    } 
    
    public void feast()
    {
        for ( int i = 0; i < 5 ; i++ )
        {
            eat();
            eat();
            talk();
        }
    }
    
    public double getWeight() 
    { 
      return myWeight; 
    } 

    public String getHair() 
    {   
      return myHair; 
    } 
    
    public static void main( String[] args )
    {
        Person eric = new Person( 1.57, 67.2, "brown" );
 
        eric.lecture();
 
        System.out.println( "Eric now weighs " + eric.getWeight() + "kg" );
    }
 
  } 