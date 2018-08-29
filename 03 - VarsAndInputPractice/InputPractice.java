import java.util.Scanner;

public class InputPractice
{
    public static void main( String[] args )
    {
        final int CONSTANT = 12;  // "final" denotes a constant value
        
        int count = 42;     // positive or negative whole numbers
        double maxHeight = 70.2;   // decimal numbers
        String name = "Mr. Avis";  // String needs double quotes
        char grade = 'A';   // char needs single quotes
        
        System.out.println( "count = " + count );
        System.out.println( "maxHeight = " + maxHeight );
        System.out.println( "name = " + name );
        System.out.println( "grade = " + grade );
        
        count = count + 5;
        count += 5;   // -=  and   *=   and   /=   also work
        count++;    // means   count = count + 1
        count--;    // means   count = count - 1
        System.out.println( "count now is [52]: " + count );
        
        System.out.println( "5/2 = " + (5/2) );
        System.out.println( "5/2.0 = " + (5/2.0) );
        
        grade += 5;
        System.out.println( "grade + 5 = " + grade );
        System.out.println( "grade + 5 = " + (int)grade );
        
        System.out.println( "max int = " + Integer.MAX_VALUE );
        System.out.println( "min int = " + Integer.MIN_VALUE );
        System.out.println( "max double = " + Double.MAX_VALUE );
        System.out.println( "min double = " + Double.MIN_VALUE );
        System.out.println( "max char = " + Character.MAX_VALUE );
        System.out.println( "min char = " + Character.MIN_VALUE );
        System.out.println( "max char as int = " + (int)Character.MAX_VALUE );
        System.out.println( "min char as int = " + (int)Character.MIN_VALUE );
        
        System.out.println( "max int + 1 = " + (Integer.MAX_VALUE + 1) );
        
        boolean isThere = true;   // or false
        
        
        // User input practice
        Scanner keyboard = new Scanner( System.in );
        System.out.print( "What is your name? " );
        String userName = keyboard.nextLine();
        System.out.print( "How many dogs do you have? " );
        int numDogs = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print( "What is your favorite color? " );
        String favColor = keyboard.nextLine();
        System.out.println( userName + " has " + numDogs + " dogs and likes " + favColor );
    }
}