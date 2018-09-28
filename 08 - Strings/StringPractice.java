public class StringPractice
{
    public static void main( String[] args )
    {
        // Create a string. You must have double quotes around a string.
        String str1 = "Computer Science";
        // String.length() returns an int that is how many characters are in the string.
        // Remember, character locations go from 0 to length-1
        int length = str1.length();
        System.out.println("str1 length is: " + length );
        
        // Loop through the string from start to finish and print each character on 
        // its own line.  Printing the string vertically.
        for( int i = 0; i < str1.length(); i++ )
        {
            System.out.println( str1.charAt( i ) );
        }
        
        // Loop through the string from back to front printing each character.
        // This prints the string backwards.
        for( int i = str1.length() - 1; i >= 0; i-- )
        {
            System.out.print( str1.charAt(i) );
        }
        System.out.println();
        
        // String.indexOf( char or string ) returns the location of the first
        // occurance of the char or string in the string.
        int spaceLoc = str1.indexOf(" ");
        System.out.println("First space is at location " + spaceLoc);
        int strLoc = str1.indexOf("ter");
        System.out.println("ter is at location " + strLoc);
        strLoc = str1.indexOf("zzzz");
        System.out.println("zzzz is at location " + strLoc);
        int charLoc = str1.lastIndexOf('e');
        System.out.println("last e is at location " + charLoc);
        
        // String.substring(x, y) returns the string starting at x and going until,
        // but not including, y.
        // String.substring(x) returns the string starting at x and going through the
        // end of the string.
        String sub1 = str1.substring(0, str1.indexOf(" "));
        String sub2 = str1.substring(str1.indexOf(" ")+1);
        System.out.println("sub1 is \'" + sub1 + "\'");
        System.out.println("sub2 is \'" + sub2 + "\'");
        
        String str2 = sub1 + sub2;
        System.out.println("str2 is " + str2 );
        
        // I may have mentioned it a time or two, but
        // DONT USE == TO COMPARE STRINGS
        // DONT USE == TO COMPARE STRINGS
        // DONT USE == TO COMPARE STRINGS
        // You must use String.equals() to compare strings.
        if( sub1.equals("Computer") )
        {
            System.out.println("I found a Computer");
        } else {
            System.out.println("No Computer");
        }
        
        // to make a char into a string
        char c = 'A';
        // String s = c;  #doesn't work because char is not a string
        String s = Character.toString(c);
    }
}










