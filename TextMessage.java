
/**
 * Write a description of class TextMessageV1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextMessage
{
    public static void main(String [] Args)
    {
        //introduction / structuring
        String welcome = "Original Message: ";
        System.out.println(welcome);
        
        //original message and its length
        String originalMessage = "\they i will be late today and i will come back tomorrow hope that's ok i don't know, laughing out loud.";
        int messageLength = originalMessage.length();
        System.out.println(originalMessage);
        System.out.println("\t\tOriginal Message Length : " + messageLength + "\n");
        
        //replacing string values
        String newMessage1 = originalMessage.replaceAll( "late", "l8" );
        String newMessage2 = newMessage1.replaceAll( "today", "2day");
        String newMessage3 = newMessage2.replaceAll( "tomorrow", "2morro");
        String newMessage4 = newMessage3.replaceAll( "i don't know", "idk");
        String newMessageFinal = newMessage4.replaceAll( "laughing out loud", "lol");
        int newMessageLength = newMessageFinal.length();
        
        //new message and its length
        String welcome2 = "New Message: ";
        System.out.println(welcome2);
        System.out.println(newMessageFinal);
        System.out.println("\t\tNew Message Length : " + newMessageLength);
        
       //String method samples
       int indexNum = newMessageFinal.indexOf( "y" );
       System.out.println("\n" + " indexOf \"y\" :                                  " +  indexNum);
       int index2 = newMessageFinal.indexOf( "2" );
       System.out.println(" substring with two parameters:                 " + newMessageFinal.substring( 5 , (index2 + 4) ));
       System.out.println(" substring with one parameter:                  " + newMessageFinal.substring(30));
       System.out.println(" replaceAll :                              " + newMessageFinal.replaceAll( "i" , "I" ));
       
       
    }
}
